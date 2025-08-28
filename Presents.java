import java.util.Scanner;

public class Presents {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int friends[] = new int[n+1];
        int result[] = new int[n+1];

        for(int i=1; i<=n; i++){
            friends[i] = sc.nextInt();
        }
        for(int i=1; i<=n; i++){
            int p = friends[i];
            result[p] = i; 
        }

        for(int i=1; i<=n; i++){
            System.out.print(result[i] + " ");
        }

    }
    
}
