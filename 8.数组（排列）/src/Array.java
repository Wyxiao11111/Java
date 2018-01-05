public class Array {
    public static void main(String args[]) {
        int data [] = new int [] {2,1,9,0,5,3,7,6,8} ;
        System.out.print("原数组：");
        print(data);    // 打印原数组
        sort(data);		// 实现排序
        System.out.print("升序排列：");
        print(data);
    }
    /**
     * 数组排序操作，将接收到的数组对象内容进行升序排列
     * @param arr 数组对象的引用
     */
    public static void sort(int arr[]) {					// 这个方法专门负责排序
        for (int x = 0 ; x < arr.length ; x ++) {			// 外层控制排序总体的次数
            for (int y = 0 ; y < arr.length - 1 ; y ++) {		// 内层控制每次的排序控制
              if (arr[y] > arr[y + 1]) {				// 判断需要交换
                    int t = arr[y] ;
                    arr[y] = arr[y + 1] ;
                    arr[y + 1] = t ;
              }
            }
        }
    }
    public static void print(int temp[]) {					// 专门定义一个输出的功能的方法
        for (int x = 0 ; x < temp.length ; x ++) {
           System.out.print(temp[x] + "  ") ;
        }
        System.out.println() ;
    }
}