//teacher's day challenge day 12

import java.util.Scanner;

public class PetyaAndStrings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.nextLine();
        String str2 = sc.nextLine();

        int res = str1.toLowerCase().compareTo(str2.toLowerCase());
        
        if(res <0){
            System.out.println("-1");
        }else if(res >0){
            System.out.println("1");

        }else{
            System.out.println("0");
        }

    }
    
}
