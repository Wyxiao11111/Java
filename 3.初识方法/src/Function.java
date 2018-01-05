public class Function {
    public static void main(String args[]) {
        set(100);					// 正常执行输出
        set(3);						// 满足方法判断条件，会中断输出操作
        set(10);		        	// 正常执行输出
    }
    /**
     * 定义一个设置数据的操作方法，如果该数据为3将无法设置
     * @param x 要设置的数据内容
     */
    public static void set(int x) {	// 方法声明为void
        if (x == 3) {					// 判断语句
           return; 					// 方法后面的内容不执行了
        }
        System.out.println("x = " + x);
    }
}
