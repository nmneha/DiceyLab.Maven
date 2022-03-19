public class Simulation {
    private Dice dice;
    private Bins bin;
    private int numberOfDie;
    private int numberOfTosses;

    public static void main(String[] args) {
        Simulation sim = new Simulation(2, 1000000);
        sim.run();
        sim.printResults();

    }


    public Simulation(int numberOfDies, int numberOfTosses) {
        this.numberOfDie = numberOfDies;
        this.numberOfTosses = numberOfTosses;
        this.dice = new Dice(numberOfDies);
        int lowest = numberOfDies;
        int highest = numberOfDies*6;
        this.bin = new Bins(lowest, highest);

    }

    void run() {
        for (int i = 0; i < numberOfTosses; i++ ) {
            bin.increment(dice.tossAndSum());
        }
    }

    public void printResults() {
        String stars = "";
        int results = 0;
        double percent = 0.00;
        int binNum = 2;
        System.out.println("***\n" + "Simulation of " + numberOfDie + " dice tossed for " + numberOfTosses + " times.\n" + "***");
        for (int i = 2; i < (numberOfDie*6 - 1); i++) {
            results = bin.getBin(binNum);
            binNum += 1;
            percent = (double) results/numberOfTosses;
            for (int j = 0; j < Math.round(percent*100); j++) {
                stars += "*";
            }
            System.out.println(String.format("%3d :  %10d: %.2f %s", (numberOfDie+i), results, percent, stars ));
            stars = "";
        }
    }




}
