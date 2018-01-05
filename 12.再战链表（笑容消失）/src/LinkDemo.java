public class LinkDemo {
    public static void main(String args[]) {
        Link link = new Link(); 				// 由这个类负责所有的数据操作
        link.add("Hello"); 					// 存放数据
        link.add("WYX"); 				// 存放数据
        link.add("LY"); 				// 存放数据
        link.add("WALY"); 				// 存放数据
        link.print(); 						// 展示数据
    }
}