
## OBJECTIVES:-

- Write, compile and run Java programs.
- Declare and define classes and objects
- Declare fields, methods, and constructors
- Read input from commandline

## 1. Install and set environment variables

In Linux variants like Ubuntu, we do not have to set PATH environment variable explicitly after installing the Java Development Kit (JDK) using the package manager. The package manager usually takes care of adding the necessary paths to the system's environment configuration.

But on windows, it is necessary that we set the PATH environment variable so that we can run Java-related commands and compile Java programs from the command prompt without specifying the full path to the Java executables each time.

```
https://www.youtube.com/watch?v=FVxKbAukRxk
```
## General syntax of java program:

```java 
access-specifier class ClassName{
	// fields
	fieldType fieldName;

	// methods
	public returnType methodName(){
		statements;
	}
}
```


1. Now, write your code in a text-editor (e.g. vscode, sublime text, notepad++):
```java
	//filename Hello.java
	class Hello{
		public static void main(String args[]){
			System.out.println("Hello! Java Programming");
		}
	}
```
1. Save the program in Desktop/code/ folder with the name Hello (same as the name of class ) and Extension (.java) for e.g. Hello.java
3. In order to compile and run the program, use javac and java commands as shown below.
```bash
	javac Hello.java
	java Hello
```

After you compile the program using javac, it converts the java source code into binary program consisting of byte codes.
```bash
	javac Hello.java
```

If the program contains no errors, the compiler generates a _byte code program ( .class file)_ from your source file. The compiler stores the byte code program in a file with the same name as source file, but with the extension .class.
The Java interpreter inspects the byte code and checks it to ensure that the security restrictions are met and then execute the program within the java virtual machine.

```bash
	java Hello
```

If there is no exception in the program the output is printed on the command prompt as shown above.

System.out.print command in java is same as cout in C++. System.out.println command is
similar to System.out.print but also prints a newline as well. Run the following programs and
observe the output.


**Program#2 : WAP to demonstrate Class called Motorbike. Provide its
properties and behavior ( method) as well.**


**Program#**
Program to read an integer from console and display it

**Modify this program so that you can input two integers and display the
sum.**


**Program#**
Write a program with a class which saves the data for a bank account.


**Program#**
Write a program to count the number of instances of a class using class variable(i.e. static variable).


**Program#**
Write a program that reads two numbers from the command line, the number of hours worked by an
employee and their base pay rate. Add warning messages if the pay rate is less than the minimum wage
(12.5 an hour ) or if the employee worked more than the number of hours in a week.

_Compile: <javac Salary.java>
Run: <java Salary 30 50>_


