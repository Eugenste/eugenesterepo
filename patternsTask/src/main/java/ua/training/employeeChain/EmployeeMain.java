package ua.training.employeeChain;

public class EmployeeMain {
    public static void main(String[] args) {
        Secretary mentor = new Mentor(QuestionToComeWith.WORK_QUESTION);
        Secretary warehousekeeper = new Warehousekeeper(QuestionToComeWith.GOODS_QUESTION);
        Secretary accountant = new Accountant(QuestionToComeWith.SALARY_QUESTION);
        Secretary boss = new Boss(QuestionToComeWith.IMPORTANT_QUESTION);

        mentor.setNextByImportant(warehousekeeper);
        warehousekeeper.setNextByImportant(accountant);
        accountant.setNextByImportant(boss);

        Employee employee = new Employee();
        employee.setQuestion(QuestionToComeWith.WORK_QUESTION);

        mentor.directTo(employee);



    }
}
