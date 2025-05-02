# Objective:  
Practice using variables and arithmetic operators (+, -, , /, %) to solve simple math problems using Java. 
  
# Instructions:  
1. Create a new Java class named **SimpleCalculator**.  
2. In your main method:
	- Ask the user to enter two numbers.
	- Store the values using appropriate variables.
	- Perform the following operations:
	- Addition
	- Subtraction
	- Multiplication
	- Division
	- Modulo (remainder)
3. Display the results in a clear and formatted output.
4. Test your program using your own input.
# Sample Output:  
> What is your name?   
> User input: **Alex**  
> How old are you?   
> User input: **18**  
> What is your favorite hobby?   
> User input: **Drawing**  

> Nice to meet you, Alex!  
> You are 18 years old and love Drawing.

# Source Code:  
UserIntroduction.java
```
public class UserIntroduction {

	public static void main (String[] args) {

		IntroductionHandler intro = new IntroductionHandler();

		intro.getIntroduction();
		intro.displayIntroduction();
	
	}

}
```

IntroductionHandler.java
```
import java.util.Scanner;

public class IntroductionHandler {

	private String name;
	private int age;
	private String hobby;

	public void getIntroduction() {
	
		Scanner scanner = new Scanner(System.in);
	
		System.out.println("What is your name?");
		this.name = scanner.nextLine();	

		System.out.println("How old are you?");
		this.age = scanner.nextInt();
		scanner.nextLine();

		System.out.println("What is your favorite hobby?");
		this.hobby = scanner.nextLine();

	}

	public void displayIntroduction() {

		System.out.println("\nNice to meet you, " + name + "!");
		System.out.print("You are " + age + " years old and love " + hobby);	

	}

}
```

# Time and Space Complexity: 
![[BigONotation.jpg|500|]]