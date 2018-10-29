package ua.training.controller;

import ua.training.view.View;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static ua.training.view.TextConstantsForResources.*;

public class UtilityController {
    private View view;
    private Scanner scanner;

    public UtilityController(View view, Scanner scanner){
        this.view = view;
        this.scanner = scanner;
    }


    //check(string,regex)
    public boolean checkValue(String inputString, Pattern pattern){
        Matcher matcher = pattern.matcher(inputString);
        return matcher.matches();
    }

    public String getCheckedValueWithRegex(Scanner scanner, Pattern pattern, String message){
        view.printMessage(message);
        String local = scanner.next();
        while (!checkValue(local,pattern)){
            view.printMessage(view.printWrongInputData() + message);
            local = scanner.next();
        }
        return local;

    }

    String inputStringValueWithScanner(Scanner sc,String message) {
        view.printMessage(message);
        while( !scanner.hasNext()){
            view.printMessage(WRONG_INPUT_DATA + message);
            sc.next();
        }
        return sc.next();
    }


    public int inputIntValueWithScanner(Scanner sc) {
        view.printMessage(INPUT_INT_DATA);
        while( ! sc.hasNextInt()) {
            view.printMessage(WRONG_INPUT_DATA + INPUT_INT_DATA);
            sc.next();
        }
        return sc.nextInt();
    }
}

