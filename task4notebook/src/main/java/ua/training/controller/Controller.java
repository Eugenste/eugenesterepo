package ua.training.controller;


import ua.training.model.Model;
import ua.training.model.entity.NotUniqueLastNameException;
import ua.training.view.View;

import java.util.Scanner;


public class Controller {
    private Model model;
    private View view;

    public Controller(Model model, View view) {
        this.model  = model;
        this.view = view;
    }

    public void processUser() throws NotUniqueLastNameException {
        Scanner scanner = new Scanner(System.in);
        InputNoteBook inputNoteBook = new InputNoteBook(view,scanner);
        inputNoteBook.inputNoteData();
        inputNoteBook.setNoteData(model,view);


    }


}
