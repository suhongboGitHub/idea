package com.suanfa.search;

/**
 * @ClassName Erfen
 * @Description : 功能说明
 * 二分查找法
 *
 * @Return :
 * @Author : shb
 * @Date : 2021/7/14 22:45
*/
public class Erfen {

    /**
     * @ClassName Erfen
     * @Description : 功能说明
     * 二分查找法， 数组必须有序
     * @param target
     * @Return : int
     * @Author : shb
     * @Date : 2021/7/14 22:47
    */
    public int search(int target){
        int [] arr=new int[]{1,2,3,4,5,6,7,8,9,10};
//        记录最小查找位置索引
        int begin=0;
//        记录最大查找位置索引
        int end=arr.length-1;

//        记录居中索引
        int mid;

//        记录目标索引位置
        int result=-1;

        while (begin<=end){
            mid=(begin+end)/2;
            if(arr[mid]==target){
               result=mid;
               break;
            }else{
                if(arr[mid]>target){
                    end=mid-1;
                }else{
                    begin=mid+1;
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(new Erfen().search(111));

    }
}
