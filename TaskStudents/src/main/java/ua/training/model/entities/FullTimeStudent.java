package ua.training.model.entities;


import java.math.BigDecimal;

public class FullTimeStudent extends Student {
    private String group;
    private boolean isBudget;
    private BigDecimal amountToPayPerMonth;
    @Override
    public String showInfo() {
        return null;
    }
}
