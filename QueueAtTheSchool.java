//day 22 teacher's day challange

import java.util.Scanner;

public class QueueAtTheSchool {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int time = sc.nextInt();
        String str = sc.next();
        StringBuilder queue = new StringBuilder(str);

        while(time > 0){
            for(int i=0; i<n-1; i++){
                if(queue.charAt(i) == 'B' && queue.charAt(i+1) == 'G'){
                    queue.setCharAt(i,'G');
                    queue.setCharAt(i+1,'B');
                    i++;
                }
            }
            time--;
        }

        System.out.println(queue.toString());
    }
}
