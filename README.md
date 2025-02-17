# Text Editor

This is a text editor implemented in c++. This is to build my skillset in c++.

## Getting Started

### Requirements

- Gradle version: `8.12.1`
- C++ Compiler:

  - Linux: install the `build-essential` package

  ```sudo apt-get update && sudo apt-get install build-essential

  ```

### Build

gradle build

## MVP Features

Iteration 1: Basic Editor Functionality

- File Operations:
  - Create a new file
  - Open an existing file
  - Save the current file
- Text Editing:
  - Basic text insertion and deletion
  - Cursor navigation using arrow keys
- User Interface:
  - Window to display an editor

Iteration 2: Enhanced Editing Controls

- Undo/Redo Functionality:
  - Implement undo to reverse recent changes
  - Implement redo to reapply changes that were undone
