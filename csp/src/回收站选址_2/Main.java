package 回收站选址_2;

import java.util.Scanner;

public class Main{
    public static void main(String[] args) {

        Integer[] value= {0,0,0,0,0};

        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        Point[] p = new Point[num];
        for(int i = 0;i<num;i++) {
            p[i]=new Point();
            int x = in.nextInt();
            int y = in.nextInt();
            p[i].setX(x);
            p[i].setY(y);
        }

        for(int i=0;i<num;i++) {
            p[i].prepare(p);
            int n = p[i].value;
            if(p[i].is==4)
                value[n]++;
        }

        for(int v :value){
            System.out.println(v);
        }
        in.close();
    }

    public static class Point{
        public int x;
        public int y;
        public int value;
        public int is;

        public Point(){
            this.x = 0;
            this.y = 0;
            this.value = 0;
            this.is = 0;
        }

        public void setX(int x) {
            this.x = x;
        }


        public void setY(int y) {
            this.y = y;
        }

        public void prepare(Point[] p) {
            for(Point pp:p) {
                if((pp.x==x+1&&pp.y==y)||(pp.x==x-1&&pp.y==y)||(pp.x==x&&pp.y==y+1)||(pp.x==x&&pp.y==y-1))
                    this.is++;
                if((pp.x==x+1&&pp.y==y+1)||(pp.x==x+1&&pp.y==y-1)||(pp.x==x-1&&pp.y==y+1)||(pp.x==x-1&&pp.y==y-1))
                    this.value++;
            }
        }
    }
}
