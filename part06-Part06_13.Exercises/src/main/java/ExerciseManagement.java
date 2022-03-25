
import java.util.ArrayList;


public class ExerciseManagement {
    private ArrayList<Exercises> exercises;
    
    public ExerciseManagement() {
        this.exercises = new ArrayList<>();
    }
    
    public ArrayList<String> exerciseList() {
        ArrayList<String> list = new ArrayList<>();
        exercises.forEach(exercise -> { //for (Exercises exercise : exercises) {
            list.add(exercise.getName());
        });
        return list;
    }
    
    public void add(String exercise) {
        this.exercises.add(new Exercises(exercise));
    }
    
    public void markAsCompleted(String exercise) {
        for (Exercises ex : exercises) {
            if (ex.getName().equals(exercise)) {
                ex.setCompleted(true);
            }
        }
    }
    
    public boolean isCompleted(String exercise) {
        for (Exercises ex : exercises) {
            if (ex.getName().equals(exercise)) {
                return ex.isCompleted();
            }
        }
        return false;
    }
}
