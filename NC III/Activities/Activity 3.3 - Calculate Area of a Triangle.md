# Objective:  
Use arithmetic operators to calculate the area of a triangle using the formula:  Area = (1/2) ​× base × height.
# Instructions:  
1. Create a Java class named **TriangleAreaCalculator**.  
2. In the main method:
	- Ask the user to enter the _base_ and _height_  of a triangle.
	- Use the formula to compute the area.
	- Print the area with a label and proper formatting.
# Sample Output:  
> Enter the base: 10  
> Enter the height: 5  
> The area of the triangle is: 25.0

# Source Code:  
TriangleAreaCalculator.java
```
import java.util.Scanner;

public class TriangleAreaCalculator {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        try { 

            System.out.println("Enter the base: ");
            double base = scanner.nextDouble();
            System.out.println("Enter the height: ");
            double height = scanner.nextDouble();

            CalculateHandler calculateHandler = new CalculateHandler(base, height);

            double area = calculateHandler.calculateArea();
            System.out.println("The area of the triangle is: " + area);
            
        } catch (IllegalArgumentException e) {
            System.out.println("Computation Error: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Input error: Please enter valid measurements.");
        } finally {
            scanner.close();
        }  
    }
}
```

CalculateHandler.java
```
public class CalculateHandler {

    private double base;
    private double height;

    // Constructor
    public CalculateHandler(double base, double height) {
        
        this.base = base;
        this.height = height;
    }

    // Method to calculate the area of the triangle with error handling
    public double calculateArea() {
        if (base <= 0 || height <= 0) {
            throw new IllegalArgumentException("Base and height must be positive numbers.");
        }

        return (base * height) / 2;
    }
    
}
```

# Time and Space Complexity: 
![[BigOChart.png|500|]]

[[Activity 4 - Odd or Even Checker|[Activity 4 - Odd or Even Checker] >>]]
