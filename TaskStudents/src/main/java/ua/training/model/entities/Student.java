package ua.training.model.entities;


import java.math.BigDecimal;
import java.util.List;
import java.util.Map;


public abstract class Student {
    private String firstName;
    private String lastName;
    private String numberOfCource;
    private String group;
    private PaymentMethod paymentMethod;
    private Map<String,BigDecimal> visitingSubjects;

    public Student(String firstName, String lastName, String numberOfCource, String group,
                         PaymentMethod paymentMethod, Map<String,BigDecimal> visitingSubjects) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.numberOfCource = numberOfCource;
        this.group = group;
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

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public PaymentMethod getPaymentMethod() {
        return paymentMethod;
    }

    public void setPaymentMethod(PaymentMethod paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    public Map<String, BigDecimal> getVisitingSubjects() {
        return visitingSubjects;
    }

    public void setVisitingSubjects(Map<String, BigDecimal> visitingSubjects) {
        this.visitingSubjects = visitingSubjects;
    }

    public abstract String showInfo();

}
