package 碰撞的小球_2;
/*
3 10 5
4 6 8
 */
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int l = in.nextInt();
        int t = in.nextInt();
        Map<Integer, Ball> balls = new HashMap<>();
        for (int i = 0; i < n; i++) {
            Ball ball = new Ball(i, in.nextInt(), l);
            balls.put(i, ball);
        }
        run(balls, t);
    }

    public static void run(Map<Integer, Ball> balls, int t) {
        if (t == 0) {
            for (int i = 0; ; i++) {
                if(!balls.containsKey(i)){
                    break;
                }
                System.out.print(balls.get(i).loc + " ");

            }
            return;
        }
        Map<Integer, Ball> map = new HashMap<>();
        balls.forEach((i, ball) -> {
            ball.move();
            if (map.containsKey(ball.loc)) {
                map.get(ball.loc).dir = -map.get(ball.loc).dir;
                ball.dir = -ball.dir;
            } else {
                map.put(ball.loc, ball);
            }
        });

        run(balls, t - 1);
    }

}


class Ball {
    int num;//序号
    int loc;//位置
    int dir = 1;//方向
    int l;

    public Ball(int num, int loc, int l) {
        this.num = num;
        this.loc = loc;
        this.l = l;
    }


    public void move() {
        if (loc == l || loc == 0) {
            dir = -dir;
        }
        loc = loc + dir;
    }
}
