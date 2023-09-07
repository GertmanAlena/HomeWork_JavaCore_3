package HomeWork3_Worker;

import java.util.*;

public abstract class Employee implements Comparable<Employee>  {

    //region Static filed
    protected static String[] names = new String[] { "Анатолий", "Глеб", "Клим", "Мартин", "Лазарь", "Владлен", "Клим", "Панкратий", "Рубен", "Герман" };
    protected static String[] surNames = new String[] { "Григорьев", "Фокин", "Шестаков", "Хохлов", "Шубин", "Бирюков", "Копылов", "Горбунов", "Лыткин", "Соколов" };
    protected static Random random = new Random();
    private static int counter = 1000;
    static List<Employee> allWorkers = new ArrayList<>();
    //endregion

    //region Filed
    private int id;
    /**
     * имя сотрудника
     */
    protected String name;
    /**
     * фамилия сотрудника
     */
    protected String surName;
    /**
     * возраст сотрудника
     */
    protected int age;
    /**
     * ставка з/пл сотрудника
     */
    protected double baseSalary;



//    protected String type;
    //endregion

    //region Getters and Setters
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getSurName() {
        return surName;
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(double baseSalary) {
        if(baseSalary < 30000){
            throw new RuntimeException("salary should be higher 30 000");
        }
        this.baseSalary = baseSalary;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    //endregion
    //region Constructors and Initializers
    {
        id = ++counter;
    }
    private Employee(){
        this("#Surnane#", "#Name#");
    }
    private Employee(String surName, String name) {
        this(surName, name, random.nextInt(16, 65), random.nextInt(1000, 2000));
    }
    protected Employee(String surName, String name, int age, double baseSalary) {
        if(baseSalary < 1000){
            throw new RuntimeException("salary should be higher 30 000");
        }
        if(age < 18){
            throw new RuntimeException("маленький");
        }
        this.name = name;
        this.surName = surName;
        this.age = age;
        this.baseSalary = baseSalary;
    }

    //endregion

    //region Public Metods

    /**
     * расчёт среднемесячной з/пл
     * @return
     */
    public abstract double calculateSalary();

    /**
     * сортировка по з/пл
     * @param o the object to be compared.
     * @return
     */
    @Override
    public int compareTo(Employee o) {
        return Double.compare(baseSalary,o.getBaseSalary());
    }

    /**
     * вывод в консоль
     */
    static void print(){
        System.out.println("all");
        for (Employee employee : allWorkers) {
            System.out.println(employee);
        }
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", surName='" + surName + '\'' +
                ", age='" + age + '\'' +
                ", salary=" + baseSalary +
                '}';
    }
    //endregion
}
