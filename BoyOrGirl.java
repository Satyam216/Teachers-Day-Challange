//teachers day challenge day 15
import java.util.HashSet;
import java.util.Scanner;

public class BoyOrGirl {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        HashSet<Character> set = new HashSet<>();

        for(int i=0; i<str.length(); i++){
            set.add(str.charAt(i));
        }
    int size = set.size();
    if(size%2 == 0){
        System.out.println("CHAT WITH HER!");
    }else{
        System.out.println("IGNORE HIM!");
    }

    }

    
}
