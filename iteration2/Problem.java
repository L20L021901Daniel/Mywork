public class Problem {

    private final int firstComponent;
    private final int secondComponent;
    private final char sign;
    private final int answer;

    /**
     * Create a new problem from two int components, a sign char and answer int
     * @param firstComponent int first component of the problem
     * @param secondComponent int second component of the problem
     * @param sign char sign defining the mathematical operation
     * @param answer int answer to the problem
     */
    public Problem(int firstComponent, int secondComponent, char sign, int answer) {
        this.firstComponent = firstComponent;
        this.secondComponent = secondComponent;
        this.sign = sign;
        this.answer = answer;
    }

    /**
     * Get a String representing the problem
     * @return a String representing the problem
     */
    public String getProblem() {
        return String.format("%d %c %d = ?", firstComponent, sign, secondComponent);
    }

    public int getFirstComponent() { return this.firstComponent; }

    public int getSecondComponent() { return this.secondComponent; }

    public char getSign() { return this.sign; }

    public int getAnswer() {
        return this.answer;
    }
}
