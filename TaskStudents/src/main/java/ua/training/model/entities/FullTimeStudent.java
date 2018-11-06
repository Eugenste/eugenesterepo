package ua.training.model.entities;


import java.math.BigDecimal;
import java.util.List;

import static ua.training.view.TextConstantsForResources.*;

public class FullTimeStudent extends Student {
    private String group;
    private boolean isBudget;
    private BigDecimal amountToPayPerMonth;

    public FullTimeStudent(String firstName, String lastName,String numberOfCourse,
                           BigDecimal averageMark, PaymentMethod paymentMethod, List<Subject> visitingSubjects,
                           String group, boolean isBudget, BigDecimal amountToPayPerMonth) {
        super(firstName,lastName,numberOfCourse,averageMark,paymentMethod,visitingSubjects);
        this.group = group;
        this.isBudget = isBudget;
        this.amountToPayPerMonth = amountToPayPerMonth;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public boolean isBudget() {
        return isBudget;
    }

    public String showIsOnBudget(){
        if (isBudget){
            return YES_STATEMENT;
        } else{
            return NO_STATEMENT;
        }
    }

    public void setBudget(boolean budget) {
        isBudget = budget;
    }

    public BigDecimal getAmountToPayPerMonth() {
        return amountToPayPerMonth;
    }

    public void setAmountToPayPerMonth(BigDecimal amountToPayPerMonth) {
        this.amountToPayPerMonth = amountToPayPerMonth;
    }

    @Override
    public String showInfo() {
        return STUDENTS_DATA + TAB + FIRST_NAME_DATA + super.getFirstName() + TAB + LAST_NAME_DATA + super.getLastName()+
                TAB + NUMBER_OF_COURSE + super.getNumberOfCource() + TAB + AVERAGE_MARK + super.getAverageMark() +
                TAB + PAYMENT_METHOD + super.getPaymentMethod() + TAB + SUBJECT_DATA + super.showSubjects() +
                TAB + GROUP + getGroup() + TAB + ON_BUDGET + showIsOnBudget() + TAB + AMOUNT_TO_PAY + getAmountToPayPerMonth() ;
    }
}
