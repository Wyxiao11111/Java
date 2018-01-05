public class LinkDemo {
    public static void main(String args[]) {
        Link all = new Link();						// 创建链表对象
        all.add(new Book("Java开发实战经典",79.8));		// 保存数据
        all.add(new Book("Oracle开发实战经典",89.8));	// 保存数据
        all.add(new Book("Android开发实战经典",99.8));	// 保存数据
        System.out.println("保存书的个数：" + all.size()) ;
        System.out.println(all.contains(new Book("Java开发实战经典",79.8))) ;
        all.remove(new Book("Android开发实战经典",99.8)) ;
        Book [] books = all.toArray() ;
        for (int x = 0 ; x < books.length ; x ++) {
            System.out.println(books[x].getInfo()) ;
        }
    }
}