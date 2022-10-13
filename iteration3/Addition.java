import java.util.Random;

public class Addition implements Skill {
    @Override
    public String getDescription() {
        return "Addition";
    }

    @Override
    public Problem generateProblem() {
        Random r = new Random();
        int sum = r.nextInt(100);

        int firstAddend = r.nextInt(sum);
        int secondAddend = sum - firstAddend;

        return new Problem(firstAddend, secondAddend, '+', sum);
    }
}
