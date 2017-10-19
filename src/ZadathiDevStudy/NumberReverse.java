package ZadathiDevStudy;

import java.util.Scanner;

/**
 * Created by AskeN on 19.10.2017.
 */
public class NumberReverse {

    public static void main(String[] args) {
        System.out.println("Input a:");
        int a = new Scanner(System.in).nextInt();
        int result = 0;
        int base = 10;
        while (true) {
            int digit = a % 10;
            result = result * base + digit;
            a /= 10;
            if (a == 0) {
                break;
            }
        }
        System.out.println("Result=" + result);
    }
}
