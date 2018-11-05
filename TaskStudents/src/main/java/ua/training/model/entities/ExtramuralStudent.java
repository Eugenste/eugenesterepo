package ua.training.model.entities;

import ua.training.model.entities.Student;

import java.math.BigDecimal;

public class ExtramuralStudent extends Student {
    private String group;
    private BigDecimal amountToPayPerMonth;

    @Override
    public String showInfo() {
        return null;
    }
}
