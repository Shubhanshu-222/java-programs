import java.util.Scanner;

public class MinigameRND {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = (int) (Math.random() * 100) + 1;
        int userNumber = 0;
        while (userNumber != number) {
            System.out.println("Guess my number (1-100): ");
            userNumber = sc.nextInt();
            if (userNumber == number) {
                System.out.println("Correct Number!");
                break;
            } else if (userNumber > number) {
                System.out.println("The number is too large");
            } else {
                System.out.println("The number is too small");
            }
        }
        System.out.println("The number was: " + number);
        sc.close();
    }
}
