public class SortArray extends Array {					// 定义排序子类
    public SortArray(int len) {						// Array类里面有无参构造方法
        super(len); 								// 明确调用父类的有参构造，为父类中的data属性初始化
    }
    /**
     * 因为父类中getData()方法不能满足排序的操作要求，但为了保存这个方法名称，所以进行覆写
     * 在本方法中要使用java.util.Arrays.sort()来实现数组的排序操作
     * @return 排序后的数据
     */
    public int[] getData() {
        java.util.Arrays.sort(super.getData()); 		// 排序
        return super.getData();						// 返回排序后的数据
    }
}