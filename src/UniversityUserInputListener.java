/**
 * Created by crist on 10.10.2016.
 */
public class UniversityUserInputListener implements IEventsListener {
    @Override
    public void onWriteUserInput(UserInputEvent e) {
        System.out.println("The user input contains the words university and/or universities");
    }
}
