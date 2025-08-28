//day 30 of teacher's day challange

import java.util.Scanner;

public class BearAndBigBrother {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int lemakWeight = sc.nextInt();
        int bobWeight = sc.nextInt();
        int year = 0;

        while (lemakWeight <= bobWeight){
            year++;
            lemakWeight *= 3;
            bobWeight *= 2;
        }
        System.out.println(year);

        sc.close();
    }
}
