package ua.training.model.entities;

import ua.training.model.entities.Student;

import java.math.BigDecimal;
import java.util.List;

import static ua.training.view.TextConstantsForResources.*;

public class ExtramuralStudent extends Student {
    private String group;
    private BigDecimal amountToPayPerMonth;

    public ExtramuralStudent(String firstName, String lastName, String numberOfCourse,
                             BigDecimal averageMark, PaymentMethod paymentMethod, List<Subject> visitingSubjects,
                                                                    String group, BigDecimal amountToPayPerMonth) {
        super(firstName,lastName,numberOfCourse,averageMark,paymentMethod,visitingSubjects);
        this.group = group;
        this.amountToPayPerMonth = amountToPayPerMonth;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
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
                TAB + GROUP + getGroup() + TAB + AMOUNT_TO_PAY + getAmountToPayPerMonth() ;
    }
}
