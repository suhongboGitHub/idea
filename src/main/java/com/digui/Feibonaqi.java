package com.digui;


/**
 * @ClassName Feibonaqi
 * @Description : 功能说明
 * 斐波那契数列 递归获取值
 * @Author : shb
 * @Date : 2021/7/14 23:35
*/
public class Feibonaqi {


    /**
     * @ClassName Feibonaqi
     * @Description : 功能说明
     * 斐波那契数列特点   1 1 2 3 5 8  ...  后面的值等于前面两位的值相加
     * @param index
     * @Return : int
     * @Author : shb
     * @Date : 2021/7/14 23:39
    */
    public int feibonaqiSearch(int index){
        if(index==0||index==1){
            return 1;
        }else{
            return  feibonaqiSearch(index-1)+feibonaqiSearch(index-2);
        }

    }


//    1. 43 1 19 13
//    2. 24
//    3. 5
//    4. 2
//    5. 4608
//    6. JDK java开发工具包 、JRE：java运行时环境、JVM：java虚拟机、JIT：即时编译器
//    7. ps -ef | grep java
//    8. netstat  -anp  |grep 8080
//    9. df /etc
//    10. rsync -avz --exclude *.pth --exclude *.pkl \  /var/mysql/ \ /home/gzcb/
//    11. Https 是http的加密版，传输更加安全， https、http必须在tcp建立连接后，开始定义传输内容的规范，并同时传输数据。简单点就是TCP是建立通道连接像一座桥，http、https是定义数据传输的规则。


    public static void main(String[] args) {

        int n=8;
        int result=(n*(n+1)/2)*(1<<(n -1));
        System.out.println("n is:"+ result);

    }


    /*
    *
    * */
    public static int countBitsTozeroBasedOnString(int n) {
        int ctr = 0;
        String binaryNumber = Integer.toBinaryString(n);
        for (char ch:binaryNumber.toCharArray()){
            ctr+=ch=='0'?1:0;
        }
        return ctr;

    }

}
