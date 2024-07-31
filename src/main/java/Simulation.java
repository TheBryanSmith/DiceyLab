 public class Simulation {
     int numberOfDie;
     int tosses;

     public Simulation(int numberOfDie, int tosses) {
         this.numberOfDie = numberOfDie;
         this.tosses = tosses;
     }

     public void runSimulator() {
         Dice dice = new Dice(numberOfDie);
         Bins bin = new Bins(numberOfDie, numberOfDie * 6);
         bin.createBin();

         for (int i = 0; i < tosses; i++) {
             int result = dice.tossNumbersSum();
             bin.incrementBin(result);
         }
     }

     public void printResults() {
         Bins bins = new Bins(numberOfDie, numberOfDie * 6);
         System.out.println("***");
         System.out.println("Simulation of " + numberOfDie + " dice tossed for " + tosses + " Times.");
         System.out.println("***");
         System.out.println();

         for (int i : bins.binMap.keySet()) {
             float ratio = (bins.binMap.get(i) / (float) tosses);
             int starCount = (int) (ratio * 100);
             String stars = "*".repeat(starCount);
             System.out.format("%3d : %8d : %.2f %s %n", i, bins.binMap.get(i), ratio, stars);

         }
     }
     public static void main(String[] args){
         Simulation simulation = new Simulation(2,1000000000);
         simulation.runSimulator();
         simulation.printResults();
     }

 }
