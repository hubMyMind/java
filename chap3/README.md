=============================================== CHAPITRE 3 ========================================================================
Each new class you create becomes a new type that can be used to declare variables and create objects.
You can declare new classes as needed; this is one reason why Java is known as an extensible language.
A number that can contain a decimal point -> such number is called floating-point number.
A class’s instance variables maintain data for each object (that is, each instance) of the class. 
The keyword public is an access modifier.
Each public class declaration must be stored in a file having the same name as the class and ending with the .java filename extension.
Every class declaration contains the keyword class followed immediately by the class’s name.
Every class’s body is enclosed in a pair of left and right braces.
camel case naming scheme is the convention used for class, methos and variables names. Also by convention, class names begin with an initial uppercase letter, and method names and variable names begin with an initial lowercase letter.
Each object (instance) of the class has its own copy of the class’s instance variables.
Variables or methods declared with access modifier private are accessible only to methods of the class in which they’re declared.
Parameters are declared in a parameter list, which is located inside the parentheses that follow the method name in the method header. 
Local variables can be used only in that method.
Each method can access only its own local variables, not those of other methods. When a method terminates, the values of its local variables are lost.
A method’s parameters also are local variables of the method.

If a method contains a local variable with the same name as an instance variable, that method’s body will refer to the local variable rather than the instance variable. In this case, the local variable is said to shadow the instance variable in the method’s body.
The method’s body can use the keyword "this" to refer to the shadowed instance variable explicitly.
Keyword new creates a new object of the specified class.


Never use as a format-control a string that was input from the user. When method System.out.printf evaluates the format-control string in its first argument, the method performs tasks based on the conversion specifier(s) in that string. If the format-control string were obtained from the user, a malicious user could supply conversion specifiers that would be executed by System.out.printf, possibly causing a security breach. 

The default value for an instance variable of type String is null.
The number of arguments in a method call must match the number of parameters in the method declaration’s parameter list.
The argument types in the method call must be consistent with the types of the corresponding parameters in the method’s declaration.

UML diagrams help systems designers specify a system in a concise, graphical, programming-language-independent manner, before programmers implement the system in
a specific programming language.
--------------------------------
|            Class Name           <------ Top Compartment
--------------------------------
|– name : String                  <------ middle Compartment
--------------------------------
|«constructor» Account(name: String)
|+ setName(name : String)         <------ Bottom Compartment
|+ getName() : String
--------------------------------
Top Compartment:
In the UML, each class is modeled in a class diagram as a rectangle with three compartments. In this diagram the top compartment contains the class name centered horizontally in boldface type.

Middle Compartment
The middle compartment contains the class’s attribute name, which corresponds to the instance variable of the same name in Java. Instance variable name is private in Java, so the UML class diagram lists a minus sign (–) access modifier before the attribute name. Following the attribute name are a colon and the attribute type, in this case String. 

Bottom Compartment :
The bottom compartment contains the class’s operations, setName and getName, which correspond to the methods of the same names in Java. The UML models operations by
listing the operation name preceded by an access modifier, in this case + getName. This plus sign (+) indicates that getName is a public operation in the UML (because it’s a public method in Java). Operation getName does not have any parameters, so the parentheses following the operation name in the class diagram are empty.

Return Types
The UML indicates the return type of an operation by placing a colon and the return type after the parentheses following the operation name. The method getName has a String return type.

Parameters:
The UML models a parameter a bit differently from Java by listing the parameter name, followed by a colon and the parameter type in the parentheses after the operation name.

The static Method main is a special method that’s always called automatically by the Java Virtual Machine (JVM) when you execute an app.
A key part of enabling the JVM to locate and call method main to begin the app’s execution is the static keyword which indicates that main is a static method. 
A static method is special, because you can call it without first creating an object of the class in which the method is declared.

Classes in the same package are implicitly imported into the source-code files of other classes in that package.
Thus, an import declaration is not required when one class in a package uses another in the same package.

The class’s fully qualified class name : for example ==> java.util.Scanner 

Declaring instance variables with access modifier private is known as data hiding or information hiding. When a program creates (instantiates) an object of class, variable name is encapsulated (hidden) in the object and can be accessed only by methods of the object’s class. 

Generally, instance variables should be declared private and methods public.
The private instance variable is hidden inside the object and protected by an outer layer of public methods. Any client code that needs to interact with the object can do so only by calling the public methods.
Java’s types are divided into primitive types ( boolean, byte, char, short, int, long, float and double) and reference types.
All nonprimitive types are reference types, so classes, which specify the types of objects, are reference types.

A primitive-type variable can hold exactly one value of its declared type at a time. For example, an int variable can store one integer at a time. When another value is assigned to that variable, the new value replaces the previous one—which is lost. 

Primitive-type instance variables are initialized by default—instance variables of types byte, char, short, int, long, float and double are initialized to 0, and variables of type boolean are initialized to false. 
Primitive-type variables do not refer to objects, so such variables cannot be used to call methods. 

Programs use variables of reference types (normally called references) to store the addresses of objects in the computer’s memory. Such a variable is said to refer to an object in the program. Objects that are referenced may each contain many instance variables.
Account myAccount = new Account(); ==> creates an object of class Account, then assigns to the variable myAccount a reference to that Account object. Reference-type instance variables, if not explicitly initialized, are initialized by default to the value null—which represents a “reference to nothing.”  

Each class you declare can optionally provide a constructor with parameters that can be used to initialize an object of a class when the object is created. Java requires a constructor call for every object that’s created, so this is the ideal point to initialize an object’s instance variables.

A constructor must have the same name as the class. A constructor’s parameter list specifies that the constructor requires one or more pieces of data to perform its task.

An important difference between constructors and methods is that constructors cannot return values, so they cannot specify a return type (not even void). Normally, constructors are declared public.

In any class that does not explicitly declare a constructor, the compiler provides a default constructor (which always has no parameters).
When a class has only the default constructor, the class’s instance variables are initialized to their default values.

If you declare a constructor for a class, the compiler will not create a default constructor for that class.

A floating-point number is a number with a decimal point, such as 43.95, 0.0, –129.8873.
Java provides two primitive types for storing floating-point numbers in memory float and double. Variables of type float represent single-precision floating-point numbers and can hold up to seven significant digits. Variables of type double represent doubleprecision floating-point numbers. These require twice as much memory as float variables and can hold up to 15 significant digits—about double the precision of float variables.

Most programmers represent floating-point numbers with type double. In fact, Java treats all floating-point numbers you type in a program’s source code (such as 7.33 and 0.0975) as double values by default. Such values in the source code are known as floating point literals.

Every instance (i.e., object) of class contains its own copies of intance variable.

Format specifier %.2f :
The %f format specifier is used to output values of type float or double. The .2 between % and f represents the number of decimal places (2) that should be output to the right of the decimal point in the floating-point number—also known as the number’s precision.

Unlike instance variables (such as name and balance in class Account), local variables (like depositAmount in main) are not initialized by default, so they normally must be initialized explicitly. 

Replacing duplicated code with calls to a method that contains one copy of that code can reduce the size of your program and improve its maintainability.
 Java requires a constructor call for every object that’s created.
 Constructors can specify parameters but not return types.

If a class does not define constructors, the compiler provides a default constructor with no parameters, and the class’s instance variables are initialized to their default values. 
If you declare a constructor for a class, the compiler will not create a default constructor for that class.
