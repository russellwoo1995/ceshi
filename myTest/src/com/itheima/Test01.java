package com.itheima;
/*
   导包：
   1、手动导包： import until.Scanner;
   2、快捷键导包：Alt+Enter
   3、自动导包：
*/

import java.util.Scanner;//导包

public class Test01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);//创建对象

        System.out.println("请输入一个星期数：");
        int week = sc.nextInt();//接收数据
        switch (week) {
            case 1:
                System.out.println("跑步");
                break;
            case 2:
                System.out.println("游泳");
                break;
            case 3:
                System.out.println("慢走");
                break;
            case 4:
                System.out.println("动感单车");
                break;
            case 5:
                System.out.println("拳击");
                break;
            case 6:
                System.out.println("爬山");
                break;
            case 7:
                System.out.println("好好吃一顿");
                break;
            default:
                System.out.println("你输入的星期数有误");
        }
    }


}
