package ua.training.controller;

import ua.training.model.Model;
import ua.training.model.entity.NotUniqueLastNameException;
import ua.training.view.View;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static ua.training.controller.Regex.*;
import static ua.training.view.TextConstantsForResources.*;

public class InputNoteBook {
    private View view;
    private Scanner scanner;

    private String firstName;
    private String lastName;
    private String patronymic;

    private String index;
    private String cityName;
    private String streetName;
    private String houseNumber;
    private String flatNumber;

    private String phone;
    private String email;
    private String skype;

    private String comment;
    private String group;

    public InputNoteBook(View view, Scanner scanner){
        this.view = view;
        this.scanner = scanner;
    }

    public void inputNoteData(){
        UtilityController utilityController = new UtilityController(view,scanner);
        String str = (String.valueOf(View.bundle.getLocale()).equals("ua"))
                ? REGEX_NAME_UKR : NAME_REGEX_EN;

        this.firstName = utilityController.getCheckedValueWithRegex(scanner,Pattern.compile(str), view.printFirstNameInput());

        this.lastName = utilityController.getCheckedValueWithRegex(scanner, NAME_REGEX, INPUT_LAST_NAME);
        this.patronymic = utilityController.getCheckedValueWithRegex(scanner, NAME_REGEX, INPUT_PATRONYMIC);
        this.index = utilityController.getCheckedValueWithRegex(scanner,INDEX_REGEX, INPUT_INDEX);
        this.cityName = utilityController.getCheckedValueWithRegex(scanner, ADDRESS_REGEX, INPUT_CITY);
        this.streetName = utilityController.getCheckedValueWithRegex(scanner,ADDRESS_REGEX, INPUT_STREET);
        this.houseNumber = utilityController.getCheckedValueWithRegex(scanner,DIGIT_REGEX,INPUT_HOUSE);
        this.flatNumber = utilityController.getCheckedValueWithRegex(scanner,DIGIT_REGEX, INPUT_FLAT);
        this.phone = utilityController.getCheckedValueWithRegex(scanner,REGEX_MOBILE_PHONE,INPUT_PHONE_NUMBER);
        this.email = utilityController.getCheckedValueWithRegex(scanner,REGEX_MAIL, INPUT_EMAIL);
        this.skype = utilityController.getCheckedValueWithRegex(scanner,NICKNAME_REGEX, INPUT_SKYPE);
        this.group = utilityController.inputStringValueWithScanner(scanner,INPUT_GROUP);
        this.comment = utilityController.inputStringValueWithScanner(scanner,INPUT_COMMENT);




    }

    public void setNoteData(Model model,View view) throws NotUniqueLastNameException {
        model.setNote(firstName,lastName,patronymic,index,cityName,streetName,houseNumber,
                                             flatNumber,group,phone,email,skype,comment);
        view.printMessage(model.getNoteData());
    }


}


