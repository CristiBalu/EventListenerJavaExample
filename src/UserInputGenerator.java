import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class UserInputGenerator implements IUserInputGenerator{

    public UserInputGenerator(){
        anyUserInputListener = new AnyUserInputListener();
        universityUserInputListener = new UniversityUserInputListener();
    }

    @Override
    public void writeUserInput() throws IOException {
        FileWriter out = null;
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        try {
            out = new FileWriter("user_input.txt");

            // Generate event by writing user input to file
            System.out.println("Hello! What's on your mind?");
            String input = reader.readLine();
            out.write(input);
            anyUserInputListener.onWriteUserInput(new UserInputEvent(this));

            if(input.toLowerCase().contains("university") || input.toLowerCase().contains("universities")){
                universityUserInputListener.onWriteUserInput(new UserInputEvent(this));
            }
        }
        finally {
            if (out != null){
                out.close();
            }
        }
    }

    private AnyUserInputListener anyUserInputListener;
    private UniversityUserInputListener universityUserInputListener;
}
