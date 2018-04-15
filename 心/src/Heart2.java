public class Heart2 {
    public static void main(String[] args) {
        int k = 5;      //控制心型大小
        for (int i = 0; i <= k * 2; i++) {
            for (int j = 0; j <= k * 4; j++) {
                if (((i - k) * (i - k) + (j - k) * (j - k) == k * k && i <= k) || ((j - 3 * k) * (j - k * 3) + (i - k) * (i - k) == k * k && i <= k)
                        || (((2 * k - i) - 2 * k) * ((2 * k - i) - 2 * k) + (j - 2 * k) * (j - 2 * k) == k * k * 4)) {
                    if (i == 0 && j == 0 || i == 0 && j == k * 4) System.out.print(" ");
                    else {
                        System.out.print("*");
                    }
                } else System.out.print(" ");
            }
            System.out.println();
        }
    }
}