public class CoffeeMakerDriver {
    public static void main(String[] args) {
        CoffeeMaker cm = new CoffeeMaker();

        cm.pressOnOff();
        System.out.println("Coffee maker is on");

        cm.setType("espresso");
        cm.setAmount(50);

        System.out.println("Coffee type is " + cm.getType());
        System.out.println("Coffee amount is " + cm.getAmount() + " ml");

        cm.pressOnOff();
        System.out.println("Coffee maker is off");
    }
}