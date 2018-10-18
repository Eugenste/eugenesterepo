package ua.training.controller;

import com.sun.org.apache.regexp.internal.RE;
import ua.training.model.Model;
import ua.training.view.View;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Controller {
    private Model model;
    private View view;

    public Controller(Model model, View view) {
        this.model  = model;
        this.view = view;
    }

    public void processUser(){
        Scanner scanner = new Scanner(System.in);
        InputNoteBook inputNoteBook = new InputNoteBook(view,scanner);
        inputNoteBook.inputNoteData();


    }


}
