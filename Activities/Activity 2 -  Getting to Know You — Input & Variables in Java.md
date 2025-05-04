
# Objective:  
Learn how to use variables and the Scanner class to accept input from the user and display personalized output.  
# Instructions:  
1. Create a new Java class file named UserIntroduction.java.  
2. Complete the TODOs to:  
	- Accept name, age, and favorite hobby
	- Store them in variables
	- Print a short introduction using the input
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