public class Demo {
    public static void main(String args[]) {
        Avec stu = new Avec(); 	// 实例化的是子类
        stu.setName("王寅霄"); 			// Person类定义
        stu.setAge(19); 				// Person类定义
        stu.setLover("林悦");     	 	// Student类扩充方法
        System.out.println("Name：" + stu.getName() + "，Age：" + stu.getAge()
                + "，Lover：" + stu.getLover());
    }
}
