package 字符串匹配_3;

import java.util.Scanner;
/*next() 与 nextLine() 区别
next():

1、一定要读取到有效字符后才可以结束输入。
2、对输入有效字符之前遇到的空白，next() 方法会自动将其去掉。
3、只有输入有效字符后才将其后面输入的空白作为分隔符或者结束符。
next() 不能得到带有空格的字符串。
nextLine()：

1、以Enter为结束符,也就是说 nextLine()方法返回的是输入回车之前的所有字符。
2、可以获得空白。
*/
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //录入字符串s
        String string = scanner.nextLine();
        //录入大小写是否敏感的标志
        //当数字为0时表示大小写不敏感，当数字为1时表示大小写敏感。
        int flag = scanner.nextInt();
        //录入有多少行需要去做判断
        int num = scanner.nextInt();
        //录入需要做判断的Num行数据
        String[] strings = new String[num];
        for (int i = 0; i < num ; i++) {
            strings[i] = scanner.next();
        }
        //处理大小写敏感的数据
        if (flag == 1) {
            //遍历检测录入的n行字符串是否包含目标字符串s
            for (int i = 0; i < num; i++) {
                //.contains()方法是大小写敏感
                if (strings[i].contains(string)) {
                    System.out.println(strings[i]);
                }
            }
            //如果大小写不敏感
            //在使用.contains()方法的时候，要将主串、目标串都转换成小写或者大写
        }else {
            for (int i = 0; i < num; i++) {
                if (strings[i].toUpperCase().contains(string.toUpperCase())) {
                    System.out.println(strings[i]);
                }
            }
        }


    }
}
