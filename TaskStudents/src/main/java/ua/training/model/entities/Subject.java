package ua.training.model.entities;

import java.math.BigDecimal;
import static ua.training.view.TextConstantsForResources.*;


public class Subject {
    private String nameOfSubject;
    private BigDecimal mark;

    public Subject(String nameOfSubject, BigDecimal mark) {
        this.nameOfSubject = nameOfSubject;
        this.mark = mark;
    }

    public String getNameOfSubject() {
        return nameOfSubject;
    }

    public void setNameOfSubject(String nameOfSubject) {
        this.nameOfSubject = nameOfSubject;
    }

    public BigDecimal getMark() {
        return mark;
    }

    public void setMark(BigDecimal mark) {
        this.mark = mark;
    }

    @Override
    public String toString() {
        return SUBJECT_DATA + TAB + SUBJECT_NAME + getNameOfSubject() +
                TAB + SUBJECT_MARK + getMark() +
                TAB;
    }
}
