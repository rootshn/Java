import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter your grade: ");
        char grade = scanner.next().charAt(0);

        switch (grade) {
            case 'A':
                System.out.println("You have highest grade! : passed in");
                break;
            case 'B':
                System.out.println("Your grade is good! : passed in");
                break;
            case 'C':
                System.out.println("Your grade is not bad! : passed in");
                break;
            case 'D':
                System.out.println("Your grade is not good but... : passed in");
                break;
            case 'F':
                System.out.println("Sorry dude : you failed");
                break;
            default:
                System.out.println("Invalid grade!");

        }

    }
}
