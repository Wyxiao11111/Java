public class Node { 							// 定义一个节点
    private String data; 					// 要保存的数据
    private Node next; 					// 要保存的下一个节点
    public Node(String data) { 				// 每一个Node类对象都必须保存相应的数据
        this.data = data;
    }
    public void setNext(Node next) {
        this.next = next;
    }
    public Node getNext() {
        return this.next;
    }
    public String getData() {
        return this.data;
    }
    /**
     * 实现节点的添加（递归调用，目的是将新节点保存到最后一个节点之后）
     * 第一次调用（Link）：this = Link.root
     * 第二次调用（Node）：this = Link.root.next
     * 第三次调用（Node）：this = Link.root.next.next
     * @param newNode 新节点，节点对象由Link类创建
     */
    public void addNode(Node newNode) {
        if (this.next == null) { 				// 当前节点的下一个为null
           this.next = newNode; 			// 保存新节点
        } else { 						// 当前节点之后还存在节点
           this.next.addNode(newNode);		// 当前节点的下一个节点继续保存
        }
    }
    /**
     * 递归的方式输出每个节点保存的数据
     * 第一次调用（Link）：this = Link.root
     * 第二次调用（Node）：this = Link.root.next
     * 第三次调用（Node）：this = Link.root.next.next
     */
    public void printNode() {
        System.out.println(this.data); 		// 输出当前节点数据
        if (this.next != null) { 				// 还有下一个节点
           this.next.printNode(); 			// 找到下一个节点继续输出
        }
    }
}