//day 25 of teachers day challange

import java.util.Scanner;

public class Word { 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int upperCount = 0;
        int lowerCount = 0;

        for(char ch : str.toCharArray()){
            if(Character.isLetter(ch) && Character.isLowerCase(ch)){
                lowerCount++;
            }else{
                upperCount++;
            }
        }

        if(lowerCount >= upperCount){
            System.out.println(str.toLowerCase());
        }else{
            System.out.println(str.toUpperCase());
        }
    }
    
}
