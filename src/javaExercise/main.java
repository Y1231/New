package javaExercise;

import java.util.Collections;
import java.util.Scanner;

public class main {
    /*
    依次输入一个学生的学号，以及3科（C语言，数学，英语）成绩，在屏幕上输出该学生的学号，3科成绩。
输入描述:学号以及3科成绩，学号和成绩之间用英文分号隔开，成绩之间用英文逗号隔开
     */
    public static void main(String[] args) {
        /*Scanner sc = new Scanner(System.in);
        String score = sc.nextLine();
        String[] s = score.split(";");
        String[] s2 = s[1].split(",");
        System.out.printf("The each subject score of  No. %d is %.2f, %.2f, %.2f.", Integer.valueOf(s[0]), Float.valueOf(s2[0]),  Float.valueOf(s2[1]),  Float.valueOf(s2[2]));
    }
*/



/*
        Scanner sc = new Scanner(System.in);

        while (sc.hasNext()) {
            //接受数字输入

            //String temp = String.join("", Collections.nCopies(n + 1, " "));
            for (int i = 1; i <= 5; i++) {
                //输出n-i个空格" ",以及拼接字符串->在i个*中插入空格" "
                //Collections.nCopies(i, "*") 是复制i-1个*，如i=3，就是***
                //下面的String.join方法是在字符串空隙中插入指定字符串，如***，变成* * *
                System.out.println(String.join("", Collections.nCopies(n - i, " ")) +
                        String.join(" ", Collections.nCopies(i, "1")) + " ");*/




        }

}
