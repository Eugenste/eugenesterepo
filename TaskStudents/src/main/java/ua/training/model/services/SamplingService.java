package ua.training.model.services;


import ua.training.model.entities.PaymentMethod;
import ua.training.model.entities.Student;

import java.math.BigDecimal;
import java.util.List;
import java.util.stream.Collectors;

public class SamplingService {
    public List<Student> getStudentsByCourse(List<Student> studentList, String course){
        return studentList.stream()
                .filter(student -> student.getNumberOfCource().equals(course))
                .collect(Collectors.toList());
    }

    public List<Student> getStudentsByGroup(List<Student> studentList, String group) {
        return studentList.stream()
                .filter(student -> student.getGroup().equals(group))
                .collect(Collectors.toList());
    }

    public List<Student> getStudentsBySubject(List<Student> studentList, String subject){
        return studentList.stream()
                .filter(student -> student.getVisitingSubjects().containsKey(subject))
                .collect(Collectors.toList());
    }

    public boolean isBetween(BigDecimal currentMark, BigDecimal leftBorder, BigDecimal rightBorder) {
        return currentMark.compareTo(leftBorder) >= 0 && currentMark.compareTo(rightBorder) <= 0;
    }

    public List<Student> getStudentsByMarksRange(List<Student> studentList, BigDecimal leftBorder,
                                                 BigDecimal rightBorder){
        return studentList.stream()
                .filter(student -> isBetween(CalculateAverageMarkService.calculateAverageMarkPerStudent(student),
                        leftBorder,rightBorder))
                .collect(Collectors.toList());

    }

    public List<Student> getStudentsByPaymentMethod(List<Student> studentList, PaymentMethod paymentMethod){
        return studentList.stream()
                .filter(student -> student.getPaymentMethod().equals(paymentMethod))
                .collect(Collectors.toList());
    }

    public List getStudentsByFormOfStudy(List<Student> studentList, Class clazz){
        return studentList.stream()
                .filter(student -> student.getClass() == clazz)
                .collect(Collectors.toList());
    }




}
