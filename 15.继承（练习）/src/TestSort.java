public class TestSort {
    public static void main(String args[]) {
        SortArray arr = new SortArray(3);			// 实例化数组操作类对象，可操作数组长度为3
        System.out.print(arr.add(20) + "、");		// 可以保存数据
        System.out.print(arr.add(10) + "、");		// 可以保存数据
        System.out.print(arr.add(30) + "、");		// 可以保存数据
        System.out.println(arr.add(100) + "、");	// 不可以保存数据，返回false
        int[] temp = arr.getData();					// 取得全部数组数据
        for (int x = 0; x < temp.length; x++) {		// 循环输出数据
            System.out.print(temp[x] + "、");
        }
    }
}
