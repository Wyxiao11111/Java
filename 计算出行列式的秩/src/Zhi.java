import java.util.Scanner;

public class Zhi {
    public static void main(String[] args) {
        System.out.println("请输入需要计算n行 m列矩阵");
        System.out.print("n=");
        Scanner put = new Scanner(System.in);
        int n = put.nextInt();
        System.out.print("m=");
        int m = put.nextInt();
        double[][] Matrix = new double[n][m];
        for (int x = 0; x < n; x++) {
            for (int y = 0; y < m; y++) {
                Scanner in = new Scanner(System.in);
                System.out.println("请输入第" + (x + 1) + "行，第" + (y + 1) + "个数");
                Matrix[x][y] = in.nextDouble();
            }
        }

        String str = String.valueOf(Det(Matrix,n,m));
        for (int a = 0; a < n; a++) {
            for (int b = 0; b < m; b++) {
                System.out.print(" \t " + Matrix[a][b] + " \t ");
            }
            System.out.println("");
        }
        System.out.println("矩阵的秩是" + str);
    }


    public static int Det(double[][] Matrix, int error_, int List)
    {
        int n = List;
        int m = Matrix.length ;
        int i = 0;
        int j = 0;
        int i1, j1;
        double temp1;

        if(m > n)
        {
            i = m;
            m = n;
            n = i;
            i = 1;
        }

        m -= 1;
        n -= 1;

        double[][]temp = new double[m+1][n+1];

        if(i == 0)
        {
            for(i = 0; i <= m; i++)
            {
                for(j = 0; j <= n; j++)
                {
                    temp[i][j] = Matrix[i][j];
                }
            }
        } else
        {
            for(i = 0; i <= m; i++)
            {
                for(j = 0; j <= n; j++)
                {
                    temp[i][j] = Matrix[j][i];
                }
            }
        }

        if(m == 0)
        {
            i = 0;
            while(i <= n)
            {
                if(Matrix[0][i] != 0)
                {
                    return 1;
                }
                i += 1;
            }
            return 0;
        }

        double error0;
        if(error_ == -1)
        {
            error0 = Math.pow(0.1, 10);
        }
        else
        {
            error0 = Math.pow(0.1, error_);
        }

        i = 0;

        while(i <= m)
        {
            j = 0;
            while(j <= n)
            {
                if(temp[i][j] != 0)
                {
                    error0 *= temp[i][j];
                    i = m;
                    break;
                }
                j += 1;
            }
            i += 1;
        }

        double error1;
        for(i = 0; i <= m; i++)
        {
            j = 0;
            while(j <= n)
            {
                if(temp[i][j] != 0)
                {
                    break;
                }
                j += 1;
            }

            if(j <= n)
            {
                i1 = 0;
                while(i1 <= m)
                {
                    if(temp[i1][j] != 0 && i1 != i)
                    {
                        temp1 = temp[i][j]/temp[i1][j];
                        error1 = Math.abs((temp[i][j] - temp[i1][j]*temp1))*100;
                        error1 += error0;
                        for(j1 = 0; j1 <= n; j1++)
                        {
                            temp[i1][j1] = temp[i][j1] - temp[i1][j1]*temp1;
                            if(Math.abs(temp[i1][j1]) < error1)
                            {
                                temp[i1][j1] = 0;
                            }
                        }
                    }
                    i1 += 1;
                }
            }
        }

        i1 = 0;
        for(i = 0; i <= m; i++)
        {
            for(j = 0; j <= n; j++)
            {
                if(temp[i][j] != 0)
                {
                    i1 += 1;
                    break;
                }
            }
        }
        return i1;
    }
}