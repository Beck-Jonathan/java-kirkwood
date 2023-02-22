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
I'm learning much about loops and building a frameowrk to quickly
diagnose errors within them. Knowing what the loop will do
without having to run it is keep. .

For example, if I wanted to print the numbers 0 through 5 inclusive,
I could use the following

```java
public class MyClass {
    public static void main(String[] args) {
        for (int i = 0; i <=5,1++){
            System.out.println(i);
        }
    }


```
Knowing this will start at 0, and print 5 inclusive, thanks to the <= comparison.
While this seems trivail now, it will be more important as I make loops
with complexity.
