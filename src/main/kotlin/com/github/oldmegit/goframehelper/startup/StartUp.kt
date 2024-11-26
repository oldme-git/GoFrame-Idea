package com.github.oldmegit.goframehelper.startup

import com.github.oldmegit.goframehelper.data.Bundle
import com.github.oldmegit.goframehelper.gf.GfGoMod
import com.intellij.openapi.progress.ProgressIndicator
import com.intellij.openapi.progress.ProgressManager
import com.intellij.openapi.progress.Task
import com.intellij.openapi.project.Project
import com.intellij.openapi.startup.ProjectActivity

class StartUp : ProjectActivity {
    override suspend fun execute(project: Project) {
        val taskTitle = Bundle.getMessage("name")
        ProgressManager.getInstance().run(object : Task.Backgroundable(project, taskTitle) {
            override fun run(indicator: ProgressIndicator) {
                if (indicator.isCanceled) {
                    return
                }
                indicator.text = Bundle.getMessage("init")
                println(indicator.text)
                GfGoMod.reset(project)
                indicator.fraction = 1.0
            }
        })
    }
}