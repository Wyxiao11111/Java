import java.util.Scanner;

public class Paurchase {
    private double groundPrice;
    private int groundCount;
    private int numberBought;
    private String name;
    public void setName(String newName) {
        name = newName;
    }

    public void setPrice(int count, double costForCount) {
        if ((count <= 0) || (costForCount <= 0)) {
            System.out.println("");
            System.exit(0);
        } else {
            groundCount = count;
            groundPrice = costForCount;
        }

    }public void setNumberBought(int number) {
        if (number <= 0) {
            System.out.println("");
            System.exit(0);
        } else
            numberBought = number;
    }

    public void readInput() {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("请输入商品名: ");
        name = keyboard.nextLine();
        System.out.println("请输入商品的两个参数");
        System.out.println("例如, 每三件商品应付$2.99，则输入为");
        System.out.println("3 2.99");
        System.out.println("请输入:");
        groundCount = keyboard.nextInt();
        groundPrice = keyboard.nextDouble();
        while (groundCount <= 0 && groundPrice <= 0) {
            System.out.println("Both numvers must be positive. Try again.");
            System.out.println("Enter price of item as two numbers.");
            System.out.println("For example, 3 for $2.99 is entered as");
            System.out.println("3 2.99");
            System.out.println("Enter price of item as two numbers, now:");
            groundCount = keyboard.nextInt();
            groundPrice = keyboard.nextDouble();
        }
        System.out.println("请输入购买数量");
        numberBought = keyboard.nextInt();
        while (numberBought <= 0) {
            System.out.println("");
            System.out.println("");
            numberBought = keyboard.nextInt();
        }
        writeOutput();
    }

    public void writeOutput() {
        System.out.println("您想购买"+numberBought + "个" + name);
        System.out.println("每" + groundCount + "个，应付$：" + groundPrice);
    }
    public String getName() {         return name;
    }
    public double getTotalCost() {
        return ((groundPrice / groundCount) * numberBought);
    }
    public double getUnitCost() {
        return (groundPrice / groundCount);
    }
    public int getNumberBought() {         return numberBought;
    }
}