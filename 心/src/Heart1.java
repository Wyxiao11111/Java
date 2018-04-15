import java.util.Random;

public class Heart1 {
    public static void main(String[] args) {
        int X = 1;
        while (X != 5201314) {
            int a = 1;
            int b = 10000000;
            Random random = new Random();
            X = random.nextInt(b) % (b - a + 1) + a;
            System.out.println(X);
        }

        for(float y = (float) 1.5;y>-1.5;y -=0.1)
        {
            for(float x= (float) -1.5;x<1.5;x+= 0.05)
            {
                float a = x*x+y*y-1;
                if((a*a*a-x*x*y*y*y) <= 0.0)
                {


                    System.out.print("*");

                }
                else
                    System.out.print(" ");
            }
            System.out.print("\n");
        }
    }


}