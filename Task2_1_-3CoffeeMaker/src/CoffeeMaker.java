public class CoffeeMaker {
    private boolean isOn;
    private String type;
    private int amount;

    public CoffeeMaker() {
        isOn = false;
        type = "normal";
        amount = 10;
    }

    public void pressOnOff() {
        isOn = !isOn;
    }

    public boolean isOn() {
        return isOn;
    }

    public void setType(String type) {
        if (isOn && (type.equals("normal") || type.equals("espresso"))) {
            this.type = type;
        }
    }

    public String getType() {
        return type;
    }

    public void setAmount(int amount) {
        if (isOn && amount >= 10 && amount <= 80) {
            this.amount = amount;
        }
    }

    public int getAmount() {
        return amount;
    }
}