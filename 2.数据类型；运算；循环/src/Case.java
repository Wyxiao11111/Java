public class Case {
    public static void main(String args[]) {
        int ch = 1;
        switch (ch) { 			// 判断的是数字
            case 2: {			// 判断内容是否是2
                System.out.println("内容是2");
                break;
            }
            case 1: {			// 判断内容是否是1
                System.out.println("内容是1");
                break;
            }
            case 3: {			// 判断内容是否是3
                System.out.println("内容是3");
                break;
            }
            default: {			// 判断都不满足
                System.out.println("没有匹配内容");
                break;
            }
        }
    }
}
