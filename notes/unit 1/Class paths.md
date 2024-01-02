In Java, the classpath is a parameter that tells the Java Virtual Machine (JVM) where to look for user-defined classes and packages. It essentially specifies the locations where the JVM should search for compiled bytecode (.class files) and other resources when executing a Java program.

Here are some key points about the classpath in Java:

1. **Default Classpath:**
    - If you don't explicitly set a classpath, Java uses a default classpath that includes the current directory (where your program is executed) and the core Java libraries.
2. **Setting Classpath:**
      - The classpath can be set using the `-cp` or `-classpath` option when running Java applications. You can specify directories, JAR files, or ZIP files containing class files.
	```bash
	java -cp directory:jarfile MainClass
	```
3. **Multiple Entries:**
        - Multiple entries in the classpath are separated by a colon (":") on Unix/Linux systems or a semicolon (";") on Windows.
	```bash 
	java -cp dir1:dir2:dir3 MainClass
	```
4. **Classpath Environment Variable:**
    - You can also set the `CLASSPATH` environment variable to specify the default classpath for Java applications.
	```bash 
	export CLASSPATH=dir1:dir2:dir3
	```
5. **Relative and Absolute Paths:**
    - Classpath entries can be specified as relative or absolute paths. Relative paths are resolved relative to the current working directory.
6. **Wildcards:**
    - Wildcards (*) can be used in the classpath to include all JAR files in a directory. For example:
	```bash 
	java -cp "lib/*" MainClass
	```
7. **Dynamic Classpath in Java Code:**
     - You can modify the classpath programmatically in your Java code using `URLClassLoader` for dynamic loading of classes.
	 ```java
	 URLClassLoader classLoader = new URLClassLoader(new URL[]{new URL("file:/path/to/directory/")});
	 ```

Understanding and managing the classpath is crucial, especially in complex Java applications with dependencies. It ensures that the JVM can locate the necessary classes and resources during runtime.


### Sample Program

To demonstrate the use of classpath lets use following code snippets.
