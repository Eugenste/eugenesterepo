package ua.training.model.util;

import ua.training.model.entities.PaymentMethod;
import ua.training.model.entities.Subject;

import java.util.List;

import static ua.training.view.TextConstantsForResources.*;

public class ShowUtil {
    public static String showSubjects(List<Subject> visitingSubjects){
        StringBuilder stringBuilder = new StringBuilder(SPACE);
        visitingSubjects.forEach(x->stringBuilder.append(x).append(SPACE));
        return stringBuilder.toString();
    }

    public static String showPaymentMethod(PaymentMethod paymentMethod) {
        if(paymentMethod.equals(PaymentMethod.CASH)) {
            return CASH_METHOD;
        } else if (paymentMethod.equals(PaymentMethod.CASHLESS)) {

            return CASHLESS_METHOD;
        } else
            return NONE_METHOD;
    }

    public static String showIsOnBudget(boolean isBudget){
        if (isBudget){
            return YES_STATEMENT;
        } else{
            return NO_STATEMENT;
        }
    }
}
