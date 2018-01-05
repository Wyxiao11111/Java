public class For {
    public static void main(String args[]) {
        int sum = 0; 			// 保存总和
        // 设置循环初始化条件current，同时此变量作为累加操作使用
        // 每次执行循环体前都要进行循环判断（current <= 100）
        // 循环体执行完毕后会自动执行“current++”改变循环条件
        for (int current = 1; current <= 100; current++) {
           sum += current;		// 循环体中实现累加操作
        }
        System.out.println(sum);
    }
}
