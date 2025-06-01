# Java Memory Management – Assignment 2

This project demonstrates basic memory management in Java using object creation, dereferencing, and manual garbage collection suggestion. It also includes a deliberate delay to allow observation via memory profiling tools like VisualVM.

## Objective

- Understand how Java handles memory allocation and garbage collection.
- Demonstrate string object allocation and dereferencing.
- Enable memory profiling using tools like VisualVM.

## Key Concepts

- **Heap Allocation**: Strings created using `new String()` are allocated on the heap.
- **Garbage Collection**: Setting a reference to `null` and calling `System.gc()` suggests cleanup.
- **Profiling Readiness**: `Thread.sleep()` is used to pause program execution for memory profiling.

## Files

- `memory_assignment2.java` — Main Java file demonstrating memory management.

## How to Run

1. Compile the file:

   ```bash
   javac memory_assignment2.java
