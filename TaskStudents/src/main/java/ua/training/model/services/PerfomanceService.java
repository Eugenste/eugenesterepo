package ua.training.model.services;

import ua.training.model.entities.Student;

import java.util.List;
import java.util.concurrent.atomic.AtomicReference;

public class PerfomanceService {
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
}
