package com.suanfa.order;

import java.util.Arrays;

/**
 * @ClassName Charu
 * @Description : 功能说明
 * 插入排序 之  直接插入排序法
 * @Return :
 * @Author : shb
 * @Date : 2021/7/15 13:12
*/
public class Charu {


    public static void main(String[] args) {

        int []arr =new int[]{7,5,1,2,8,3,4,7};

        for(int i=1;i<arr.length;i++){
            if(arr[i]<arr[i-1]){
                int temp=arr[i];
                //注意for循环条件 优化
//                int j;
//                for(j=i-1;j>=0&&arr[j]>temp;j--){
//                   arr[j+1]=arr[j];
//                }
//                arr[j+1]=temp;
                //or 这种方式
//                int index=i-1;
//                for( int j=i-1;j>=0;j--){
//                    if(arr[j]>temp){
//                        arr[j+1]=arr[j];
//                        index--;
//                    }
//                }
//                arr[index+1]=temp;

                //多次赋值数组逻辑
                for(int j=i-1;j>=0;j--){
                    if(arr[j]>temp){
                        arr[j+1]=arr[j];
                        arr[j]=temp;
                    }
                }

            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
