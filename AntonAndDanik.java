//day 29 of teacher's day challange

import java.util.Scanner;

public class AntonAndDanik {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String outcomes = sc.next();

        int danikWon = 0;
        int antonWon = 0;

        for(char ch : outcomes.toCharArray()){
            if(ch == 'A'){
                antonWon++;
            }else{
                danikWon++;
            }
        }

        if(antonWon > danikWon){
            System.out.println("Anton");
        }else if(danikWon > antonWon){
            System.out.println("Danik");
        }else{
            System.out.println("Friendship");
        }

        sc.close();
    }
    
}
