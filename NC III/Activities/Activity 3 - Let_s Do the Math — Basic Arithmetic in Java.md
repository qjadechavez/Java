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
> Enter first number: **15**  
> Enter second number: **4**
> Nice to meet you, Alex!  
> You are 18 years old and love Drawing.

> Sum: 19.0  
> Difference: 11.0  
> Product: 60.0  
> Quotient: 3.75  
> Remainder: 3.0

# Source Code:  
SimpleCalculator.java
```
public class SimpleCalculator {
    public static void main(String[] args) {
        
        CalculateHandler calculator = new CalculateHandler();
        
        try {
            calculator.calculate();
        } catch (ArithmeticException e) {
            System.out.println("Computation error: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Input error: Please enter valid numbers");
        }
    }
}
```

CalculateHandler.java
```
import java.util.Scanner;

public class CalculateHandler {
    
    private double firstNumber;
    private double secondNumber;


    public void calculate() {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first number: ");
        this.firstNumber = scanner.nextDouble();
        System.out.print("Enter second number: ");
        this.secondNumber = scanner.nextDouble();
        
        if (secondNumber == 0) {
            throw new ArithmeticException("Cannot divide by zero");
        }

        System.out.println("\nResults:");
        System.out.println("Sum: " + sum());
        System.out.println("Difference: " + difference());
        System.out.println("Product: " + product());
        System.out.println("Quotient: " + quotient());
        System.out.println("Remainder: " + remainder());
    }

    public double sum() {

        return firstNumber + secondNumber;
    }

    public double difference() {

        return firstNumber - secondNumber;
    }

    public double product() {

        return firstNumber * secondNumber;
    }

    public double quotient() {

        return firstNumber / secondNumber;
    }

    public double remainder() {

        return firstNumber % secondNumber;
    }
}
```

# Time and Space Complexity: 
![[BigOChart.png|500|]]