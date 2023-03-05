package com.springboot.ssm.utils;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/**
 * 明明的随机数.
 * 明明生成了
 * �
 * N个1到500之间的随机整数。请你删去其中重复的数字，即相同的数字只保留一个，把其余相同的数去掉，
 * 然后再把这些数从小到大排序，按照排好的顺序输出。
 *
 * 数据范围：
 * 1≤n≤1000  ，输入的数字大小满足1≤val≤500
 * 时间限制：C/C++ 1秒，其他语言2秒
 * 空间限制：C/C++ 32M，其他语言64M
 * 输入描述：
 * 第一行先输入随机整数的个数 N 。
 * 接下来的 N 行每行输入一个整数，代表明明生成的随机数。
 * 具体格式可以参考下面的"示例"。
 * 输出描述：
 * 输出多行，表示输入数据处理后的结果
 *
 * 示例1
 * 输入例子：
 * 3
 * 2
 * 2
 * 1
 * 输出例子：
 * 1
 * 2
 * 例子说明：
 * 输入解释：
 * 第一个数字是3，也即这个小样例的N=3，说明用计算机生成了3个1到500之间的随机整数，接下来每行一个随机数字，共3行，也即这3个随机数字为：
 * 2
 * 2
 * 1
 * 所以样例的输出为：
 * 1
 * 2
 * @Author:chensy
 * @Date:
 * @Description
 * @Modified By:
 */
public class MingMingRandomUtils {

    public static void main(String[] args) {
        //定义数列存放输入的数字
        List<Integer> list = new ArrayList<Integer>();
        Scanner in = new Scanner(System.in);
        // 注意 hasNext 和 hasNextLine 的区别
        while (in.hasNextInt()) { // 注意 while 处理多个 case
            int a = in.nextInt();
            if(!list.contains(a)) {
                list.add(a);
            }
        }
        if(list.size() >= 2) {
            //去除第一个代表数字个数的元素
            list.remove(0);
            //排序
            Collections.sort(list);

            //输出
            for(int i = 0;i<list.size();i++) {
                System.out.println(list.get(i));
            }
        }
    }

}
