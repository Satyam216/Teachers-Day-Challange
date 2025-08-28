//teachers day coding challange day 23

import java.util.Scanner;

public class Elephant {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int totalSteps = (x+4)/5;  //ceiling value (x+divisor-1)/divisor
        System.out.println(totalSteps);

    }
}
