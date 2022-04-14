

public class Horse {
    private String name;
    private String label;
    private double speed;
    private double distance;

    public Horse(String name, String label, double speed, double distance) {
        this.name = name;
        this.label = label;
        this.speed = speed;
        this.distance = distance;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }

    public double getDistance() {
        return distance;
    }

    public void setDistance(double distance) {
        this.distance = distance;
    }

    public void move() {
        distance += speed * Math.random();
    }

    public void print() {
        int countDots = (int) distance;
        String result = "";
        for (int i = 0; i < countDots; i++) {
            result += ".";
        }
        result += label;
        System.out.print(result);
    }
}
