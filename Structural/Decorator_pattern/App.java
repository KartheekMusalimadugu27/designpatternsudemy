public class App {
    public static void main(String[] args) {
        Machine machine = new Navigation(new ParkingAssistant(new Car()));
        System.out.println(machine.doOperation());
    }
}
