public class School {
    private Member member; 		// 车属于一个人，如果没有所属者，则为null
    private String pname;			// 车的名字
    public School(String pname) {
        this.pname = pname;
    }
    public void setMember(Member member) {
        this.member = member ;
    }
    public Member getMember() {
        return this.member ;
    }
    public String getInfo() {
        return "学校的名字：" + this.pname;
    }
}