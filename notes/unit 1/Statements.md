In Java, statements are executable units of code that perform specific actions.
## Types of statement

1. Expression Statements
2. Declaration Statements
3. Control Statements
	- Conditional Statements
	- Branching Statements
	- Loops
### Expression Statement
- **Assignment Statement:** Assigns a value to a variable.
```java
	age = 25;
```
- **Method Invocation Statement:** Calls a method.
```java 
	System.out.println("Hello, World!");
```
### Declaration Statements
- **Variable Declaration:** Declares a variable with a specified data type.

```java
	int age;
```
### Conditional Statements
Conditional statements in Java are used to make decisions in the code based on certain conditions. Java provides several conditional statements, including if, else, else if, and switch. Here's an overview:

- if Statement:
The if statement is used for basic conditional branching. If the specified condition is true, the block of code inside the if statement is executed.
```java 
int x = 10;
if (x > 5) {
	System.out.println("x is greater than 5");
}
```

- **if-else Statement:**
The if-else statement provides an alternative block of code to be executed if the condition in the if statement is false.
```java 
int y = 3;

if (y > 5) {
    System.out.println("y is greater than 5");
} else {
    System.out.println("y is not greater than 5");
}
```

- **else if Statement:**
The else if statement allows you to check multiple conditions sequentially. It is used when you have more than two possible outcomes.
```java 
int z = 7;

if (z > 10) {
    System.out.println("z is greater than 10");
} else if (z > 5) {
    System.out.println("z is greater than 5 but not 10");
} else {
    System.out.println("z is 5 or less");
}
```

- **switch Statement:**
The switch statement is used for multiple branching based on the value of an expression. It provides a cleaner alternative to a sequence of if-else if statements.
```java 
int dayOfWeek = 3;

switch (dayOfWeek) {
    case 1:
        System.out.println("Monday");
        break;
    case 2:
        System.out.println("Tuesday");
        break;
    // ... other cases ...
    default:
        System.out.println("Invalid day");
}
```
### Branching Statement

Branching statements in Java are used to control the flow of a program by altering the normal sequence of execution. Java provides three main branching statements: break, continue, and return.
- **break Statement:**
The break statement is used to terminate the loop or switch statement. When encountered, it causes the program to exit the loop or switch, and the control is transferred to the statement immediately following the loop or switch.
```java 
for (int i = 0; i < 5; i++) {
    if (i == 3) {
        break; // exit the loop when i equals 3
    }
    System.out.println(i);
}
```

- **continue Statement:**
The continue statement is used to skip the rest of the code inside a loop for the current iteration and proceed to the next iteration of the loop.
```java 
for (int i = 0; i < 5; i++) {
    if (i == 2) {
        continue; // skip the rest of the loop for i equals 2
    }
    System.out.println(i);
}
```
- **return Statement:**
The return statement is used to exit a method and return a value. It can also be used to terminate the execution of a program in the main method.
```java 
public int add(int a, int b) {
    int sum = a + b;
    return sum; // exit the method and return the sum
}
```
### Loops
Loops in Java are used to execute a block of code repeatedly until a specified condition is met. Java provides several types of loops, including for, while, and do-while loops.

- for Loop:
The for loop is used when the number of iterations is known in advance. It consists of three parts: initialization, condition, and update.
```java 
for (int i = 0; i < 5; i++) {
    System.out.println(i);
}
```

- while Loop:
The while loop is used when the number of iterations is not known in advance. It repeats a block of code as long as the specified condition is true.
```java 
int i = 0;
while (i < 5) {
    System.out.println(i);
    i++;
}
```

- do-while Loop:
The do-while loop is similar to the while loop, but it guarantees that the block of code is executed at least once because the condition is checked after the loop body.
```java 
int i = 0;
do {
    System.out.println(i);
    i++;
} while (i < 5);
```

- Enhanced for Loop (for-each):
The enhanced for loop is used for iterating over elements of arrays or collections.

```java
int[] numbers = {1, 2, 3, 4, 5};
for (int num : numbers) {
    System.out.println(num);
}
```
- Infinite Loop:
An infinite loop is a loop that continues to execute indefinitely. Be cautious while using loops to avoid unintentional infinite loops.

```java
while (true) {
    // code here
}
```





