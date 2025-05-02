# Objective:  
Use basic arithmetic operators in Java to calculate the using the formula:  Area = length × width
  
# Instructions:  
1. Create a Java class named **RectangleAreaCalculator**.  
2. In the main method:
	- Ask the user to input the and of a rectangle.
	- Use the area formula to compute the result.
	- Display the final area value with proper labels.
# Sample Output:  
> Enter the length: 8  
> Enter the width: 4  
> The area of the rectangle is: 32.0

# Source Code:  
RectangleAreaCalculator.java
```
import java.util.Scanner;

public class RectangleAreaCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {

            System.out.print("Enter the length: ");
            double length = scanner.nextDouble();

            System.out.print("Enter the width: ");
            double width = scanner.nextDouble();

            RectangleHandler calculateHandler = new RectangleHandler(length, width);
            
            double area = calculateHandler.calculateArea();
            System.out.println("The area of the rectangle is: " + area);

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

RectangleHandler.java
```
public class RectangleHandler {

    private double length;
    private double width;

    // Constructor 
    public RectangleHandler(double length, double width) {
        this.length = length;
        this.width = width;
    }

    // Method to calculate area with error handling
    public double calculateArea() {
        if (length <= 0 || width <= 0) {
            throw new IllegalArgumentException("Length and width must be positive.");
        }
        return length * width;
    }
}
```

# Time and Space Complexity: 
![[BigONotation.jpg|500|]]
