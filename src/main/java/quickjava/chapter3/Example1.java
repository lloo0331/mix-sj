package quickjava.chapter3;

import java.util.concurrent.ThreadLocalRandom;

/*
 * 3.1
 * 编写一段代码，将a设置为一个n个随机整数的数组，要求随机数介于0和n之间。
 */
public class Example1 {

    public static void main(String args[]){

        int[] arr = randomNum(5);
        for(int i :arr){
            System.out.println(i);
        }

    }

    /*
     * 3.1
     * 编写一段代码，将a设置为一个n个随机整数的数组，要求随机数介于0和n之间。
     */
    public static int[] randomNum(int n){
        if(n<0){
            return null;
        }
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = ThreadLocalRandom.current().nextInt(n);
        }
        return arr;
    }

}
