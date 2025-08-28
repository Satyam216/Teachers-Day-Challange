//day 19 teachers day challange

import java.util.Scanner;

public class Translation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.nextLine();
        String str2 = sc.nextLine();
        String reverseStr = "";

        if(str1.length() != str2.length()){
            System.out.println("NO");
            return;
        }

        for(int i=str1.length()-1; i>=0; i--){
            char ch = str1.charAt(i);
            reverseStr += ch;
        }
        if(reverseStr.equals(str2)){
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }

    }
}
