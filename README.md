# Java Kirkwood 2023

This is the work I completed for my CIS-171 Java course at Kirkwood Community
College. Below is a journal of all the things I learned throughout 
the class.

## Weeks 1 and 2

In the Introduction unit we created accounts and installed software 
needed for the class.

Using [IntelliJ](https://www.jetbrains.com/idea/download/) we created a module with a **Java class** inside it. 
Inside the class we created a main method that displays a message in
the terminal. We can type "sout" followed by the tab key to generate 
the `System.out.println()` statement.

```java
public class MyClass {
public static void main(String[] args) {
System.out.println("My name is Jonathan!");
}
}
```
We initialized our project as a [Git](https://git-scm.com/downloads) **repository* and pushed our
project code to [GitHub](https://www.github.com/signup/). Our project includes a **.gitignore** 
file telling Git which files not to track.

Going forward, whenever I complete a task I will **Add-Commit-Push (ACP)**

    - git add .
    - git commit -m "describe my work"
    - git push origin main :rocket:

## Weeks 3 and 4
Overall I am having a growing comfort stepping out of my Python 
shell and not letting syntax differences concern me.

A large skill being developed is reading documentation and applying it.
the [JetBrains IDE](https://www.jetbrains.com/idea/download/) 
has fantastic integrated tooltips to explain your errors quickly.

Learng about the object-oriented core tenants of
* **Encapsulation**
* **Inheritance**
* **Polymorphism**
* **Abstraction** 

is a new wrinkle  but with practice becomes clear.

Working with a classmate as a driver/navigator pair is a solid way to 
help us learn how to work together in this circumstance. I look forward
to future partner projects. Communicating `System.out.println()` has never 
been so challenging and rewarding.

## Weeks 5 and 6
I'm learning much about loops and building a framework to quickly
diagnose errors within them. Knowing what the loop will do
without having to run it is keep. 

For example, if I wanted to print the numbers 0 through 5 inclusive,
I could use the following

```java
public class MyClass {
    public static void main(String[] args) {
        for (int i = 0; i <=5;1++){
            System.out.println(i);
        }
    }


```
Knowing this will start at 0, and print 5 inclusive, thanks to the <= comparison.
While this seems trivial now, it will be more important as I make loops
with complexity.

## Weeks 7 and 8
I'm learning about arrays and the different functions we have available
within them. An Array is a fixed length set of variables of the same time. 
For example, a list of 10 numbers. 

Being as they are fixed length, and all of the same type, they are great candidates
for looping through. For example
```java
public class MyClass {
    public static void main(String[] args) {
    int[] myArray = new Int[10];
        for (int i = 0; i <=myArray.length;i++){
            myArray[i]=(i+3);
        }
    }

```
will create an array of 10 integers. 
Each value will you will be filled with a number 1 higher than it's index.
That is, the first value (index zero), will be 3, the second number (index 1) 
will be 4 and so on.

## Weeks 9 and 10

I'm learning about methods 
A method will have an access modifier, return type, parameters, and arguments.

Access modifiers are "public" "private" or "protected"
A "protected" method can only be accessed by methods in the same package
A "private" method can only be used by the same class
A "public" method can be used anywehre in the same source root.

A return type is what the method calcuates and returns to the user.
For example, Int X = (Math.Min(a,b,c));
The Math.Min method will "return" or assign the lowest valuel of a b and c to the 
variable x.
Some functions return nothing, and in that case, the "return type" is void

A parameter is the data type that a method accepts. 
When reading the tool tip for System.out.PrintLn() it specifies
that inside the parenthesis we should supply a "string".

An argument are the actual data you pass to a method, and is assigned to the paremether
For example, System.out.PrintLn("Jonathan") the argument placed in is "Jonathan"

A static method requires you to type classname.methodname() for a static method
or a non-static method requires you to type objectname.methodname()

