package test;


import java.io.*;

/**
 * @ClassName test2
 * @Description 读文件  改内容  写入另一个文件
 * @Author chenwj
 * @Date2018/10/14 9:18
 * @Version 1.0
 */
public class test2 {


public static void main(String[] args) throws Exception{
    String path = "D:\\Test/test.txt";
    String path1 = "D:\\Test/test1.txt";
    File file = new File(path);
    File file1 = new File(path1);
    BufferedReader bf = new BufferedReader(new FileReader(file));
    PrintWriter pw = new PrintWriter(file1);
    String str = null;
    while((str =bf.readLine())!=null){
        System.out.println("111111111111"+str);
        if (str.contains("String")){
            str=str.replace("String","StringBUffer");
            System.out.println("222"+str);
        }
        System.out.println("333"+str);
        pw.print(str+"\r\n");
    }
    pw.close();


}

    
}
