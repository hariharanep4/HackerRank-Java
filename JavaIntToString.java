import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        input.close();
        
        String string = Integer.toString(n);

        if (n == Integer.parseInt(string)) {
            System.out.println("Good job");
        } else {
            System.out.println("Wrong answer.");
        }
    }
}