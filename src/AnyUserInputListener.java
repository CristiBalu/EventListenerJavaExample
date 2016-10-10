
public class AnyUserInputListener implements IEventsListener{
    @Override
    public void onWriteUserInput(UserInputEvent e) {
        System.out.println("Some user input has been written to the file!");
    }
}
