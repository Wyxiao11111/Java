import java.util.Scanner;

public class Xiang2 {
    public static void main(String args[]){
        System.out.print("输入台阶数");
        Scanner input = new Scanner(System.in);
        int s = input.nextInt();
        double a[] = new double [s];
        double sum = 0;
        if(s == 1){
            System.out.println(1);
        }
        if(s == 2){
            System.out.println(2);
        }
        if(s == 3){
            System.out.println(4);
        }
        if(s > 3){
            a[0] = 1;
            a[1] = 2;
            a[2] = 4;
            for(int i =3; i < s; i++) {
                sum = 0;
                for (int m = 0; m < i; m++) {
                    sum = sum + a[m];
                }
                a[i] = sum + 1;
            }
            System.out.println("共有"+a[s-1]+"种走法");
        }
    }
}