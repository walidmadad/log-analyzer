# Log Analyzer

## Overview
**Log Analyzer** is a Java-based application that simplifies the process of analyzing log files. It allows users to load log files, parse their content, filter logs based on severity (e.g., `INFO`, `WARNING`, `ERROR`), and generate meaningful statistics to understand system performance or troubleshoot issues effectively.

---

## Features
- **File Parsing:** Reads and parses log files in a standard format (e.g., `[DATE] [TYPE] MESSAGE`).
- **Log Filtering:** Filters logs by severity or keywords for focused analysis.
- **Statistics Generation:** Provides a summary of log entries categorized by severity.
- **Modular Design:** Clean and extensible code structure for future enhancements.

---

## Installation

### Prerequisites
- **Java Development Kit (JDK):** Version 11 or higher.
- **IDE (Optional):** IntelliJ IDEA, Eclipse, or any text editor.

### Clone the Repository
```bash
    git clone https://github.com/walidmadad/log-analyzer.git
    cd log-analyzer
```

### Compile and Run
- 1 Navigate to the **/src** directory in the project
- 2 Compile the Java files:
    ```bash 
    javac main/java/*.java
    ```
- 3 Run the application: 
    ```bash
    java main/java/LogAnalyzer
    ```
## Usage

### Sample Log Format 

Ensure the log file follows a format similar to this:

```text
    [2025-01-10 10:23:45] [INFO] Application started
    [2025-01-10 10:24:10] [WARNING] Disk space low
    [2025-01-10 10:25:00] [ERROR] Unable to connect to the database
    [2025-01-10 10:25:30] [INFO] User logged in
```

### Basic WorkFlow
- 1 Place the log file (e.g., sample.log) in the resources/ folder.
- 2 Run the application.
- 3 View logs, filter them by type (e.g., ERROR), and generate statistics.

## Project Structure

```text
log-analyzer/
├── src/
│   ├── main/
│   │   ├── java/
│   │   │   ├── LogAnalyzer.java      # Main application entry point
│   │   │   ├── FileManager.java      # Handles file operations
│   │   │   ├── LogParser.java        # Parses log entries
│   │   │   ├── LogFilter.java        # Filters logs by type
│   │   │   ├── LogStats.java         # Generates log statistics
│   │   └── resources/
│   │       └── sample.log            # Example log file
```

### Example Output
## Sample Log File
```text
[2025-01-10 10:23:45] [INFO] Application started
[2025-01-10 10:24:10] [WARNING] Disk space low
[2025-01-10 10:25:00] [ERROR] Unable to connect to the database
[2025-01-10 10:25:30] [INFO] User logged in
```

## Console Output
```vbnet
[2025-01-10 10:23:45] [INFO] Application started
[2025-01-10 10:24:10] [WARNING] Disk space low
[2025-01-10 10:25:00] [ERROR] Unable to connect to the database
[2025-01-10 10:25:30] [INFO] User logged in

Errors:
[2025-01-10 10:25:00] [ERROR] Unable to connect to the database

Statistics:
INFO: 2
WARNING: 1
ERROR: 1

```

## Future Enhancements
- **GUI Integration:** Implement a user-friendly interface with JavaFX.
- **Advanced Filtering:** Allow filtering by date range or custom keywords.
- **Exporting Reports:** Support exporting statistics and filtered logs to CSV or JSON.
- **Regex Support:** Enable users to define custom parsing rules using regular expressions.
- **Multithreading:** Optimize performance for large log files.

---

## Contribution
Contributions are welcome! If you’d like to enhance this project, follow these steps:
1. Fork the repository.
2. Create a feature branch:
   ```bash
   git checkout -b feature-name
   ```
3. Commit your changes:
    ```bash
    git commit -m "Add feature-name"
    ```
4. Push to the branch:
    ```bash
      git push origin feature-name
    ```
5. Open a pull request.

## License
This project is licensed under the MIT License. See the **LICENSE** file for more details.

## Contact 

For any questions or suggestions, feel free to contact:

- **Name**: Walid Madad
- **Email**: walidmadad@walid-madad.com