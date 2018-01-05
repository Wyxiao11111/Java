public class Member {
    private int mid;				// 人员编号
    private String name;			// 人员姓名
    private School car; 				// 表示属于人的车，如果没有车，则内容为null
    private Member child ;			// 表示人的孩子，如果没有，则为null
    public Member(int mid, String name) {
        this.mid = mid;
        this.name = name;
    }
    public void setCar(School car) {
        this.car = car ;
    }
    public School getCar() {
        return this.car ;
    }
    public void setLover(Member child) {
        this.child = child;
    }
    public Member getLover() {
        return child;
    }
    public String getInfo() {
        return "人员编号：" + this.mid + "，姓名：" + this.name;
    }
}
