public class Xiang {
    static int len = 0;
    static double sum = 0;
    static final int s = 10;
    static int step[] = new int[s];
    static void finish(final int stair) {
        if (stair < 0)
            return;
        if (stair == 0) {
            printSum();
            sum++;
            return;
        }
        for (int i = 1; i <= 10; i++) {
            step[len] = i;
            len++;
            finish(stair - i);
            len--;
        }
    }
    static void printSum(){
        System.out.print("走法");
        for (int m = 0; m < len; m++)
            System.out.print(step[m]+" ");
        System.out.println();
    }
    public static void main(String args[]){
        finish(s);
        System.out.println("共有"+sum+"种方法");
    }
}
