package com.suanfa.order;

import java.util.Arrays;

public class Maopao {

    /**
     * 冒泡排序
     * 2 7  3  4  5
     *
     * */
    public static void main(String[] args) {
        int[] arr=new int[]{99,2,5,1,3,4};
        for(int i=0;i<arr.length-1;i++){

            for(int j=0;j<arr.length-1-i;j++){
                if(arr[j+1]<arr[j]){
                    int temp=arr[j+1];
                    arr[j+1]=arr[j];
                    arr[j]=temp;
                }
            }

            System.out.println(Arrays.toString(arr));
        }
        System.out.println("最后结果：");
        System.out.println(Arrays.toString(arr));

    }
}
