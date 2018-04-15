import java.util.Scanner;

public class Order {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        System.out.println("请输入十个数字(如1,2,3.....)");
        /*
        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();
        int d = input.nextInt();
        int e = input.nextInt();
        int f = input.nextInt();
        int g = input.nextInt();
        int h = input.nextInt();
        int i = input.nextInt();
        int j = input.nextInt();
        int data[] = new int[]{a,b,c,d,e,f,g,h,i,j};
        */
        String str = input.nextLine();
        int data[] = new int[10];
        String [] list = str.split(",");
        for (int i = 0; i<10; i++)
            data[i] = Integer.parseInt(list[i]);
        System.out.println("原始数据:");
        get(data);
        order(data);
        System.out.println("升序排列:");
        get(data);
    }
    public static void get (int temp[]){
        for (int x = 0; x < temp.length;x ++){
            System.out.print(temp[x]+"  ");}
        System.out.println("");
    }
    public static void order (int arr[]){
        for (int x = 0;x < arr.length;x++){
            for(int y = 0;y<arr.length-1;y++){
                if(arr[y]>arr[y+1]){
                    int a = arr[y];
                    arr[y] = arr[y+1];
                    arr[y+1] = a;
                }
            }
        }
    }
}