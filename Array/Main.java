import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String n = sc.next();

        if (n.charAt(0) == '-') {
            n = n.substring(1);
        }

        long product = 1;
        boolean hasEven = false;

        for (int i = 0; i < n.length(); i++) {
            int digit = n.charAt(i) - '0';

            if (digit % 2 == 0) {
                product *= digit;
                hasEven = true;
            }
        }

        System.out.println(hasEven ? product : -1);
    }
}