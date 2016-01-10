import java.util.ArrayList;
import java.util.Collections;
/**
 * @author SergeiOFF
 */
class QuestionPool {
    private ArrayList<Integer> questions;

    /**
     * This constructor fills object by questions and then shuffle questions
     * @param count Total number of questions
     */
    QuestionPool(int count) {
        questions = new ArrayList<>();
        for (int i = 1; i <= count; i++ )
            questions.add(i);
        Collections.shuffle(questions);
    }

    /**
     * Returns the question and removes this question out of questions
     * @return Question
     */
    public int getQuestion() {
        return questions.remove(0);
    }

    /**
     * @return Number of available questions
     */
    public int getCount() {
        return questions.size();
    }
}
