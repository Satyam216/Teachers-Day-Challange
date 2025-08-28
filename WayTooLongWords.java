import java.util.Scanner;  //teacher's day challenge day 8

public class WayTooLongWords {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int total = sc.nextInt();
        sc.nextLine();
        String words[] = new String[total];
        for(int i=0; i<total; i++){
            words[i] = sc.nextLine();
        }
        for(int i=0; i<total; i++){
            if(words[i].length() > 10){
                int leftLength = words[i].length() - 2;
                System.out.println(words[i].charAt(0)+ "" + leftLength + "" + 
                words[i].charAt(words[i].length()-1));
            }else{
                System.out.println(words[i]);
            }
        }
    }
}
