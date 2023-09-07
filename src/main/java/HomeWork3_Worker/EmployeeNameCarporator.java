package HomeWork3_Worker;

import java.util.Comparator;

public class EmployeeNameCarporator implements Comparator<Employee> {


    @Override
    public int compare(Employee o1, Employee o2) {
        int result = o1.getSurName().compareTo(o2.getSurName());
        if(result == 0){
            return o1.getName().compareTo(o2.getName());    //если фамилии совпадают, возвращаем сравнение по именам
        }
        return result;
    }

}
