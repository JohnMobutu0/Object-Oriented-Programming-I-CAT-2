public class AbstractionDemo {
    public void demonstrateAppliances() {
        Appliance fan = new Fan();
        Appliance tv = new TV();

        fan.turnOn(); // Outputs: Fan is now running.
        tv.turnOn(); // Outputs: TV is now on.
    }
}