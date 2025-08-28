//day 31

import java.util.Scanner;

public class Magnets {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        int n = sc.nextInt();
        int magnets[] = new int[n];
        int group = 1;

        for(int i=0; i<n; i++){
            magnets[i] = sc.nextInt();
        }
        int start = magnets[0];
        
        // int i= 1;
        // while(i < n){
        //     if(magnets[i] == start){
        //         i++;
        //     }else{
        //         group++;
        //         start = magnets[i];
        //         i++;
        //     }
        // }

        for(int i=1; i<n; i++){
            if(start != magnets[i]){
                group++;
                start = magnets[i];
            }
        }

        System.out.println(group);
    }
}
