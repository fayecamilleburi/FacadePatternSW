public class Tv implements HomeService {
    @Override
    public String turnOn() {
        return "Tv is on...";
    }

    @Override
    public String turnOff() {
        return "Tv is off...";
    }
}