package ua.training.model.services;

import ua.training.model.entities.Student;

import java.math.BigDecimal;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;
import java.util.stream.Collectors;

public class PerfomanceService {
    private BigDecimal maxAverageMark;
    private Student findingStudent;

    public AtomicReference<Student> getBestStudentBySubject(List<Student> studentList, String nameOfSubject){
        AtomicReference<Student> bestStudent = new AtomicReference<>();
        studentList.forEach(student -> {
            if (student.getVisitingSubjects().containsKey(nameOfSubject)
                    && student.getVisitingSubjects().get(nameOfSubject)
                        .compareTo(bestStudent.get().getVisitingSubjects().get(nameOfSubject)) > 0){
                bestStudent.set(student);
            }

        });
        return bestStudent;
    }

    public Student getBestPerfomancedStudent(List<Student> studentList){
        maxAverageMark = BigDecimal.valueOf(0);
        studentList.forEach(student -> {
            if(CalculateAverageMarkService.calculateAverageMarkPerStudent(student).compareTo(maxAverageMark) > 0 ){
                maxAverageMark = CalculateAverageMarkService.calculateAverageMarkPerStudent(student);
                findingStudent = student;
            }
        });
        return findingStudent;
    }

    public List<Student> getSortedStudentsList(List<Student>studentList){
        return studentList.stream()
                .sorted(Student.COMPARE_BY_AVERAGE_MARK)
                .collect(Collectors.toList());
    }
}
