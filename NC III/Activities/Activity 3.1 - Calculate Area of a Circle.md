# Objective:  
Apply the formula for the :  **Area = π x r^2** , Where is the radius of the circle. 
# Instructions:  
1. Create a Java class named CircleAreaCalculator. In your main method:
	- Ask the user to input the of the circle.
	- Use the formula πr2 to calculate the area.
	- You can use **Math.PI** for the value of π in Java.
2. Display the result, rounded to .
# Sample Output:  
> Enter the radius of the circle: 5  
> he area of the circle is: 78.54

# Source Code:  
CircleAreaCalculator.java
```
import java.util.Scanner;

public class CircleAreaCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            
            System.out.print("Enter the radius of the circle: ");
            double radius = scanner.nextDouble();
            
            CalculateHandler calculateHandler = new CalculateHandler(radius);
            
            double area = calculateHandler.calculateArea();
            System.out.println("The area of the circle is: " + area);

        } catch (IllegalArgumentException e) {
            System.out.println("Computation Error: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Input error: Please enter valid radius.");
        } finally {
            scanner.close();
        }
    }
}
```

CalculateHandler.java
```
public class CalculateHandler {

    private double radius;

    // Constructor
    public CalculateHandler(double radius) {
        this.radius = radius;
    }

    // Method to calculate the area of the circle with error handling
    // This method throws an IllegalArgumentException if the radius is not positive
    public double calculateArea() {
        if (radius <= 0) {
            throw new IllegalArgumentException("Radius must be positive.");
        }
        return Math.PI * Math.pow(radius, 2);
    }
}
```

# Time and Space Complexity: 
![[BigOChart.png|500|]]

[[Activity 3.2 - Calculate Area of a Rectangle |[Activity 3.2 - Calculate Area of a Rectangle] >>]]


