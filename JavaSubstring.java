import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String string = input.next();
        int start = input.nextInt();
        int end = input.nextInt();
        System.out.println(string.substring(start, end));
    }
}