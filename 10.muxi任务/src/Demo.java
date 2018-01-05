public class Demo {
    public static void main(String args[]){
        Paurchase a = new Paurchase();
        a.readInput();
        System.out.println(a.getName());
        System.out.print("单价：");
        System.out.println(a.getUnitCost());
        System.out.print("你所购买数量：");
        System.out.println(a.getNumberBought());
        System.out.print("应付：");
        System.out.println(a.getTotalCost());
    }
}
