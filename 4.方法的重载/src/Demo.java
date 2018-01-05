public class Demo {
    public static void main(String args[]) {
        // 方法重载之后执行语句时会根据传入参数的类型或个数的不同调用不同的方法体
        System.out.println("两个整型参数：" + add(10, 20));
        System.out.println("三个整型参数：" + add(10, 20, 30));
        System.out.println("两个浮点型参数：" + add(10.2, 20.3));
    }
    /**
     * 实现两个整型数字的加法计算操作
     * @param x 操作数字一
     * @param y 操作数字二
     * @return 两个整型数据的加法计算结果
     */
    public static int add(int x, int y) { 			// add()方法一共被重载三次
        return x + y;
    }
    /**
     * 实现三个整型数字的加法计算操作
     * @param x 操作数字一
     * @param y 操作数字二
     * @param z 操作数字三
     * @return 三个整型数据的加法计算结果
     */
    public static int add(int x, int y, int z) { 		// 与之前的add()方法的参数个数不一样
        return x + y + z;
    }
    /**
     * 实现两个小数的加法计算操作
     * @param x 操作数字一
     * @param y 操作数字二
     * @return 两个小数的加法计算结果
     */
    public static double add(double x, double y) {		// 与之前的add()方法的参数类型不一样
        return x + y;
    }
}
