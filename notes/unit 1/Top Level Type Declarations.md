In JAVA, class name must always be the same as file name, but sometimes file contains multiple classes. Only single class(or interface) in file can be public, and it must have the same name as file. But how is the file name determined if it has multiple classes (or interfaces) that are not public?

```java
interface Foo {}

class Bar{}
```
Quoting the Java Language Specification, section 7.6 [Top Level Type Declarations](https://docs.oracle.com/javase/specs/jls/se7/html/jls-7.html#jls-7.6) :

> If and only if packages are stored in a file system (§7.2), the host system **may choose** to enforce the restriction that it is a compile-time error if a type is not found in a file under a name composed of the type name plus an extension (such as `.java` or `.jav`) if either of the following is true:
> 
> - The type is referred to by code in other compilation units of the package in which the type is declared.
>     
> - The type is declared `public` (and therefore is potentially accessible from code in other packages).
>     
> 
> _This restriction implies that there must be at most one such type per compilation unit. This restriction makes it easy for a Java compiler to find a named class within a package. In practice, many programmers choose to put each class or interface type in its own compilation unit, whether or not it is public or is referred to by code in other compilation units._

So, as you can see, it is not a requirement that "class name must always be the same as file name", as you said it.

It is simply a way to allow _some_ compilers an easy way to find the class source code during compilation.

But, more importantly, it also help **humans** find the source code. If you see a reference to class `com.example.Foo`, you know exactly where to find it, because it's going to be in file `com/example/Foo.java`.

Non-public (package private) top-level classes, can technically be placed in files of any name, and multiple such classes can be bundled in a single file, but that makes them difficult to find. For this reason, I've seen a guideline (don't remember where) that said that you should always put top-level classes in their own file, with one exception:

- If the non-public class is _only_ used by one other class, it's ok to place it in the same compilation unit (.java file) as that other class.

Basically this means that you should consider any top-level class, whose name is not the file name, to be "file-scoped", even though it's technically packages-scoped.