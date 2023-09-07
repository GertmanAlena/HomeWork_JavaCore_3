package HomeWork3_Worker;

import java.util.ArrayList;
import java.util.List;

public class Worker extends Employee {
    private static String type = "рабочий";

    /**
     * ставка з/пл сотрудника
     */
    private double salary;
    public Worker(String surName, String name, int age, double baseSalary) {
        super(surName, name, age, baseSalary);
        this.type = type;
        this.salary = calculateSalary();
    }

    public static Employee getInstance(){

        return new Worker(surNames[random.nextInt(surNames.length)],
                names[random.nextInt(names.length)], random.nextInt(18, 60), random.nextInt(30000, 250000));
    }
    public static Employee getEmployees(){
//        List<Employee> employees = new ArrayList<>();
//        for (int i = 0; i < count; i++) {
//            employees.add(getInstance());
//            allWorkers.add(getInstance());

//        }

//        return employees;
        return getInstance();
    }

    public double getSalary() {
        return salary;
    }
    /**
     * переопределённый метод расчёта з/пл фрилансера
     * @return
     */
    @Override
    public double calculateSalary(){
        return baseSalary;
    }


    @Override
    public String toString() {
        return String.format("%s %s %d |%s| заработная плата фиксированная =: %.2f (руб.)",
                surName, name, age, type, baseSalary);
    }


}
