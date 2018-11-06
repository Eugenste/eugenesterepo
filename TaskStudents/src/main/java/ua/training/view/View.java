package ua.training.view;

import java.util.Locale;
import java.util.ResourceBundle;


public class View {
    static String MESSAGES_BUNDLE_NAME = "messages";
    public static final ResourceBundle bundle = ResourceBundle.getBundle(MESSAGES_BUNDLE_NAME,
            new Locale("ua"));

    public void printMessage(String message){
        System.out.println(message);
    }

    public String printMessageFromBundle(String textConstant){
        return bundle.getString(textConstant);
    }

    public String concatenationString(String... message){
        StringBuilder concatString = new StringBuilder();
        for(String v : message) {
            concatString = concatString.append(v);
        }
        return new String(concatString);
    }

}
