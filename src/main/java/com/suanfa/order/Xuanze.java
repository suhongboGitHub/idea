package com.suanfa.order;

import java.util.Arrays;

/**
 * @ClassName Xuanze
 * @Description : 功能说明
 * 选择排序法
 * @Author : shb
 * @Date : 2021/7/15 19:18
*/
public class Xuanze {

    public static void main(String[] args) {
       int [] arr=new int[]{1,7,2,9,4};
       new Xuanze().sort(arr);
        System.out.println(Arrays.toString(arr));

    }

    public void sort(int []  arr){


        for(int i=0;i<arr.length;i++){
            int index=i;
            for(int j =i+1;j<arr.length;j++){
                if(arr[j]<arr[index]){

                    index=j;
                }

            }
            if(index!=i){
                int temp=arr[i];
                arr[i]=arr[index];
                arr[index]=temp;
            }

        }

    }
}
