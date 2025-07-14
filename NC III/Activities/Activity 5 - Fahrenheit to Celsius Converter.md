# Objective:  
Learn how to apply mathematical formulas in Java using variables and user input.
# Instructions:  
1. Create a Java class named FahrenheitToCelsius.  
2. In your main method:
	- Ask the user to input a temperature in Fahrenheit.
	- Convert it to **Celsius** using the formula : **Celsius=(Fahrenheit−32) * 5 / 9**​

3. Display the result to 2 decimal places.
# Sample Output:  
> Enter temperature in Fahrenheit: 98.6  
> Temperature in Celsius: 37.00°C

# Source Code:  
FahrenheitToCelsius.java
```
import java.util.Scanner;

public class FahrenheitToCelsius {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        try {
            
            System.out.print("Enter temperature in Fahrenheit: ");
            double fahrenheit = scanner.nextDouble();

            CalculateHandler calculateHandler = new CalculateHandler(fahrenheit);

            double celsius = calculateHandler.convertToCelsius();
            System.out.printf("Temperature in Celsius: %.2f°C", celsius);
        
        } catch (IllegalArgumentException e) {
            System.out.println("Computation error: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Input error: please enter a valid measurments.");
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

# Time and Space Complexity: 
![[BigOChart.png|500|]]

[[Activity 6 - Grading System using If-Else|[Activity 6 - Grading System using If-Else] >>]]