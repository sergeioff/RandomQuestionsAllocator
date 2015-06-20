import java.util.Collections;
import java.util.TreeSet;

/**
 * Created by sergeioff on 12/18/14.
 */
class Student {
    String name;
    TreeSet<Integer> questions;

    Student(String name) {
        this.name = name;
        questions = new TreeSet<Integer>();
    }

    public void addQuestion(int questionNum) {
        questions.add(questionNum);
    }

    @Override
    public String toString() {
        return name + ": " + questions.toString();
    }
}
