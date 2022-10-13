import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SubtractionTest {

    @Test
    void getDescription() {
        Subtraction subtraction = new Subtraction();
        assertEquals("Subtraction", subtraction.getDescription());
    }

    @Test
    void generateProblem() {
        Subtraction subtraction = new Subtraction();
        Problem problem = subtraction.generateProblem();
        assertEquals('-', problem.getSign());
        assertEquals(problem.getFirstComponent() - problem.getSecondComponent(), problem.getAnswer());
    }
}