import java.util.Scanner;

public class WordCapitalization {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        StringBuilder newString = new StringBuilder(str);
        char ch = str.charAt(0);
        newString.setCharAt(0,Character.toUpperCase(ch));
        System.out.println(newString.toString());
    }
    
}
