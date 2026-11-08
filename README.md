# Library Information System

A university Software Engineering project focused on designing and prototyping a web-based **Library Information System**. The project explores how students, lecturers, guests, and library administrators can access library information, discover books, manage personal reading lists, and support library borrowing activities.

> **Project status:** This repository contains project documentation and several implementation prototypes/drafts. The web UI prototype, Java console prototypes, and Go-based pulsa example are separate pieces of work; they are not currently integrated into one deployable application.

## Table of Contents

- [Project Overview](#project-overview)
- [Objectives](#objectives)
- [Target Users](#target-users)
- [Requirements and Planned Features](#requirements-and-planned-features)
- [Implementation Prototypes](#implementation-prototypes)
- [Technology Stack](#technology-stack)
- [Repository Structure](#repository-structure)
- [Getting Started](#getting-started)
  - [Web UI Prototype](#1-web-ui-prototype)
  - [Java Prototype — Draft 1](#2-java-prototype--draft-1)
  - [Java Prototype — Draft 2](#3-java-prototype--draft-2)
  - [Go Pulsa Example](#4-go-pulsa-example)
- [Project Documentation](#project-documentation)
- [Notes and Limitations](#notes-and-limitations)
- [Contributors](#contributors)

## Project Overview

The Library Information System is intended to provide an accessible way for library users to find book information and check which books are available to borrow. The project documentation describes a system for multiple user roles, including students, lecturers, guests, and administrators/library staff.

The repository records the design and implementation process through requirement and design documents, a web-based UI prototype, and Java application drafts.

## Objectives

- Make library book information easier to discover and access.
- Allow users to search for books and preview book details.
- Support user registration and login.
- Support library membership and book-borrowing workflows.
- Help administrators validate membership data and manage book information and availability.
- Provide a foundation for additional library-related features, such as borrowing history and educational mini-games.

## Target Users

| User role | Intended responsibilities |
|---|---|
| Student | Search and preview books, register for membership, and borrow and return books. |
| Lecturer | Search and preview books, register for membership, and borrow and return books. |
| Guest | Browse and preview available book information. |
| Administrator / Library Staff | Validate membership registrations, manage book records, and update book availability and borrowing records. |

## Requirements and Planned Features

The Software Requirements Specification (SRS) describes the following functional requirements and use cases:

- **Account access:** user registration, login, credential changes, and password recovery.
- **Book discovery:** browse and preview book information, and check book availability.
- **Borrowing:** submit borrowing requests and support book approval.
- **Membership:** apply for library membership and allow administrators to validate registration data.
- **Administration:** add books, update book status, and view book and member records.
- **Member history:** allow members to review their borrowing records.
- **Mini-games:** a proposed activity in which members answer questions and receive a score.

These items describe the intended system scope in the SRS. Not every requirement is implemented in the code included in this repository.

## Implementation Prototypes

### 1. Web UI Prototype

Located in `Implementasi Perangkat Lunak_UI Design/`, this is a React-based book-library prototype. The visible implementation includes:

- A landing page and navigation.
- Google sign-in through Firebase Authentication.
- Book search using the Google Books API.
- Book cards showing book information.
- A personal library where signed-in users can add and remove books.
- Express routes that read and update a user's library data in Cloud Firestore.

The prototype is based on React and Express and uses Firebase services. See the folder's source code and package manifests for implementation details.

### 2. Java Prototype — Draft 1

Located in `Library App Draft-1 Java code/LibraryApp/`, this Maven project demonstrates basic object-oriented modelling for a personal library.

The source includes the following domain classes:

- `Book` — book information.
- `User` — user information.
- `Status` — a reading status.
- `UserBook` — associates a user, a book, and its reading status.

The `LibraryApp` entry point creates sample users and books, associates them with reading statuses, and prints the sample data to the console.

### 3. Java Prototype — Draft 2

Located in `Library App Draft-2 Java code/`, this Maven project demonstrates a simple console-based login and book-list flow.

The source includes:

- A credential check using in-memory sample accounts.
- A login boundary and validator controller.
- A dashboard boundary.
- A book preview controller.
- A list-book controller with mock book data.

This is a learning/prototype implementation. Its sample credentials and book data are hard-coded; it is not connected to a production database.

### 4. Go Pulsa Example

The `pulsa/` directory contains a separate Go HTTP example with a small HTML interface for pulsa transfer, pulsa request, and balance checking. It is included in the repository but is not part of the Library Information System described in the SRS.

## Technology Stack

The repository contains prototypes using the following technologies:

| Technology | Usage in this repository |
|---|---|
| Java 17 | Maven-based console application drafts. |
| Maven | Java project build configuration. |
| JavaScript / React 16 | Web UI prototype. |
| Node.js / Express | Web prototype server and API routes. |
| Ant Design | React UI components. |
| Firebase Authentication | Google sign-in in the web UI prototype. |
| Cloud Firestore / Firebase Admin SDK | User library data in the web prototype. |
| Google Books API | Book search in the web UI prototype. |
| Go | Separate pulsa HTTP example. |
| HTML / CSS | Web prototype and pulsa example interfaces. |

## Repository Structure

```text
.
├── Implementasi Perangkat Lunak_UI Design/
│   ├── client/
│   │   ├── public/
│   │   └── src/
│   │       ├── components/
│   │       ├── css/
│   │       └── firebase.js
│   ├── server.js
│   ├── package.json
│   └── README.md
│
├── Library App Draft-1 Java code/
│   └── LibraryApp/
│       ├── pom.xml
│       └── src/main/java/
│
├── Library App Draft-2 Java code/
│   ├── pom.xml
│   └── src/main/java/
│
├── pulsa/
│   ├── index.html
│   ├── main.go
│   └── response.html
│
├── SDD OO IF 2023 - Group 3.pdf
├── SRS_Document_-_Progress_Checking_Group_3_IF-46-INT[1].pdf
└── README.md
```

## Getting Started

The following instructions apply to each prototype independently. They do not combine the separate projects into one application.

### 1. Web UI Prototype

**Prerequisites**

- Node.js and npm. The root package manifest specifies Node.js `12.x`; the project also uses older React tooling and dependencies.
- A Firebase project configured for Authentication and Cloud Firestore.
- A Firebase service-account credential file for the Express server.
- Google Books API access if you want to use the book-search integration.

**Installation**

Open a terminal and move to the web prototype directory:

```bash
cd "Implementasi Perangkat Lunak_UI Design"
npm install
cd client
npm install
```

**Configuration**

The server expects a Firebase Admin service-account file named `firestore.json` in the `Implementasi Perangkat Lunak_UI Design/` directory. The client also has Firebase configuration in `client/src/firebase.js`.

Configure these values with your own Firebase project credentials before running the prototype. Do not commit service-account credentials, private keys, or other secrets to Git.

**Run the server**

From `Implementasi Perangkat Lunak_UI Design/`:

```bash
node server.js
```

The server listens on:

```text
http://localhost:5000
```

**Run the React client**

In a second terminal:

```bash
cd "Implementasi Perangkat Lunak_UI Design/client"
npm start
```

The React development server will print its local URL in the terminal (commonly `http://localhost:3000`).

> The web prototype uses an older dependency set. Installation may require an environment compatible with its original Node.js and npm versions.

### 2. Java Prototype — Draft 1

**Prerequisites:** JDK 17 and Maven.

```bash
cd "Library App Draft-1 Java code/LibraryApp"
mvn clean package
mvn exec:java
```

The application prints sample users, books, and their reading statuses to the console.

### 3. Java Prototype — Draft 2

**Prerequisites:** JDK 17 and Maven.

```bash
cd "Library App Draft-2 Java code"
mvn clean package
mvn exec:java
```

When prompted, enter one of the sample accounts defined in `DatabaseController.java`:

| Username | Password |
|---|---|
| `student` | `password123` |
| `lecturer` | `lecturerpass` |

These credentials are hard-coded demonstration data and must not be used for a real authentication system.

### 4. Go Pulsa Example

**Prerequisites:** Go installed.

From the `pulsa/` directory:

```bash
go run main.go
```

Open the address printed in the terminal, normally:

```text
http://localhost:8080
```

This is a standalone example and is unrelated to the library prototype.

## Project Documentation

The repository includes the following design documents:

- **Software Requirements Specification (SRS):** `SRS_Document_-_Progress_Checking_Group_3_IF-46-INT[1].pdf` — describes the system scope, user roles, functional and non-functional requirements, and use-case scenarios.
- **Software Design Document (SDD):** `SDD OO IF 2023 - Group 3.pdf` — provides the design-document structure for architecture, detailed design, use-case realization, and class design.

## Notes and Limitations

- The repository contains multiple drafts and prototypes. Their features and data are not integrated into a single end-to-end system.
- The Java drafts use sample or in-memory data rather than a shared persistent library database.
- The web prototype requires Firebase configuration that is not included in the repository.
- The web prototype's Google Books API integration and Firebase configuration should be reviewed before deployment. Keep API keys and credentials out of public source control; rotate any exposed credentials.
- The SRS describes a broader intended feature set than the current prototype code implements.
- The `pulsa/` folder is a separate example project.

## Contributors

**Group 3 — Bachelor of Informatics, Telkom University**

Add or update the contributor names and roles here.

---

*This repository was developed as part of a Software Engineering course project.*
