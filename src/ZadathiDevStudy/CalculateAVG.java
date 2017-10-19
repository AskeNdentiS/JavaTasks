package ZadathiDevStudy;

import java.util.Scanner;

/**
 * Created by AskeN on 19.10.2017.
 */
public class CalculateAVG {

    public static void main(String[] args) {
            while (true) {
                String cmd = new Scanner(System.in).nextLine();
                if (cmd.charAt(0) == 'q') {
                    System.out.println("bye");
                }else {
                    double result = Math.sqrt(Double.parseDouble(cmd));

                    if (result >= 0) {
                        System.out.println(result);
                    }else System.out.println("invalid");
                }
            }
    }
}
