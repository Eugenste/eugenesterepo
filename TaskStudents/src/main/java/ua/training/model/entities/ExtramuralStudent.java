package ua.training.model.entities;

import ua.training.model.util.ShowUtil;

import java.math.BigDecimal;
import java.util.List;
import java.util.Map;

import static ua.training.view.TextConstantsForResources.*;

public class ExtramuralStudent extends Student {
    private BigDecimal amountToPayPerMonth;

    public ExtramuralStudent(String firstName, String lastName, String numberOfCourse,
                              PaymentMethod paymentMethod, Map<String,BigDecimal> visitingSubjects,
                                                                    String group, BigDecimal amountToPayPerMonth) {
        super(firstName,lastName,numberOfCourse, group, paymentMethod,visitingSubjects);
        this.amountToPayPerMonth = amountToPayPerMonth;
    }



    public BigDecimal getAmountToPayPerMonth() {
        return amountToPayPerMonth;
    }

    public void setAmountToPayPerMonth(BigDecimal amountToPayPerMonth) {
        this.amountToPayPerMonth = amountToPayPerMonth;
    }

    @Override
    public String showInfo() {
        return STUDENTS_DATA + TAB + FIRST_NAME_DATA + super.getFirstName() +
                TAB + LAST_NAME_DATA + super.getLastName()+
                TAB + NUMBER_OF_COURSE + super.getNumberOfCource() +
                TAB + PAYMENT_METHOD + ShowUtil.showPaymentMethod(super.getPaymentMethod()) +
                TAB + SUBJECT_DATA + TAB + super.getVisitingSubjects().entrySet() +
                TAB + GROUP + super.getGroup() +
                TAB + AMOUNT_TO_PAY + getAmountToPayPerMonth() ;
    }
}
