package com.springboot.ssm.utils;

import java.util.Scanner;
import java.util.Map;
import java.util.HashMap;
public class MainUtils{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // 注意 hasNext 和 hasNextLine 的区别
        while (in.hasNextLine()) { // 注意 while 处理多个 case
            //缓存报告金币数
            String m = in.nextLine();
            //文件标识
            String b = in.nextLine();
            //文件大小
            String c = in.nextLine();

            String[] arrB = b.split(" ");
            String[] arrC = c.split(" ");
            //相同文件的总大小
            Map<String,Integer> mapB = new HashMap<>();
            for(int i = 0;i<arrB.length;i++) {
                if(mapB.containsKey(arrB[i])) {
                    mapB.put(arrB[i],mapB.get(arrB[i]) + Integer.valueOf(arrC[i]));
                } else {
                    mapB.put(arrB[i],Integer.valueOf(arrC[i]));
                }
            }
            //如果(同文件金币数总和)>(报告金币数+一个文件金币数)，则需输出报告
            for(Map.Entry<String,Integer> entry : mapB.entrySet()) {
                String key = entry.getKey();
                Integer value = entry.getValue();
            }



        }
    }
}