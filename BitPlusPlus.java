//day 17 teachers day challange

import java.util.Scanner;

public class BitPlusPlus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x = 0;

        for(int i=0; i<n; i++){
            String str = sc.next();
        
            if(str.equals("X++") || str.equals("++X")){
                x++;
            }else{
                x--;
            } 
        }
        System.out.println(x);
    }
    
}
