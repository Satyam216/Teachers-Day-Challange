//day 26 of teachers day challange

import java.util.Scanner;

public class Football {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String n = sc.nextLine();
        int count = 1;

        for(int i=1; i<n.length(); i++){
            while(i < n.length() && n.charAt(i) == n.charAt(i-1)){
                count++;
                i++;
            }
            if(count >= 7){
                System.out.println("YES");
                return;
            }
            count = 1;
        }

        System.out.println("NO");
    }
    
}
