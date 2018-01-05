public class Test {
    public static void main(String args[]) {
        // 第一步：根据既定结构设置数据
        Member bf = new Member(1,"王寅霄") ;				// 独立对象
        Member gf = new Member(2,"林悦") ;	 			// 独立对象
        School c = new School("华师") ;					// 独立对象
        School cc = new School("港理") ;					// 一辆车
        bf.setCar(c) ;									// 一个人有一辆车
        c.setMember(bf) ;								// 一辆车属于一个人
        gf.setCar(cc) ;								// 一个孩子有一辆车
        cc.setMember(gf) ;							// 一个车属于一个孩子
        bf.setLover(gf) ;								// 一个人有一个孩子
        // 第二步：根据既定结构取出关系
        System.out.println(bf.getCar().getInfo()) ;			// 通过人找到车的信息
        System.out.println(c.getMember().getInfo()) ;			// 通过车找到人的信息
        System.out.println(bf.getLover().getInfo()) ;			// 通过人找到他孩子的信息
        System.out.println(bf.getLover().getCar().getInfo()) ;		// 通过人找到他孩子的车的信息
    }
}
