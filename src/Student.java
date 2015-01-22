import java.util.HashSet;

/**
 * Created by sergeioff on 12/18/14.
 */
class Student {
    String name;
    HashSet<Integer> questions;

    Student(String name) {
        this.name = name;
        questions = new HashSet<Integer>();
    }

    public void addQuestion(int questionNum) {
        questions.add(questionNum);
    }

    @Override
    public String toString() {
        return name + ": " + questions.toString();
    }
}
