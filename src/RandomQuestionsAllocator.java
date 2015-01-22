import java.util.ArrayList;

/**
 * Created by sergeioff on 12/18/14.
 */
public class RandomQuestionsAllocator {
    public static void main(String[] args) {
        if (args.length < 3) {
            System.out.println("Usage: RandomQuestionsAllocator totalNumberOfQuestions studentName1 studentName2 ...");
            return;
        }
        Questions questions = new Questions(Integer.parseInt(args[0]));
        ArrayList<Student> students = new ArrayList<Student>();

        for (int i = 1; i < args.length; i++) {
            students.add(new Student(args[i]));
        }

        int questionsPerStudent = Integer.parseInt(args[0]) / students.size();

        for (Student student : students) {
            for (int i = 0; i < questionsPerStudent; i++) {
                student.addQuestion(questions.getQuestion());
            }
        }

        for (Student student : students) {
            System.out.println(student);
        }

        System.out.println(questions);
    }
}
