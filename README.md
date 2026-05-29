# HR Management System MVP
This is my Java assignment for the HR Management System MVP. It shows basic OOP concepts like encapsulation, inheritance, and polymorphism, and it includes a GitHub Actions pipeline for the bonus marks.
## How the Code Works
The project uses a single file named HRSystemApp.java:
- Encapsulation: The variables inside the Employee class are private or protected so they can't be changed directly from the outside. I used getters and setters, and added a check in setSalary to block negative numbers.
- Inheritance: Manager and Developer are child classes that extend the main Employee class. They get all the common traits like name and ID automatically but also have their own specific fields.
- Polymorphism: I overloaded calculateBonus to handle different types of inputs, and I overrode displayInfo in the subclasses so that a simple loop through an Employee array can print out the correct details dynamically at runtime.
## Automated Review Pipeline
I also set up a workflow file inside .github/workflows/pr-review.yml for the bonus 3 marks. 
When anyone creates a Pull Request, GitHub automatically spins up an environment to test the code. It installs JDK 17, compiles the file to look for syntax errors, and runs the program to verify the output logic. If the code breaks or has errors, the pipeline stops the merge.
## Running the Project
You can compile and run it from the terminal using:
javac HRSystemApp.java
java HRSystemApp
