public class LinkDemo2 {
    public static void main(String args[]) {
        // 第一步：定义要操作的节点并设置好包装的字符串数据
        Node root = new Node("火车头") ;				// 定义节点，同时包装数据
        Node n1 = new Node("车厢A") ;					// 定义节点，同时包装数据
        Node n2 = new Node("车厢B") ;					// 定义节点，同时包装数据
        root.setNext(n1) ;							// 设置节点关系
        n1.setNext(n2) ;								// 设置节点关系
        print(root) ;								// 由根节点开始输出
    }
    /**
     * 利用递归方式输出所有的节点数据
     * @param current
     */
    public static void print(Node current) {				// 第二步：根据节点关系取出所有数据
        if (current == null) { 							// 递归结束条件
             return; 								// 结束方法
        }
        System.out.println(current.getData());				// 输出节点包含的数据
        print(current.getNext());						// 递归操作
    }
}