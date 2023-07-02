import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        scanner.close();

        if (number % 2 != 0) {
            System.out.println("Weird");
        } else if (number % 2 == 0 && (number >= 2 && number <= 5)) {
            System.out.println("Not Weird");
        } else if (number % 2 == 0 && (number >= 6 && number <= 20)) {
            System.out.println("Weird");
        } else {
            if (number % 2 == 0 && number > 20) {
                System.out.println("Not Weird");
            }
        }
    }
}