package t1246_4;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int r = in.nextInt();
        int s = in.nextInt();
        int count = 0;
        Queue<String> queue = new LinkedList();
        queue.offer("2");
        queue = gen(r,queue);
        char[] ch1 = String.valueOf(s).toCharArray();
        char[] ch2 = new char[queue.size()];
        for(int i = 0;;i++){
            if(queue.isEmpty()){
                break;
            }
            ch2[i]=queue.poll().toCharArray()[0];
        }
        int tag = 0;
        int l = ch1.length;
        for(char c:ch2){
            if(ch1[tag]==c){
                tag++;
                count++;
                count=count%998244353;
            }
            if(tag==l-1){
                tag=0;
            }
        }
        System.out.println(count);
    }

    public static Queue<String> gen(int n, Queue<String> queue) {
        Queue<String> queue2 = new LinkedList();
        while (!queue.isEmpty()) {
            switch (queue.poll()) {
                case "1":
                    queue2.offer("2");
                    break;
                case "2":
                    queue2.offer("4");
                    break;
                case "4":
                    queue2.offer("1");
                    queue2.offer("6");
                    break;
                case "6":
                    queue2.offer("6");
                    queue2.offer("4");
                    break;
            }
        }
        if (n == 2) {
            return queue2;
        }
        queue = gen(n - 1, queue2);
        return queue;
    }
}
