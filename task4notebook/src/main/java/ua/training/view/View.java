package ua.training.view;



import java.util.Locale;
import java.util.ResourceBundle;

import static ua.training.view.TextConstantsForResources.INPUT_FIRST_NAME;
import static ua.training.view.TextConstantsForResources.WRONG_INPUT_DATA;

public class View {

    static String MESSAGES_BUNDLE_NAME = "messages";
    public static final ResourceBundle bundle = ResourceBundle.getBundle(MESSAGES_BUNDLE_NAME,
                                                    new Locale("en"));


    public String printFirstNameInput(){
        return bundle.getString(INPUT_FIRST_NAME);
    }

    public String printWrongInputData(){
        return bundle.getString(WRONG_INPUT_DATA);
    }

    public void printMessage(String message){
        System.out.println(message);
    }

    public String concatenationString(String... message){
        StringBuilder concatString = new StringBuilder();
        for(String v : message) {
            concatString = concatString.append(v);
        }
        return new String(concatString);
    }
}
