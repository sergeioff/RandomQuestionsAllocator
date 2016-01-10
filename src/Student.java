import java.util.TreeSet;

/**
 * This class represents the student and his questions
 * @author SergeiOFF
 */
class Student {
    private final String name;
    private final TreeSet<Integer> questions;

    /**
     * @param name Students name
     */
    Student(String name) {
        this.name = name;
        questions = new TreeSet<>();
    }

    /**
     * Adds the question to student questions
     * @param question Question number
     */
    public void addQuestion(int question) {
        questions.add(question);
    }

    @Override
    public String toString() {
        return name + ": " + questions.toString();
    }
}
