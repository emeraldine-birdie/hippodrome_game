import java.util.ArrayList;
import java.util.List;

public class Hippodrome {
    private static List<Horse> horses;
    public static Hippodrome game;

    public List<Horse> getHorses() {
        return horses;
    }

    public Hippodrome(List<Horse> horses) {
        this.horses = horses;
    }

    public void run() {
        for (int i = 1; i <=100; i++) {
            move();
            print();
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public void move() {
        for(Horse horse : horses) {
            horse.move();
        }
    }

    public void print() {
        for (Horse horse : horses) {
            horse.print();
            System.out.println();
        }
    }

    public Horse getWinner() {
        double maxDistance = 0;
        Horse winner = null;
        for (Horse horse : horses) {
            if (horse.getDistance() > maxDistance) {
                maxDistance = horse.getDistance();
                winner = horse;
            }
        }
        return winner;
    }

    public void printWinner() {
        System.out.println("Winner is " + getWinner().getName() + "!");
    }

    public static void main(String[] args) {
        horses = new ArrayList<>();
        horses.add(new Horse("Lightning", "⚡️\uD83E\uDD84", 3, 0));
        horses.add(new Horse("Sun", "☀️\uD83E\uDD84", 3, 0));
        horses.add(new Horse("Snowflake", "❄️\uD83E\uDD84", 3, 0));
        game = new Hippodrome(horses);
        game.run();
        for (int i = 0; i < 8; i++){
            System.out.print("\uD83C\uDFC1 ");
        }
        System.out.println();
        game.printWinner();
    }
}
