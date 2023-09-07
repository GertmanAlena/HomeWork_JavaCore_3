package HomeWork3_Worker;

import java.util.*;

public class WorkerGroupe implements Iterable<Employee>, Comparable<Employee>{
    private static List<Employee> allList;
    static int id;

    public WorkerGroupe(){
        id = 0;
        allList = new ArrayList<>();
    }

    public void add(Employee employee){
        allList.add(employee);
    }
    public Iterator<Employee> iterator(){
        return allList.iterator();
    }

    /**
     * метод сортировки по возрасту
     */
    public void sortAge(){
        Collections.sort(allList, new EmployeeAgeComporator());
        System.out.println(">>>>>>>> sortAge <<<<<<<<<");
        for (Employee employee : allList) {
            System.out.println(employee);
        }
        System.out.println("****************************");
    }

    /**
     * метод сортировки по имени
     */
    public void sortName(){
        Collections.sort(allList, new EmployeeNameCarporator());
        System.out.println(">>>>>>>> sortName <<<<<<<<<");
        for (Employee employee : allList) {
            System.out.println(employee);
        }
        System.out.println("****************************");
    }

    /**
     * метод сортировки по заработной плате
     */
    public static void sortSalary(){
        Collections.sort(allList);
        System.out.println(">>>>>>>> sortSalary <<<<<<<<<");
        for (Employee employee : allList) {
            System.out.println(employee);
        }
        System.out.println("****************************");
    }

    @Override
    public int compareTo(Employee o) {
        return 0;
    }
}
