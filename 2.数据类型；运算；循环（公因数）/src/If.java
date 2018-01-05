import java.util.Scanner;

public class If {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        double score = input.nextDouble();            // 输入，整数一般用int，小数则用double
        if (score < 60.0) {						   // 条件判断
            System.out.println("小白的成绩！") ;
        } else if (score >= 60 && score <= 90) {		// 条件判断
            System.out.println("中等成绩") ;
        } else if (score > 90 && score <= 100) {		// 条件判断
            System.out.println("优秀成绩") ;
        } else {								// 条件判断都不满足
            System.out.println("这么怪异?！") ;
        }
    }
}
