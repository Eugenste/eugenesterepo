package ua.training.model.entities;

import java.math.BigDecimal;
import java.util.List;

public abstract class Student {
    private String firstName;
    private String lastName;
    private String numberOfCource;
    private BigDecimal averageMark;
    private PaymentMethod paymentMethod;
    private List<Subject> visitingSubjects;

    public abstract String showInfo();

}
