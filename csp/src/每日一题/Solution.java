package 每日一题;


import java.util.*;

public class Solution {
    public static void main(String[] args) {

        int[][] nums = {{1, 1, 1}, {1, 0, 1}, {1, 1, 1}};
        int n = 00000000000000000000000000001011;
//        Scanner scan = new Scanner(System.in);
//
//
//        scan.close();
    }


    public static boolean canJump(int[] nums) {
        
        return false;
    }

    public static int calculate(int an, char b, int cn) {
//        int an = Integer.parseInt(a);
//        int cn = Integer.parseInt(c);
        switch (b) {
            case '+':
                return an + cn;
            case '-':
                return an - cn;
            case '*':
                return an * cn;
            case '/':
                return an / cn;
        }
        return 0;
    }

    static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    static class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }
}
