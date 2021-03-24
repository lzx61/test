package 数字排序_2;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int max = 1;
        Map<Integer,Integer> map = new HashMap<>();
        for(int i = 0;i<n;i++){
            int temp = in.nextInt();
            if(map.containsKey(temp)){
                map.put(temp,map.get(temp)+1);
                max = (map.get(temp)+1>max?map.get(temp)+1:max);
            }else{
                map.put(temp,1);
            }
        }
        Object[] k = map.keySet().toArray();
        Object[] v = map.values().toArray();
        for(int i = max;i>0;i--){
            for(int j = 0 ;j<k.length;j++){
                if(v[j].equals(i)){
                    System.out.println(k[j]+" "+v[j]);
                }
            }
        }
    }
}


