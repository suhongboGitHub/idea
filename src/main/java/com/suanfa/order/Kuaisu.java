package com.suanfa.order;

import java.util.Arrays;

/**
 * @ClassName Kuaisu
 * @Description : 功能说明
 * 快速排序算法
 * @Author : shb
 * @Date : 2021/7/15 12:39
*/
public class Kuaisu {


    public static void main(String[] args) {
        int [] arr=new int[]{1,8,2,9,7,3,4,88,212,1,3,4};

        sort(arr,0,arr.length-1);

        System.out.println(Arrays.toString(arr));

    }


    public static void sort(int [] arr,int start,int end){
        if (start>=end){
            return;
        }

        //从 数组 中取一个标准数
        int num=arr[start];
        //记录一下开始和结束坐标
        int low=start;
        int high=end;
        while (low<high){

            //将高位坐标精确再次精确一下
            while (low<high&&arr[high]>=num){
                high--;
            }
            //精确到位之后，出现 小于标准数时
            arr[low]=arr[high];

            //再精确一下低位坐标
            while (low<high&&arr[low]<=num){
               low++;
            }
            //精确到位后，出现大于标准数时
            arr[high]=arr[low];
        }
        //排序完后，把标准数赋值回数组
        arr[low]=num;
        //左边的再排序一次
        sort(arr,0,low);
        //右边的再排序一次
        sort(arr,low+1,end);
    }
}
