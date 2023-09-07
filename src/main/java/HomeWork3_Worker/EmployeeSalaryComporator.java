package HomeWork3_Worker;

import java.util.Comparator;

public class EmployeeSalaryComporator implements Comparator<Employee> {

    @Override
    public int compare(Employee worker, Employee worker2) {
        return worker.getAge() - worker2.getAge();
    }
}
