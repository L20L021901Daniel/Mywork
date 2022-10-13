import static org.junit.jupiter.api.Assertions.*;

class ProblemTest {

    @org.junit.jupiter.api.Test
    void getProblemTest() {
        Problem problem = new Problem(1, 1, '+', 2);
        assertEquals("1 + 1 = ?", problem.getProblem());
    }

    @org.junit.jupiter.api.Test
    void getFirstComponentTest() {
        Problem problem = new Problem(1, 1, '+', 2);
        assertEquals(1, problem.getFirstComponent());
    }

    @org.junit.jupiter.api.Test
    void getSecondComponentTest() {
        Problem problem = new Problem(1, 1, '+', 2);
        assertEquals(1, problem.getSecondComponent());
    }

    @org.junit.jupiter.api.Test
    void getSignTest() {
        Problem problem = new Problem(1, 1, '+', 2);
        assertEquals('+', problem.getSign());
    }

    @org.junit.jupiter.api.Test
    void getAnswerTest() {
        Problem problem = new Problem(1, 1, '+', 2);
        assertEquals(2, problem.getAnswer());
    }
}