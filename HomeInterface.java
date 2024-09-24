public class HomeInterface {
    private HomeService light;
    private HomeService aircon;
    private HomeService tv;

    public HomeInterface(HomeService light, HomeService aircon, HomeService tv) {
        this.light = light;
        this.aircon = aircon;
        this.tv = tv;
    }

    public String turnOnAll() {
        return light.turnOn() + "\n" +
               aircon.turnOn() + "\n" +
               tv.turnOn();
    }

    public String turnOffAll() {
        return light.turnOff() + "\n" +
               aircon.turnOff() + "\n" +
               tv.turnOff();
    }
}