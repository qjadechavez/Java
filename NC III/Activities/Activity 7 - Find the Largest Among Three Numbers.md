# Objective:  
Use if-else statements and logical comparisons to determine the among three user inputs.
# Instructions:  
1. Create a Java class named **LargestNumberFinder**.  
2. In the main method:
	- Ask the user to input .
	- Use conditional statements (if, else if, else) to compare the numbers.
	- Print which number is the.
	- Handle cases where two or all numbers are equal.
# Sample Output:  
> Enter first number: 45  
> Enter second number: 72  
> Enter third number: 13  
  
> The largest number is: 72

> Enter first number: 9  
> Enter second number: 9  
> Enter third number: 9  
  
> All numbers are equal.

# Source Code:  
LargestNumberFinder.java
```
import java.util.Scanner;

public class LargestNumberFinder {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        try {
            System.out.print("Enter your first number: ");
            byte firstNumber = input.nextByte();
    
            System.out.print("Enter your second number: ");
            byte secondNumber = input.nextByte();
    
            System.out.print("Enter your third number: ");
            byte thirdNumber = input.nextByte();
    
            LargeNumber find = new LargeNumber(firstNumber, secondNumber, thirdNumber);
    
            System.out.println(find.LargestNumber());
    
        } catch (Exception e) {
            
            System.out.println("Invalid input! Please enter valid byte values.");
        } finally {

            input.close(); 
        }
        
    }
}
```

LargeNumber.java
```
public class LargeNumber {

    private byte first;
    private byte second;
    private byte third;
    
    public LargeNumber(byte first, byte second, byte third) {

        this.first = first;
        this.second = second;
        this.third = third;
    }

    public String LargestNumber() {

        if (first > second && first > third) {
            return "The largest number is: " + first;
        } else if (second > first && second > third) {
            return "The largest number is: " + second;
        } else if (third > first && third > second) {
            return "The largest number is: " + third;
        } else {
            return "All numbers are equal";
        }
    }
}
```

Time and Space Complexity: 
![[BigONotation.jpg|500|]]
