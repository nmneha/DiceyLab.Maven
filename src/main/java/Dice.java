import java.util.Random;

public class Dice {
    private int numberOfDie;
    private Random rand = new Random();

    public Dice(int numberOfDies) {
        this.numberOfDie = numberOfDies;
    }

    public int tossAndSum() {
        int sum = 0;
        for (int i = 1; i <= numberOfDie; i++) {
            sum += (rand.nextInt(6)+1);
        }
        return sum;

    }


}
