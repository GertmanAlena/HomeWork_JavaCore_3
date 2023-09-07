package HomeWork3_Worker;


public class Main {
    public static void main(String[] args) {

        int count = 0;
        WorkerGroupe workergr = new WorkerGroupe();
        workergr.add(Worker.getEmployees());
        workergr.add(Worker.getEmployees());
        workergr.add(Worker.getEmployees());
        workergr.add(Worker.getEmployees());
        workergr.add(Freelancer.getEmployees());

        for (Employee employee : workergr){
            count++;
            System.out.println(count + ") " + employee);
        }
        workergr.sortAge();
        workergr.sortName();
        workergr.sortSalary();



    }
}