=============================================== CHAPITRE 1 ========================================================================
Jave SE ==>Java Standard Edition contains the capabilities needed to develop desktop and server applications. 
Java supported three programming paradigms : 
	—procedural programming  
	—object-oriented programming
	—generic programming. 

Java SE 8 adds functional programming. 
ASCII (American Standard Code for Information Interchange) : the popular subset of Unicode that represents uppercase and lowercase letters, digits and some common special characters.

Java EE ==>Java Enterprise Edition is geared toward developing large-scale, distributed networking applications and web-based applications.
Java ME ==>Java Micro Edition is a subset of Java SE.It is geared toward developing applications for resource-constrained embedded devices.

Data hierarchy that becomes larger and more complex in structure as we progress from the simplest data items (called “bits”) to richer ones, such as characters and fields.
--> Bits : the smallest data item in a computer can assume the value 0 or the value 1. It’s called a
           bit (short for “binary digit”—a digit that can assume one of two values).
--> Characters : Digits, letters and special symbols are known as characters (decimal digits (0–9), letters (A–Z and a–z), and special symbols (e.g., $, @, %,))
--> Fields are composed of characters or bytes.
--> Records : Several related fields can be used to compose a record (implemented as a class in Java).
--> Files : A file is a group of related records.
--> Database : A database is a collection of data organized for easy access and manipulation. The most popular model is the relational database,
               in which data is stored in simple tables. A table includes records and fields.
               For example, a table of students might include first name, last name, major, year, student ID number and grade point average fields. The data for each
               student is a record, and the individual pieces of information in each record are the fields.

The computer’s character set is the set of all the characters used to write programs and represent data items.
Java uses Unicode® characters that are composed of one, two or four bytes (8, 16 or 32 bits).
Unicode contains characters for many of the world’s languages.
Translator programs called compilers convert high-level language programs into machine language.
Interpreter programs, developed to execute high-level language programs directly, avoid the delay of compilation, although they run slower than compiled programs. 
Java uses a clever performance-tuned mixture of compilation and interpretation to run programs. 

Almost any noun can be reasonably represented as a software object in terms of attributes (e.g., name, color and size) and behaviors (e.g., calculating, moving and communicating).
In Java, we create a program unit called a class to house the set of methods that perform the class’s tasks.

Instantiation : Just as someone has to build a car from its engineering drawings before you can actually drive a car, you must build an object of a class before a program can perform the tasks that the class’s methods define. The process of doing this is called instantiation. An object is then referred to as an instance of its class. 

Reuse of existing classes when building new classes and programs saves time and effort. Reuse also helps you build more reliable and effective systems, because existing classes and components often have undergone extensive testing, debugging and performance tuning. 

Attributes are specified by the class’s instance variables.
There are normally five steps to create and execute a Java application.

Phase 1: Creating a Program
Phase 1 consists of editing a file with an editor program, normally known simply as an editor (Fig. 1.6). Using the editor, you type a Java program (typically referred to as source code), make any necessary corrections and save it on a secondary storage device, such as your hard drive. Java source code files are given a name ending with the .java extension, indicating that the file contains Java source code. 

Phase 2: Compiling a Java Program into Bytecodes
In Phase 2, you use the command javac (the Java compiler) to compile a program.For example, to compile a program called Welcome.java, you’d type : javac Welcome.java
If the program compiles, the compiler produces a .class file called Welcome.class that contains the compiled version. 
The Java compiler translates Java source code into bytecodes that represent the tasks to execute in the execution phase

The Java Virtual Machine (JVM)—a part of the JDK and the foundation of the Java platform—executes bytecodes. A virtual machine (VM) is a software application that simulates a computer but hides the underlying operating system and hardware from the programs that interact with it. If the same VM is implemented on many computer platforms, applications written for that type of VM can be used on all those platforms. The JVM is one of the most widely used virtual machines.
bytecode instructions are platform independent. So, Java’s bytecodes are portable—without recompiling the source code, the same bytecode instructions can execute on any platform containing a JVM that understands the version of Java in which the bytecodes were compiled. The JVM is invoked by the java command.
For example, to execute a Java application called Welcome, you’d type the command :java Welcome

Phase 3: Loading a Program into Memory
In Phase 3, the JVM places the program in memory to execute it—this is known as loading.
The JVM’s class loader takes the .class files containing the program’s bytecodes and transfers them to primary memory. It also loads any of the .class files provided by Java that your program uses. The .class files can be loaded from a disk on your system or over a network (e.g., your local college or company network, or the Internet). 

Phase 4: Bytecode Verification
In Phase 4, as the classes are loaded, the bytecode verifier examines their bytecodes to ensure that they’re valid and do not violate Java’s security restrictions .
Java enforces strong security to make sure that Java programs arriving over the network do not damage your files or your system (as computer viruses and worms might). 

Phase 5: Execution
In Phase 5, the JVM executes the program’s bytecodes, thus performing the actions specified by the program. In early Java versions, the JVM was simply an interpreter for Java
bytecodes. Most Java programs would execute slowly, because the JVM would interpret and execute one bytecode at a time. Some modern computer architectures can execute several instructions in parallel. Today’s JVMs typically execute bytecodes using a combination of interpretation and so-called just-in-time (JIT) compilation. In this process, the JVM analyzes the bytecodes as they’re interpreted, searching for hot spots—parts of the bytecodes that execute frequently. For these parts, a just-in-time (JIT) compiler, such as Oracle’s Java HotSpot™ compiler, translates the bytecodes into the underlying computer’s machine language. When the JVM encounters these compiled parts again, the faster machine-language code executes. Thus Java programs actually go through two compilation phases—one in which source code is translated into bytecodes (for portability across JVMs on different computer platforms) and a second in which, during execution, the bytecodes are translated into machine language for the actual computer on which the program executes. 

