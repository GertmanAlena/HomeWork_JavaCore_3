package HomeWork3_Worker;

import java.util.ArrayList;
import java.util.List;

public class Freelancer extends Employee {

    private static String type = "фрилансер";
    private double salary;
    public Freelancer(String surName, String name, int age, double baseSalary) {
        super(surName, name, age, baseSalary);
        this.type = type;
        this.salary = calculateSalary();
    }
    public static Employee getInstance(){
        return new Freelancer(surNames[random.nextInt(surNames.length)],
                names[random.nextInt(names.length)],
                random.nextInt(18, 60),
                random.nextInt(1000, 2000));
    }

    /**
     * метод создания рабочих (количество указывается
     * в методе main) и добавление их в лист
     * второй вариант для добавления в итерируемый лист в WirkerGroupe
     * @return
     */
    public static Employee getEmployees(){
//        List<Employee> employees = new ArrayList<>();
//        for (int i = 0; i < count; i++) {
////            employees.add(getInstance());
//            allWorkers.add(getInstance());
//        }
//        return employees;
        return getInstance();
    }

    /**
     * переопределённый метод расчёта з/пл фрилансера
     * @return
     */
    @Override
    public double calculateSalary() {
        return 20.8 * 8 * baseSalary;
    }

    @Override
    public String toString() {
        return String.format("%s %s %d |%s| заработная плата фиксированная =: %.2f (руб.)",
                surName, name, age, type, baseSalary);
    }


}
