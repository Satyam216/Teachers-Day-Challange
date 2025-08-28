import java.util.Scanner;

public class UltraFastMathmatician {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String  a = sc.nextLine();
        String  b = sc.nextLine();
        String result = "";

        for(int i=0; i<a.length(); i++){
            result += a.charAt(i) == b.charAt(i) ? 0 : 1; 
        }
        System.out.println(result);
    }
    
}
