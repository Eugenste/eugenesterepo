package ua.training.model.services;

import ua.training.model.entities.Student;

import java.math.BigDecimal;
import java.util.List;

public class CalculateAverageMarkService {

    public static BigDecimal calculateAverageMarkPerStudent(Student student){
        BigDecimal averageMark = BigDecimal.valueOf(0);
        student.getVisitingSubjects().forEach((key,value) -> averageMark.add(value));
        return averageMark.divide(BigDecimal.valueOf(student.getVisitingSubjects().size()));
    }

    public static BigDecimal calculateAverageMark(List<Student> students){
        BigDecimal sumOfMarks = BigDecimal.valueOf(0);
        students.forEach(x->sumOfMarks.add(calculateAverageMarkPerStudent(x)));
        return sumOfMarks.divide(BigDecimal.valueOf(students.size()));
    }

}
