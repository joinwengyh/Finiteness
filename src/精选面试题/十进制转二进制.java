package 精选面试题;

import java.math.BigInteger;
import java.util.Scanner;

/**
 * @Author Hua
 * @Date: 2021/11/18 19:48
 */
public class 十进制转二进制 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("pleaase enter a big number: ");
        while (!scan.hasNext("#")) {
            //收入字符#号结束

            //toString(2) 表示转换为2进制
            System.out.println(new BigInteger(scan.next()).toString(2));
        }
    }
}
