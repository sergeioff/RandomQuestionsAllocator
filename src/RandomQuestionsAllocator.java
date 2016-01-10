import java.util.ArrayList;

/**
 * This is the main class of program.
 * It checks the correctness of program arguments and then allocate questions between students
 * @author SergeiOFF
 */
public class RandomQuestionsAllocator {
    public static void main(String[] args) {
        if (args.length < 3) {
            System.out.println("Usage: RandomQuestionsAllocator totalNumberOfQuestions studentName1 studentName2 ...");
            return;
        }

        QuestionPool questions = new QuestionPool(Integer.parseInt(args[0]));
        ArrayList<Student> students = new ArrayList<>();

        for (int i = 1; i < args.length; i++) {
            students.add(new Student(args[i]));
        }

        int questionsPerStudent = Integer.parseInt(args[0]) / students.size();

        for (Student student : students) {
            for (int i = 0; i < questionsPerStudent; i++) {
                student.addQuestion(questions.getQuestion());
            }
        }

        for (int i = 0 ; questions.getCount() != 0; i++) {
            students.get(i).addQuestion(questions.getQuestion());
        }

        for (Student student : students) {
            System.out.println(student);
        }
    }
}
