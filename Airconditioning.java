public class Airconditioning implements HomeService {
    @Override
    public String turnOn() {
        return "Airconditioning is on...";
    }

    @Override
    public String turnOff() {
        return "Airconditioning is off...";
    }
}