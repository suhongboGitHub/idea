package com.digui;

/**
 * @ClassName Hannuota
 * @Description : 功能说明
 * 汉诺塔递归算法  （以最小的步骤移动盘子）
 * @Author : shb
 * @Date : 2021/7/15 1:02
*/
public class Hannuota {

    /**
     * @ClassName Hannuota
     * @Description : 功能说明
     *
     * @param n  盘子个数
     * @param from 在哪个柱子
     * @param mid 中间的柱子
     * @param end 目标柱子
     * @Return : void
     * @Author : shb
     * @Date : 2021/7/15 1:04
    */
    public void move(int n,String from,String mid ,String end){

        if(n==1){
            System.out.println("第"+n+"个盘子从"+from+"移动到"+end);
        }else{
            move(n-1,from,end,mid);
            System.out.println("第"+n+"个盘子从"+from+"移动到"+end);
            move(n-1,mid,from,end);
        }
    }

    public static void main(String[] args) {
        new Hannuota().move(3,"柱子A","柱子B","柱子C");
    }
}
