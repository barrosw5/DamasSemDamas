# DamasSemDamas - Java Checkers Game

A desktop implementation of the classic Checkers game, featuring a graphical user interface and custom game logic developed in Java.

## Description

This project is a Java-based application that allows users to play Checkers locally. It was built using the Swing framework for the UI and follows an organized structure to separate game rules from visual representation. The application supports standard gameplay mechanics, local multiplayer interaction, and advanced features like board customization and session persistence.

Technical competencies demonstrated in this project include:
- Object-Oriented Programming (OOP): Clear separation between game logic, UI components, and data positioning.
- Event-Driven Programming: Handling user mouse interactions for piece selection and movement.
- Custom Game Engine: Implementation of checkers-specific rules, including valid move detection and piece capturing.
- File I/O: Capability to save and load game states for continuing matches later.
- Custom UI Components: Integration of graphical assets (PNGs) and dynamic board rendering.

## Features

- Local Multiplayer: Play against another person on the same machine.
- Game Persistence: Save your current progress to a file and load it at any time.
- Board Customization: Tools to create and modify board layouts for personalized gameplay.
- Visual Indicators: Clear graphical representation of the board, white pieces, and black pieces.
- Move Validation: Logic-based enforcement of game rules to ensure fair play.

## Technologies Used

- Java: Core programming language.
- Swing / AWT: Libraries used for building the Graphical User Interface (GUI).
- Eclipse/JDK: Development environment and standard libraries.

## How to Use

1. Ensure you have the Java Runtime Environment (JRE) installed on your system.
2. Clone the repository and navigate to the project folder.
3. Compile the source files located in the `src` directory.
4. Run the `View` class to launch the application.
5. Use the menu options to start a new game, load a saved session, or access the board editor.

## Project Structure

- `src/View.java`: Manages the main window, UI rendering, and user input events.
- `src/gameLogic.java`: Contains the core rules of Checkers, including turn management and move verification.
- `ProjetoDamas/`: Root directory containing project configuration and graphical assets (black.png, white.png).
- `bin/`: Compiled bytecode files for the application.
