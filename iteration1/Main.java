import com.google.common.collect.ImmutableList;
import java.util.Scanner;

public class Main {

    public static final ImmutableList<Skill> skills = ImmutableList.of();
    public static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int choice;

        while (true) {
            printMenu();
            choice = getChoice();

            if (choice == 0) {
                scanner.close();
                System.exit(0);
            } else {
                practiseSkill(skills.get(choice - 1));
            }
        }
    }

    private static void printMenu() {
        System.out.println("Choose the skill to practise:");

        int i = 1;
        for (Skill skill : skills) {
            System.out.printf("%d. %s%n", i, skill.getDescription());
            i++;
        }

        System.out.println("0. Exit");
    }

    public static int getChoice() {
        String choiceStr;
        int choice;

        while (true) {
            System.out.printf("Enter your choice (a number between 0 and %d): ", skills.size());
            choiceStr = scanner.nextLine();

            try{
                choice = Integer.parseInt(choiceStr);
            }
            catch (NumberFormatException ex){
                System.out.println("Input is not a number!");
                continue;
            }

            if (choice < 0 || choice > skills.size()) {
                System.out.println("Wrong choice!");
                continue;
            }

            return choice;
        }
    }

    private static void practiseSkill(Skill skill) {
        final Problem problem = skill.generateProblem();

        System.out.println(problem.getProblem());

        String answerStr;
        int answer;

        while (true) {
            System.out.print("Enter your answer: ");
            answerStr = scanner.nextLine();

            try{
                answer = Integer.parseInt(answerStr);
                break;
            }
            catch (NumberFormatException ex){
                System.out.println("Input is not a number!");
                continue;
            }
        }

        if (answer == problem.getAnswer()) {
            System.out.println("You're Right!");
        } else {
            System.out.printf("You're Wrong! The right answer was: %d%n", problem.getAnswer());
        }
    }
}

