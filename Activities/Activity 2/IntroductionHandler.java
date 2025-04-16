import java.util.Scanner;

public class IntroductionHandler {

    private String name;
    private int age;
    private String hobby;

    public void getIntroduction() {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Hello! What is your name?");
        this.name = scanner.nextLine();

        System.out.println("How old are you?");
        this.age = scanner.nextInt();
        scanner.nextLine();

        System.out.println("What is your favorite hobby?");
        this.hobby = scanner.nextLine();
    }

    public void displayIntroduction() {

        System.out.println("\nNice to meet you, " + name + "!");
        System.out.println("You are " + age + " years old and love " + hobby + ".");
    
    }
}