public class Avec extends Person {
    private String lover;				// 子类扩充的属性
    public void setLover(String lover) {	// 扩充的方法
        this.lover = lover;
    }
    public String getLover() {			// 扩充的方法
        return this.lover;
    }
}
