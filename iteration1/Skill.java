public interface Skill {

    /**
     * Get skill description
     * @return a String containing the skill description
     */
    String getDescription();

    /**
     * Generate a new problem
     * @return a new problem
     */
    Problem generateProblem();
}
