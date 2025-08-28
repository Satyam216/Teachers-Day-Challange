//teacher'd day challenge day 11
import java.util.Scanner;


public class StringTask {  
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        str = str.toLowerCase();
        StringBuilder res = new StringBuilder();

        for(char ch : str.toCharArray()){
            if(Character.isLetter(ch) && "aeiouy".indexOf(ch) == -1){
                res.append("."+ch);
            }
        }
        System.out.println(res.toString());
    }
    
}
