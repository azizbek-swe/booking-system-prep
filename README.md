# booking-system-prep

Übungsprojekt zur Nachklausur-Vorbereitung für **Anwendungssysteme / Engineering verteilter Anwendungen** (TU Berlin, Nachklausur 2026-10-01). Jedes Modul übt gezielt einen Themenblock aus dem Kurs — Details und Zeitplan siehe `~/Desktop/AS/Exam-Study-Guide.md`.

*→ Учебный проект для подготовки к пересдаче по Anwendungssysteme. Каждый модуль тренирует один тематический блок курса.*

## Module

| Verzeichnis | Kursthema | Übt |
|---|---|---|
| `annotations-demo/` | Enterprise Programming | Custom Annotation + Reflection + DI + JUnit (Output-Tracing) |
| `xsd-booking/` | Data Management | XSD-Schema + valide/invalide XML-Instanzen von Hand schreiben |
| `persistence/` | Data Management | JPA-Entity + ACID (konkurrierender Buchungs-Testfall) |
| `grpc-service/` | Communication | `.proto` + Java-Server-Implementierung (`StreamObserver`) + Client |
| `rest-client/` (optional) | The Web | Kleiner REST-Aufruf gegen eine öffentliche API |
| `dockerize-grpc/` (optional) | Application Platforms | Dockerfile für `grpc-service` |

## Workflow

Jedes Modul entsteht auf einem eigenen Branch (`feature/<modul-name>`), mit ein paar kleinen Commits statt einem großen, dann Pull Request → Merge in `main`. Ziel: Git/GitHub-Workflow (`branch` → `commit` → `push` → `PR` → `merge`) nebenbei einüben, während der Stoff wiederholt wird.
