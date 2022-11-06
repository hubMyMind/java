=============================================== CHAPITRE 2 ========================================================================

Java provides comments of a third type—Javadoc comments. These are delimited by /** and */. 
Javadoc comments enable you to embed program documentation directly in your programs.
The javadoc utility program (part of the JDK) reads Javadoc comments and uses them to prepare program documentation in HTML format. 
Forgetting one of the delimiters of a traditional or Javadoc comment is a syntax error. A syntax error occurs when the compiler encounters code that violates Java’s language rules (i.e., its syntax).
Syntax errors are also called compiler errors, compile-time errors or compilation errors, because the compiler detects them when compiling the program. When a syntax error is encountered, the compiler issues an error message.  
Every Java program consists of at least one class that you (the programmer) define.
A  public class must be placed in a file that has a filename of the form ClassName.java.
By convention, class names begin with a capital letter and capitalize the first letter of each word they include (e.g., SampleClassName).
Java is case sensitive—uppercase and lowercase letters are distinct.
A left brace ,{, begins the body of every class declaration. A corresponding right brace , }, must end each class declaration.

public static void main(String[] args) is the starting point of every Java application.
Methods perform tasks and can return information when they complete their tasks. 
Keyword void indicates that this method will not return any information.
White-space characters in strings are not ignored by the compiler.
The "System.out" object is known as the standard output object. It allows a Java application to display information in the command window from which it executes. In recent versions of Microsoft Windows, the command window is the Command Prompt. In UNIX/Linux/Mac OS X, the command window is called a terminal window or a shell. Many programmers call it simply the command line.
The entire line including System.out.println, the argument "Welcome to Java Programming!" in the parentheses and the semicolon (;), is called a statement. 
A method typically contains one or more statements that perform its task.

Unlike println, after displaying its argument, print does not position the output cursor at the beginning of the next line in the command window—the next character the program displays will appear immediately after the last character that print displays.

The backslash (\) is an escape character, which has special meaning to System.out’s print and println methods. When a backslash appears in a string, Java combines it with the next character to form an escape sequence(\n represents the newline character).
The System.out.printf method (f means “formatted”) displays formatted data.
When a method requires multiple arguments, they’re placed in a comma-separated list. 
Place a space after each comma (,) in an argument list to make programs more readable.

System.out.printf("%s%n%s%n", "Welcome to", "Java Programming!"); ====> Method printf’s first argument is a format string that may consist of fixed text and
format specifiers. Fixed text is output by printf just as it would be by print or println.
Each format specifier is a placeholder for a value and specifies the type of data to output.
Format specifiers begin with a percent sign (%) followed by a character that represents the data type. For example, the format specifier %s is a placeholder for a string.
Notice that instead of using the escape sequence \n, we used the %n format specifier, which is a line separator that’s portable across operating systems.

A great strength of Java is its rich set of predefined classes that you can reuse rather than “reinventing the wheel.” 
These classes are grouped into packages—named groups of related classes—and are collectively referred to as the Java class library, or the Java Application
Programming Interface (Java API).

import java.util.Scanner; ==> is an import declaration that helps the compiler locate a class that’s used in this program. It indicates that the program uses the predefined Scanner class from the package named java.util. The compiler then ensures that you use the class correctly. 

If you compile your code with javac using the command-line argument -deprecation, the compiler will tell you which deprecated features you’re using.
A comment that begins with // is an end-of-line comment.
A variable is a location in the computer’s memory where a value can be stored for use later in a program. All Java variables must be declared with a name and a type before they can be used. A variable’s name enables the program to access the value of the variable in memory.
A variable’s type specifies what kind of information is stored at that location in memory.

 A Scanner enables a program to read data (e.g., numbers and strings) for use in a program.
 The standard input object, System.in, enables applications to read bytes of data typed by the user.
 The Scanner translates these bytes into types (like ints) that can be used in a program.

Some other types of data are float and double, for holding real numbers, and char, for holding character data. 
Real numbers contain decimal points, such as in 3.4, 0.0 and –11.19. 
Variables of type char represent individual characters, such as an uppercase letter (e.g., A), a digit (e.g., 7), a special character (e.g., * or %) or an escape sequence (e.g., the tab character, \t). 
The types int, float, double and char are called primitive types. Primitive-type names are keywords and must appear in all lowercase letters (eight primitive types (boolean, byte, char, short, int, long, float and double)).

By default, package java.lang is imported in every Java program; thus, classes in java.lang are the only ones in the Java API that do not require an import declaration.
Operator = is called a binary operator, because it has two operands. This statement is called an assignment statement, because it assigns a value to a variable.
Everything to the right of the assignment operator, =, is always evaluated before the assignment is performed.
Portions of statements that contain calculations are called expressions. In fact, an expression is any portion of a statement that has a value associated with it. 
Every variable has a name, a type, a size (in bytes) and a value.

The asterisk (*) indicates multiplication, and the percent sign (%) is the remainder operator.
The arithmetic operators in Fig. 2.11 are binary operators, because each operates on two operands. For example, the expression f + 7 contains the binary operator + and the two operands f and 7.
Any fractional part in integer division is simply truncated (i.e., discarded)—no rounding occurs. For example, the expression 7 / 4 evaluates to 1, and the expression 17 / 5 evaluates to 3.
Java provides the remainder operator, %, which yields the remainder after division. The expression x % y yields the remainder after x is divided by y. Thus, 7 % 4 yields 3, and 17 % 5 yields 2.

If an expression contains nested parentheses, such as ((a + b) * c) the expression in the innermost set of parentheses (a + b in this case) is evaluated first.

1. Multiplication, division and remainder operations are applied first. If an expression contains several such operations, they’re applied from left to right. Multiplication, division and remainder operators have the same level of precedence.

2. Addition and subtraction operations are applied next. If an expression contains several such operations, the operators are applied from left to right. Addition and subtraction operators have the same level of precedence.

The equality operators (== and !=) and relational operators (>, <, >= and <=). 
Both equality operators have the same level of precedence, which is lower than that of the relational operators

A condition is an expression that can be true or false.

The equality operator should be read as “is equal to” and the assignment operator as “gets” or “gets the value of.” To avoid confusion, some people read the equality operator as “double equals” or “equals equals.”
