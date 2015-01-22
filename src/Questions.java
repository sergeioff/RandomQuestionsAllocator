import java.util.ArrayList;
import java.util.Collections;

/**
 * Created by sergeioff on 12/18/14.
 */
class Questions {
    ArrayList<Integer> questions;

    Questions(int count) {
        questions = new ArrayList<Integer>();
        for (int i = 1; i <= count; i++ )
            questions.add(i);
        Collections.shuffle(questions);
    }


    public int getQuestion() {
        return questions.remove(0);
    }

    @Override
    public String toString() {
        return "remain: " + questions.size() + " " + questions.toString();
    }
}
