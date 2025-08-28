//day 28 of teachers day challange

import java.util.Scanner;

public class PetyaAndCountryside {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int heights[] = new int[n];
        int maxWatered = 1;

        for(int i=0; i<n; i++){
            heights[i] = sc.nextInt();
        }

        for(int i=0; i<n; i++){
            int count = 1;

            //for left side blocks
            for(int j=i-1; j>=0; j--){
                if(heights[j] <= heights[j+1]){
                    count++;
                }else{
                    break;
                }
            }

            for(int j=i+1; j<n; j++){
                if(heights[j] <= heights[j-1]){
                    count++;
                }else{
                    break;
                }
            }
            maxWatered = Math.max(maxWatered, count);
        }
        System.out.println(maxWatered);
    }
}
