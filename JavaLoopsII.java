import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(bufferedReader.readLine().trim());
        for (int i = 0; i < t; i++) {
            int a = Integer.parseInt(bufferedReader.readLine().trim());
            int b = Integer.parseInt(bufferedReader.readLine().trim());
            int n = Integer.parseInt(bufferedReader.readLine().trim());
        }
        bufferedReader.close();
    }
}