//day 18 Teachers day challange

import java.util.Scanner;

public class DominoPiling {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        int maxDomino = (n*m)/2;
        System.out.println(maxDomino);

        sc.close();
    }
}
