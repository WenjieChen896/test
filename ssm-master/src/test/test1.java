package test;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName test1
 * @Description  0-999  一个数字等于他个十百位的立方 x = x个3+x十3+x百3
 * @Author chenwj
 * @Date2018/10/14 8:34
 * @Version 1.0
 */
public class test1 {

public static void main(String[] args){


    List<Integer> list = new ArrayList<Integer>();
    for (int x=0;x<1000;x++){
        //个位
        int a = x%10 ;
        int b = x/10%10 ;
        int c = x/10/10%10 ;

            if(x==a*a*a+b*b*b+c*c*c) {
                System.out.println(x+"ccc");
                list.add(x);
            };


    }
    for (int i=0 ;i<list.size();i++){
        System.out.print(list.get(i)+" ");
    }


}


}
