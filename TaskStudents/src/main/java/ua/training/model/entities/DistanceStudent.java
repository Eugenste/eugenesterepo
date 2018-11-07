package ua.training.model.entities;

import ua.training.model.util.ShowUtil;

import java.math.BigDecimal;
import java.util.List;
import java.util.Map;

import static ua.training.view.TextConstantsForResources.*;

public class DistanceStudent extends Student {
    private String cityFrom;
    private BigDecimal amountToPayPerMonth;

    public DistanceStudent(String firstName, String lastName, String numberOfCourse, String group,
                           PaymentMethod paymentMethod, Map<String,BigDecimal> visitingSubjects, String cityFrom,
                           BigDecimal amountToPayPerMonth) {
        super(firstName,lastName,numberOfCourse, group, paymentMethod,visitingSubjects);
        this.cityFrom = cityFrom;
        this.amountToPayPerMonth = amountToPayPerMonth;
    }

    public BigDecimal getAmountToPayPerMonth() {
        return amountToPayPerMonth;
    }

    public void setAmountToPayPerMonth(BigDecimal amountToPayPerMonth) {
        this.amountToPayPerMonth = amountToPayPerMonth;
    }

    public String getCityFrom() {
        return cityFrom;
    }

    public void setCityFrom(String cityFrom) {
        this.cityFrom = cityFrom;
    }

    @Override
    public String showInfo() {
        return STUDENTS_DATA + TAB + FIRST_NAME_DATA + super.getFirstName() +
                TAB + LAST_NAME_DATA + super.getLastName()+
                TAB + NUMBER_OF_COURSE + super.getNumberOfCource() +
                TAB + GROUP + super.getGroup() +
                TAB + PAYMENT_METHOD + ShowUtil.showPaymentMethod(super.getPaymentMethod()) +
                TAB + SUBJECT_DATA + TAB + super.getVisitingSubjects().entrySet() +
                TAB + AMOUNT_TO_PAY + getAmountToPayPerMonth() +
                TAB + CITY_FROM + getCityFrom();
    }
}
