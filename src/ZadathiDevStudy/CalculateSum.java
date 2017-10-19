package ZadathiDevStudy;

import java.util.Scanner;

/**
 * Created by AskeN on 19.10.2017.
 */
public class CalculateSum {
    public static int Sum(int out){
        int result=0;
        for (int i = 0; i<out;i++) {
            if (out <= 0) {
                return 0;
            }
            result += (i+1);
        }
        return result;
    }

    public static StringBuffer revers(String s){
        StringBuffer rev = new StringBuffer(s);
        return rev.reverse();

    }
    public static void main(String[] args) {
        /*Integer scanner = new Scanner(System.in).nextInt();
        int result= CalculateSum.Sum(scanner);
        System.out.println(result);*/
        String rev =new Scanner(System.in).nextLine();
        StringBuffer result = CalculateSum.revers(rev);
        System.out.println(result);

    }
}
