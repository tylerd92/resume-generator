# resume-generator

A small CLI tool that converts a JSON resume description into a plain-text resume file so you can focus on content instead of formatting.

This project is a Spring Boot + picocli command-line application that reads a JSON file describing your resume and writes a formatted text file.

## Features

- Read resume data from a JSON file (see `src/main/resources/testfile.json` for an example). 
- Convert the JSON into a simple, human-readable text resume.
- Specify an output file path (creates parent directories automatically). If no output path is provided, a file named `resume.txt` is created in the working directory.

## Prerequisites

- Java 17 (matches the project's `pom.xml`)
- Maven (or use the included Maven wrapper `mvnw` / `mvnw.cmd`)

## Running the tool

Two common ways to run the tool are using the Maven wrapper during development or running the packaged jar.

Windows (PowerShell or CMD) using the included Maven wrapper:

```powershell
# run using the Maven wrapper; adjust the json path and output path as needed
.\mvnw.cmd spring-boot:run -Dspring-boot.run.arguments="--jsonFile=src/main/resources/testfile.json --filePath=out/resume.txt"
```

Using the packaged jar (after building):

```powershell
# build first
.\mvnw.cmd package
# then run the jar
java -jar target\resume-generator-0.0.1-SNAPSHOT.jar --jsonFile=src/main/resources/testfile.json --filePath=out/resume.txt
```

Notes:
- The application accepts the following command-line options:
  - `--jsonFile` (required): Path to the input JSON file containing resume data.
  - `--filePath` (optional): Path to write the generated text resume. If omitted, `resume.txt` is used in the current directory.
- Paths can be relative or absolute. The program will create any missing parent directories for the output file.

## Example

The repository includes `src/main/resources/testfile.json` as a sample input. A minimal JSON must include `fullName`, `email`, and `phone`; other sections (objective, education, workHistory, projects, skills) are optional. See the included sample for structure and field names.




