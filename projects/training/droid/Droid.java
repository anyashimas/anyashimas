public class Droid {

    int batteryLevel;
    String name;

    public Droid(String droidName) {
        name = droidName;
        batteryLevel = 100;
    }

    public String toString() {
        return "Hello, I’m the droid: " + name;
    }

    public void performTask(String task) {
        System.out.println(name + " is performing task: " + task);

        batteryLevel = batteryLevel - 10;
    }

    public void energyReport() {
        System.out.println("Current energy level: " + batteryLevel);
    }

    public void goCharging(int min) {
        // TODO add validation to prevent negative charging times
        batteryLevel = batteryLevel + min * 10;

        if (batteryLevel > 100) {
            batteryLevel = 100;
        }
    }

    public static void main(String[] args) {
        Droid codey = new Droid("Codey");

        System.out.println(codey);

        codey.performTask("dancing");
        codey.performTask("washing dishes");
        codey.performTask("reading visual novels");
        codey.performTask("working out");

        codey.energyReport();

        if (codey.batteryLevel < 100) {
            codey.goCharging(8);
        }

        codey.energyReport();
    }
}
