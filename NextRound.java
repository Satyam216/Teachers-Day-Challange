import java.util.Scanner; //teacher'd day challenge day 10

public class NextRound {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int count = 0;
        int score[] = new int[n];

        for(int i=0; i<n; i++){
            score[i] = sc.nextInt();
        }
        int comparisonScore = score[k-1];

        for(int i=0; i<n; i++){
            if(score[i] >=comparisonScore && score[i] > 0 ){
                count++;
            }
        }
        System.out.println(count);
    }
    
}
