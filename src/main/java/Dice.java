public class Dice {


    private final int dieNumbers;

    public Dice(int dieNumbers) {
        this.dieNumbers = dieNumbers;
    }

    public int getMaxRoll() {
        return  dieNumbers * 6;
    }

    public int getMinRoll() {
        return dieNumbers;
    }

    public int tossNumbersSum() {
        int rollSum = 0;

        for (int i = 0; i < dieNumbers; i++ ){
            rollSum += (int) (Math.random() * 6) + 1;
        }
        return rollSum;
    }
}