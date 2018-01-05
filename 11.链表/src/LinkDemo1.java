public class LinkDemo1 {
    public static void main(String args[]) {
        // 第一步：定义要操作的节点并设置好包装的字符串数据
        Node root = new Node("火车头") ;					// 定义节点，同时包装数据
        Node n1 = new Node("车厢A") ;					// 定义节点，同时包装数据
        Node n2 = new Node("车厢B") ;					// 定义节点，同时包装数据
        root.setNext(n1) ;								// 设置节点关系
        n1.setNext(n2) ;								// 设置节点关系
        // 第二步：根据节点关系取出所有数据
        Node currentNode = root ;						// 当前从根节点开始读取
        while (currentNode != null) {						// 当前节点存在数据
            System.out.println(currentNode.getData()) ;
            currentNode = currentNode.getNext() ;			// 将下一个节点设置为当前节点
        }
    }
}