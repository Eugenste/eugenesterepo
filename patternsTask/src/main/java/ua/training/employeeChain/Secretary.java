package ua.training.employeeChain;

import java.util.Map;

public abstract class Secretary {
    private Employee employee;
    private int priority;
    private Secretary nextByImportant;


    public Secretary(int priority){
        this.priority = priority;
    }

    public void directTo(Employee employee){
        if(employee.getQuestionId() == priority){
            answeredBy();
        } else {
            nextByImportant.directTo(employee);
        }


    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public void setNextByImportant(Secretary nextByImportant) {
        this.nextByImportant = nextByImportant;
    }

    public abstract void answeredBy();
}
