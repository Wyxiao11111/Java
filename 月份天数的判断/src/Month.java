import java.util.Scanner;
public class Month {
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("请输入年份");
        int year = input.nextInt();
        System.out.println("请输入月份");
        int month = input.nextInt();
        if(month==2){
            if (((year % 100 == 0) && (year % 400 == 0))
                    || ((year % 100 != 0) && (year % 4 == 0))) {
                System.out.println(year+"年的"+month+"月份天数是29天");
                return;
            }else {
                System.out.println(year+"年的"+month+"月份天数是28天");
                return;
            }
        }else if(month == 4 || month == 6 || month == 9 || month == 11) {
            System.out.println(year+"年的"+month+"月份是30天");
        }else if(month == 1 || month == 3 || month ==5|| month == 7 || month == 8 || month ==10 || month == 12) {
            System.out.println(year+"年的"+month+"月份是31天");
        }
    }
}