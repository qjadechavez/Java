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

CalculateGrade.java
```
public class CalculateGrade {

    private double score;

    public CalculateGrade(double score) {
        this.score = score;
    }

    public char getGrade() {

        if (score < 0 || score > 100) {
            throw new IllegalArgumentException("Score must be between 0 and 100.");
        }

        if (score >= 90) {
            return 'A';
        } else if (score >= 80) {
            return 'B';
        } else if (score >= 70) {
            return 'C';
        } else if (score >= 60) {
            return 'D';
        } else {
            return 'F';
        }
    }
}
```

# Time and Space Complexity: 
![[BigOChart.png|500|]]

[[Activity 7 - Find the Largest Among Three Numbers|[Activity 7 - Find the Largest Among Three Numbers] >>]]
