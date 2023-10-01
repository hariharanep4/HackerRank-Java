import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Double payment = input.nextDouble();
        input.close();

        NumberFormat nfU = NumberFormat.getCurrencyInstance(Locale.US);
        NumberFormat nfI = NumberFormat.getCurrencyInstance(new Locale("en", "in"));
        NumberFormat nfC = NumberFormat.getCurrencyInstance(Locale.CHINA);
        NumberFormat nfF = NumberFormat.getCurrencyInstance(Locale.FRANCE);

        System.out.println("US: " + nfU.format(payment));
        System.out.println("India: " + nfI.format(payment));
        System.out.println("China: " + nfC.format(payment));
        System.out.println("France: " + nfF.format(payment));
    }
}