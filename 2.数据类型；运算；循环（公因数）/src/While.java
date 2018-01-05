public class While {
    public static void main(String args[]) {
        int sum = 0; 				// 保存总和
        int current = 1; 				// 循环的初始化条件
        while (current <= 100) { 		// 循环结束条件
            sum += current; 			// 累加
            current++;				// 改变循环条件
        }
        System.out.println(sum);
    }
}
