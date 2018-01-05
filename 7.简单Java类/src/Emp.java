public class Emp {
    private int empno;					// 雇员编号
    private String ename;					// 雇员姓名
    private String job;					// 雇员职位
    private double sal;					// 基本工资
    private double comm;					// 佣金
    public Emp() {						// 明确定义一个无参构造方法
    }
    public Emp(int eno, String ena, String j, double s, double c) {	// 有参构造
        empno = eno;					// 为属性赋值
        ename = ena;					// 为属性赋值
        job = j;							// 为属性赋值
        sal = s;							// 为属性赋值
        comm = c;						// 为属性赋值
    }
    public void setEmpno(int e) {				// 设置empno属性内容
        empno = e;
    }
    public void setEname(String e) {			// 设置ename属性内容
        ename = e;
    }
    public void setJob(String j) {				// 设置job属性内容
        job = j;
    }
    public void setSal(double s) {				// 设置sal属性内容
        sal = s;
    }
    public void setComm(double c) {			// 设置comm属性内容
        comm = c;
    }
    public int getEmpno() {					// 取得empno属性内容
        return empno;
    }
    public String getEname() {				// 取得ename属性内容
        return ename;
    }
    public String getJob() {					// 取得job属性内容
        return job;
    }
    public double getSal() {					// 取得sal属性内容
        return sal;
    }
    public double getComm() {				// 取得comm属性内容
        return comm;
    }
    /**
     * 取得简单Java类的基本信息，信息在被调用处输出
     * @return 包含对象完整信息的字符串数据
     */
    public String getInfo() {			// 取得完整信息
        return "雇员编号：" + empno + "\n" +
                "雇员姓名：" + ename + "\n" +
                "雇员职位：" + job + "\n" +
                "基本工资：" + sal + "\n" +
                "佣    金：" + comm ;
    }
}
