<!-- Keep a Changelog guide -> https://keepachangelog.com -->

# GoFrame Helper Changelog

## [Unreleased]

## [1.0.8] - 2024-11-26

### Updated

- Don't auto close Watch when throw Exception
- Removes the requirement for struct name to end with "Req" or "Res"
- Remove json support

### Fixed

- Uses ProcessBuilder intend of exec command on windows
- Builds error when the blank exists in rootProject.name
- Gets ORM field name [issue#24](https://github.com/oldme-git/GoFrame-Helper/issues/24)

## [1.0.7] - 2024-08-08

### Updated

- Support 242.*

### Fixed

- LiveTemplate: gf-srv-crud

## [1.0.6] - 2024-04-05

### Updated

- Support 241.*
- Support gdb.Onconflict

### Fixed

- FileWatch error on dir outside the project

### Added

- LiveTemplate: gf-srv-crud

## [1.0.5] - 2024-03-03

### Optimize

- Directory structure
- README.md

## [1.0.4] - 2024-01-24

### Added

- add http methods more
- cfg and i18n code jump

### Fixed

- Some ORM chain calls codes are not completion

### Optimize

- cfg and i18n code completion

## [1.0.3] - 2024-01-07

### Added

- i18n code completion

### Fixed

- File watch not available on Linux/Mac
- There is no "in" in OpenApi tag
- gfapicombo syntax error in live template

## [1.0.2] - 2023-12-27

### Added

- OpenApi v(gvalid),method and mime tagValue code completion

### Optimize

- OpenApi tag code completion

## [1.0.1] - 2023-12-20

### Fixed

- Fixed [issue#1](https://github.com/oldme-git/GoFrame-Helper/issues/1)

### Added

- gcfg code Completion json support
- Chinese UI
- Custom gf-cli path

## [1.0.0] - 2023-12-13

### Updated

- update some images and texts.

## [1.0.0-beta] - 2023-12-12

### Added

- gcfg code Completion(Currently only yaml is supported)
- GoFrame-Helper logo

### Optimize

- Compatible 222

## [1.0.0-alpha] - 2023-12-08

### Added

- OpenApi Tag code completion
- Orm code completion
- Api file watch
- Service file watch
- live template

[Unreleased]: https://github.com/oldme-git/goframe-helper/compare/v1.0.8...HEAD
[1.0.8]: https://github.com/oldme-git/goframe-helper/compare/v1.0.7...v1.0.8
[1.0.7]: https://github.com/oldme-git/goframe-helper/compare/v1.0.6...v1.0.7
[1.0.6]: https://github.com/oldme-git/goframe-helper/compare/v1.0.5...v1.0.6
[1.0.5]: https://github.com/oldme-git/goframe-helper/compare/v1.0.3...v1.0.5
[1.0.4]: https://github.com/oldme-git/goframe-helper/compare/v1.0.3...v1.0.4
[1.0.3]: https://github.com/oldme-git/goframe-helper/compare/v1.0.2...v1.0.3
[1.0.2]: https://github.com/oldme-git/goframe-helper/compare/v1.0.1...v1.0.2
[1.0.1]: https://github.com/oldme-git/goframe-helper/compare/v1.0.0...v1.0.1
[1.0.0]: https://github.com/oldme-git/goframe-helper/compare/v1.0.0-beta...v1.0.0
[1.0.0-alpha]: https://github.com/oldme-git/goframe-helper/commits/v1.0.0-alpha
[1.0.0-beta]: https://github.com/oldme-git/goframe-helper/compare/v1.0.0-alpha...v1.0.0-beta
