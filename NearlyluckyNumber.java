//teachers day challenge
import java.util.Scanner;

public class NearlyluckyNumber {

    public static boolean isLuckyCount(int luckyCount){
        
        if(luckyCount == 0) return false;

            while(luckyCount > 0){
                int digit = luckyCount%10;
                if(digit != 4 && digit != 7){
                    return false;
                }
                luckyCount = luckyCount/10;
            }
            return true;
        }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        int luckyCount  = 0;

            while(n > 0){
                long digit = n%10;
                if(digit == 4 || digit == 7){
                    luckyCount++;
                }
                n = n/10;
            }

            if(isLuckyCount(luckyCount)){
                System.out.println("YES");
            }else{
                System.out.println("NO");
            }
        sc.close();
    }
}
