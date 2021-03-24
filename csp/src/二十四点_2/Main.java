package 二十四点_2;
/*
10
9+3+4*3
5+4*5*5
7-9-9+8
5*6/5*4
3+5+7+9
1*1-9+9
1*9-5/9
8/5+6*9
6*7-3*6
6*4+4/5
 */
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        boolean tag;
        for(int i = 0;i<n;i++){
            char[] c = null;
            while(c==null||c.length==0){
                String s = in.nextLine();
                c = s.toCharArray();
            }
            int s1 = c[0]-'0';
            int s2 = c[2]-'0';
            int s3 = c[4]-'0';
            int s4 = c[6]-'0';
            tag = js(s1,s2,s3,s4,c[1],c[3],c[5])==24;
            if(tag){
                System.out.println("Yes");
            }else{
                System.out.println("No");
            }
        }
    }

    public static int js(int s1,int s2,int s3,int s4,char f1,char f2,char f3){
        int s = 0;
        if(f1=='+'||f1=='-'){
            if(f2=='+'||f2=='-'){
                if(f3=='+'||f3=='-'){
                    return js2(js2(js2(s1,s2,f1),s3,f2),s4,f3);
                }else{
                    return js2(js2(s1,s2,f1),js2(s3,s4,f3),f2);
                }
            }
            else{
                if(f3=='+'||f3=='-'){
                    return js2(js2(s1,js2(s2,s3,f2),f1),s4,f3);
                }else{
                    return js2(s1,js2(js2(s2,s3,f2),s4,f3),f1);
                }
            }
        }else{
            if(f2=='+'||f2=='-'){
                if(f3=='+'||f3=='-'){
                    return js2(js2(js2(s1,s2,f1),s3,f2),s4,f3);
                }else{
                    return js2(js2(s1,s2,f1),js2(s3,s4,f3),f2);
                }
            }
            else{
                if(f3=='+'||f3=='-'){

                    return js2(js2(js2(s1,s2,f1),s3,f2),s4,f3);
                }else{

                    return js2(js2(js2(s1,s2,f1),s3,f2),s4,f3);
                }
            }
        }

    }

    public static int js2(int i1,int i2,char f){
        if(f=='+'){
            return i1+i2;
        }else if(f=='-'){

            return i1-i2;
        }else if(f=='/'){

            return i1/i2;
        }else{

            return i1*i2;
        }
    }

}
