package ua.training.model.entities;

import ua.training.view.View;

import java.math.BigDecimal;
import java.util.List;

import static ua.training.view.TextConstantsForResources.*;

public abstract class Student {
    private String firstName;
    private String lastName;
    private String numberOfCource;
    private BigDecimal averageMark;
    private PaymentMethod paymentMethod;
    private List<Subject> visitingSubjects;

    public Student(String firstName, String lastName, String numberOfCource,
                        BigDecimal averageMark, PaymentMethod paymentMethod, List<Subject> visitingSubjects) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.numberOfCource = numberOfCource;
        this.averageMark = averageMark;
        this.paymentMethod = paymentMethod;
        this.visitingSubjects = visitingSubjects;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getNumberOfCource() {
        return numberOfCource;
    }

    public void setNumberOfCource(String numberOfCource) {
        this.numberOfCource = numberOfCource;
    }

    public BigDecimal getAverageMark() {
        return averageMark;
    }

    public void setAverageMark(BigDecimal averageMark) {
        this.averageMark = averageMark;
    }

    public String getPaymentMethod() {
        if(paymentMethod.equals(PaymentMethod.CASH)) {
            return CASH_METHOD;
        } else if (paymentMethod.equals(PaymentMethod.CASHLESS)) {

            return CASHLESS_METHOD;
        } else
            return NONE_METHOD;
    }

    public void setPaymentMethod(PaymentMethod paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    public List<Subject> getVisitingSubjects() {
        return visitingSubjects;
    }

    public void setVisitingSubjects(List<Subject> visitingSubjects) {
        this.visitingSubjects = visitingSubjects;
    }

    public String showSubjects(){
        StringBuilder stringBuilder = new StringBuilder(SPACE);
        visitingSubjects.forEach(x->stringBuilder.append(x).append(SPACE));
        return stringBuilder.toString();
    }

    public abstract String showInfo();

}
