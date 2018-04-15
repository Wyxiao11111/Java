import java.util.Scanner;

public class Calculate {
    public static void main(String[] args) {
        System.out.println("请输入需要计算n阶行列式");
        System.out.print("n=");
        Scanner put = new Scanner(System.in);
        int n = put.nextInt();
        double [][] Matrix = new double [n][n];
        for (int x = 0; x < n; x++) {
            for (int y = 0; y < n; y++) {
                Scanner in = new Scanner(System.in);
                System.out.println("请输入第" + (x + 1) + "行，第" + (y + 1) + "个数");
                Matrix[x][y] = in.nextDouble();
            }
        }

        String str = String.valueOf(Det(Matrix, (n-1)));
        for (int a = 0; a < n; a++) {
            for (int b = 0; b < n; b++) {
                System.out.print(" \t "+Matrix[a][b]+" \t ");
            }
            System.out.println("");
        }
        System.out.println("行列式结果是" + str);
    }
    public static double Det(double[][] Matrix, int N)//计算n阶行列式
    {
        int T0;
        int T1;
        int T2;
        double Num;
        int Cha;
        double[][] B;
        if (N > 0) {
            Cha = 0;
            B = new double[N][N];
            Num = 0;
            if (N == 1) {
                return Matrix[0][0] * Matrix[1][1] - Matrix[0][1] * Matrix[1][0];
            }
            for (T0 = 0; T0 <= N; T0++)//T0循环
            {
                for (T1 = 1; T1 <= N; T1++)//T1循环
                {
                    for (T2 = 0; T2 <= N - 1; T2++)//T2循环
                    {
                        if (T2 == T0) {
                            Cha = 1;
                        }
                        B[T1 - 1][T2] = Matrix[T1][T2 + Cha];
                    }//T2循环
                    Cha = 0;
                }//T1循环
                Num = Num + Matrix[0][T0] * Det(B, N - 1) * Math.pow((-1), T0);
            }//T0循环
            return Num;
        } else if (N == 0) {
            return Matrix[0][0];
        }
        return 0;
    }
}