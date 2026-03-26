public class Television {
    private boolean isOn;
    private int channel;

    public Television() {
        isOn = false;
        channel = 1;
    }

    public boolean isOn() {
        return isOn;
    }

    public void pressOnOff() {
        isOn = !isOn;
    }

    public int getChannel() {
        return channel;
    }

    public void setChannel(int ch) {
        if (isOn) {
            if (ch > 10)
                channel = 1;
            else
                channel = ch;
        }
    }
}