import java.util.Scanner;
public class Factor {
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("请输入两个数字");
        int a = input.nextInt();
        int b = input.nextInt();
        int c = 1;
        while(c!=0){
            c=a%b;
            a = b;
            b = c;}
        System.out.println("这两个数的最大公因数是"+a);
    }
}