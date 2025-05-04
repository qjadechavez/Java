# Objective:  
Use if-else statements to evaluate conditions and assign grades based on a student's score.
# Instructions:  
1. Create a Java class named **GradingSystem**.  
2. In your main method:
	- Ask the user to input a (0–100).
	- Use if-else if conditions to determine the equivalent letter grade:
	- 90 - 100 → Grade A
	- 80 - 89 → Grade B
	- 70 - 79 → Grade C
	- 60 - 69 → Grade D
	- < 60 → Grade F

3. Display the letter grade based on the score.
# Sample Output:  
> Enter your score: 87  
> Your grade is: B  
  
> Enter your score: 59  
> Your grade is: F

# Source Code:  
GradingSystem.java
```
import java.util.Scanner;

public class GradingSystem {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        try {

            System.out.print("Enter your score: ");
            double score = scanner.nextDouble();

            CalculateGrade calculateGrade = new CalculateGrade(score);

            char grade = calculateGrade.getGrade();
            System.out.println("Your grade is: " + grade);

        } catch (IllegalArgumentException e) {
            System.out.println("Invalid score, it must be between 0 and 100.");
        } catch (Exception e) {
            System.out.println("Invalid input. Please enter a numeric value.");
        } finally {
            scanner.close();
        }
    }
}
```

CalculateHandler.java
```
public class CalculateHandler {

    private double fahrenheit;

    // Constructor
    public CalculateHandler(double fahrenheit) {
        this.fahrenheit = fahrenheit;
    }


    //This method convert Fahrenheit to Celsius and throws an IllegalArgumentException if the temperature is below absolute zero
   
    public double convertToCelsius() {

        if (fahrenheit < -459.67) {
            throw new IllegalArgumentException("Temperature below absolute zero is not possible.");
        }

        return (fahrenheit - 32) * 5 / 9;
    }
    
}
```

Time and Space Complexity: 
![[BigONotation.jpg|500|]]
