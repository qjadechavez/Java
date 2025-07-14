# Objective:  
Learn how to create, compile, and run a basic Java program that prints a message to the screen.  
# Instructions:  
- Open your preferred IDE (e.g., Eclipse, IntelliJ, or VS Code).  
- Create a file named HelloWorld.java  
- Print "Hello, World!";  
- Print your full name  
  
Run the program and observe the output.  
# Sample Output:  
> Hello, World!  
> Hello, I am John Doe!


# Source Code:  
**HelloWorld.java**
```
public class HelloWorld {

    public static void main(String[] args) {

        GreetHandler greet = new GreetHandler();

        System.out.println("Hello, World!");

        greet.sayHello("Jhon Arol De Chavez");

    }

}
```

**GreetHandler.java**
```
public class GreetHandler {

    public void sayHello(String name) {

        System.out.print("Hello, I am " + name + "!");

    }

}
```

# Time and Space Complexity:  
![[BigOChart.png]]

[[Activity 2 - Getting to Know You — Input & Variables in Java|[Activity 2 - Calculate Area of a Triangle] >>]]
