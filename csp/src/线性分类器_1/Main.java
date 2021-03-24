package 线性分类器_1;
/*
9 3
1 1 A
1 0 A
1 -1 A
2 2 B
2 3 B
0 1 A
3 1 B
1 3 B
2 0 A
0 2 -3
-3 0 2
-3 1 1
 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int m = scan.nextInt();
        Point[] p = new Point[n];
        int x, y;
        String type;

        for (int i = 0; i < n; i++) {
            x = scan.nextInt();
            y = scan.nextInt();
            type = scan.nextLine();
            p[i] = new Point(x, y, type);
        }

        Line[] lines = new Line[m];
        long t0,t1,t2;
        for(int j=0;j<m;j++){
            t0= scan.nextLong();
            t1= scan.nextLong();
            t2= scan.nextLong();
            lines[j]= new Line(t0,t1,t2);
        }
        int tag=0;
        for(int j=0;j<m;j++){
            boolean b = p[0].judge(lines[j]);
            for(int i=1;i<n;i++){
                tag=0;
                if(p[i].type.equals(p[0].type)&&p[i].judge(lines[j])!=b){
                    System.out.println("No");
                    tag=1;
                    break;
                }else if(!p[i].type.equals(p[0].type)&&p[i].judge(lines[j])==b) {
                    System.out.println("No");
                    tag=1;
                    break;
                }
            }
            if(tag==0){
                System.out.println("Yes");
            }
        }

    }
}

class Line {
    public long t0;
    public long t1;
    public long t2;

    public Line(long t0, long t1, long t2) {
        this.t0 = t0;
        this.t1 = t1;
        this.t2 = t2;
    }
}

class Point {
    public int x;
    public int y;
    public String type;

    public Point(int x, int y, String type) {
        this.x = x;
        this.y = y;
        this.type = type;
    }

    public boolean judge(Line l){

        if(l.t0+l.t1*this.x+l.t2*this.y>0){
            return false;
        }

//        if(l.t2!=0){
//            if(this.y<(-l.t0-l.t1*this.x)/l.t2){
//                return false;
//            }
//        }
//        else{
//            if(this.x<-l.t0/l.t1){
//                return false;
//            }
//        }
        return true;//在直线上方或右方为true
    }

    @Override
    public String toString() {
        return "Point{" +
                "x=" + x +
                ", y=" + y +
                ", type='" + type + '\'' +
                '}';
    }
}
