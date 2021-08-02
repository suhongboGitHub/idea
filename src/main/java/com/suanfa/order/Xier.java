package com.suanfa.order;

import java.util.Arrays;

/**
 * @ClassName Xier
 * @Description : 功能说明
 * 插入排序值 希尔排序法
 *
 * @Author : shb
 * @Date : 2021/7/15 13:47
*/
public class Xier {

      public static void sort(int [] arr){

          //按步长划分    d=d/2  可以简写成 d/=2
          for(int d =arr.length/2;d>0;d=d/2){

              for(int i=d;i<arr.length;i+=d){

                  int temp=arr[i];
                  int j;
                  for (j=i-d;j>=0&arr[j]>temp;j-=d){
                      arr[j+d]=arr[j];
                  }
                  arr[j+d]=temp;

              }
          }
          System.out.println(Arrays.toString(arr));

      }

    public static void main(String[] args) {
        sort(new int[]{1,2,4,10,3,2,7,9,8});
    }
}
