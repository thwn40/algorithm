package Programmers;

import java.util.LinkedList;

public class Solution1835 {
    static int depth = -1;
    static int answer = 0;
    static String[] datas;

    public static int solution(int n, String[] data) {
        String[] arr = {"A", "C", "F", "J", "M", "N", "R", "T"};
        datas = data;
        LinkedList<String> perArr = new LinkedList<>();
        int[] perCheck = new int[arr.length];
        permutation(arr.length, 8, perArr, perCheck, arr);
        System.out.println(count);
        return answer;
    }

    static int count = 0;

    private static void permutation(int n, int r, LinkedList<String> perArr, int[] perCheck, String[] arr) {


        if (perArr.size() == r) {
            if(checkCondition(""))
                answer++;
            return;
        }
        for (int i = 0; i < n; i++) {
            if (perCheck[i] == 0) {
                perArr.add(arr[i]); //값을 넣는 부분
                perCheck[i] = 1;
                permutation(n, r, perArr, perCheck, arr);
                perCheck[i] = 0;
                perArr.removeLast();
            }
        }
    }

    public static void main(String[] args) {
        System.out.println(solution(2,new String[]{"N~F=0", "R~T>2"}));




    }

    public static boolean checkCondition(String lines) {
        for (int i = 0; i < datas.length; i++) {
            int index1 = lines.indexOf(datas[i].charAt(0) + "");
            int index2 = lines.indexOf(datas[i].charAt(2) + "");
            int value = index1 > index2 ? index1 - index2 - 1 : index2 - index1 - 1;
            if (datas[i].charAt(3) == '=' && value != datas[i].charAt(4) - '0') {
                return false;
            } else if (datas[i].charAt(3) == '>' && value <= datas[i].charAt(4) - '0') {
                return false;
            } else if (datas[i].charAt(3) == '<' && value >= datas[i].charAt(4) - '0') {
                return false;
            }
        }
        return true;
    }
}
