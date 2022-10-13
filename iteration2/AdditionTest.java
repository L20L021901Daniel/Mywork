import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AdditionTest {

    @Test
    void getDescription() {
        Addition addition = new Addition();
        assertEquals("Addition", addition.getDescription());
    }

    @Test
    void generateProblem() {
        Addition addition = new Addition();
        Problem problem = addition.generateProblem();
        assertEquals('+', problem.getSign());
        assertEquals(problem.getFirstComponent() + problem.getSecondComponent(), problem.getAnswer());
    }
}