# Sorted Integer List Program  
### Module 4 - Assignment 01

## 1. Description

This program demonstrates the Java Collections Framework using `LinkedList` to store a series of integers entered by the user. Rather than sorting all values at the end, the program maintains the list in **sorted ascending order** as numbers are inserted.

## 2. Features

- Reads integer input from the console.
- Stores numbers in a `LinkedList<Integer>`.
- Maintains sorted order during insertion (no need for full sort at end).
- Handles invalid input (non-integer entries) gracefully.
- Terminates when the user enters `'q'`.

## 3. Java Collections Used

- **`java.util.LinkedList`** – Stores the integers as they're entered.
- **`java.util.ListIterator`** – Allows efficient insertion while maintaining order.
- **`java.util.Scanner`** – Captures user input from the console.

## 4. Method-Level Reuse

The `insertSorted()` method encapsulates the logic for inserting elements in a sorted order. This allows the sorting mechanism to be reused cleanly throughout the program if needed.

## 5. UML Diagram

A UML class diagram is provided in the file `diagram.pdf`.

## 6. How to Compile and Run

Make sure you're in the directory containing `SortedList.java`, then run the following commands in the terminal:

### To compile:

```bash
javac SortedList.java
```

### To Run:
```bash
java SortedList
```

### To generate Javadoc:
```bash
javadoc SortedList.java
```
