import java.util.Random;

public class Subtraction implements Skill {
    @Override
    public String getDescription() {
        return "Subtraction";
    }

    @Override
    public Problem generateProblem() {
        Random r = new Random();
        int minuend = r.nextInt(100);

        int subtrahend = r.nextInt(minuend);
        int difference = minuend - subtrahend;

        return new Problem(minuend, subtrahend, '-', difference);
    }
}
