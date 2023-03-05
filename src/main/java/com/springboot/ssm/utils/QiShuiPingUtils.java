package com.springboot.ssm.utils;

import java.util.Scanner;

/**
 * 链接：https://www.nowcoder.com/questionTerminal/fe298c55694f4ed39e256170ff2c205f
 * 来源：牛客网
 * <p>
 * 某商店规定：三个空汽水瓶可以换一瓶汽水，允许向老板借空汽水瓶（但是必须要归还）。
 * 小张手上有n个空汽水瓶，她想知道自己最多可以喝到多少瓶汽水。
 * 数据范围：输入的正整数满足
 * 1≤n≤100 .
 *
 * @Author chensy
 * @Description
 * @Modified by :
 * @params
 * @return
 */
// 注意类名必须为 Main, 不要有任何 package xxx 信息
public class QiShuiPingUtils {

    /**
     * 思路，每两个汽水瓶换一个，所以除以2就行了。.
     *
     * @return
     * @Author chensy
     * @Description
     * @Modified by :
     * @params
     */
    public static void second(int a) {

        if (a == 0) {
            System.out.println("程序结束");
        } else {
            System.out.println(a / 2);
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // 注意 hasNext 和 hasNextLine 的区别
        while (in.hasNextInt()) { // 注意 while 处理多个 case
            int a = in.nextInt();
            if (a == 0) {
                break;
            }
            if (a == 1) {
                System.out.println(0);
            } else if (a == 2) {
                System.out.println(1);
            } else {
                //设置能喝到的汽水瓶数count
                int count = 0;
                //定义变量
                int num = 0;
                int otherNum = 0;
                while (true) {
                    //计算可换多少瓶汽水
                    num = a / 3;
                    count += num;
                    //计算换完汽水后的剩余空汽水瓶
                    otherNum = a % 3;
                    //计算换到的汽水瓶喝完后与剩余空汽水瓶的和
                    a = num + otherNum;
                    if (num + otherNum == 4 || num + otherNum == 5) {
                        count += 2;
                        break;
                    } else if (num == 2 && otherNum == 0) {
                        count += 1;
                        break;
                    } else if (num == 1 && otherNum == 0) {
                        break;
                    }
                }
                System.out.println(count);

            }


        }
    }
}