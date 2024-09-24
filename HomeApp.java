public class HomeApp {
    public static void main(String[] args) {
        Light light = new Light();
        Airconditioning aircon = new Airconditioning();
        Tv tv = new Tv();

        HomeInterface facade = new HomeInterface(light, aircon, tv);

        System.out.println(facade.turnOnAll() + "\n");
        System.out.println(facade.turnOffAll());
    }
}