import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Employee {

    private String name;
    private int age;
    private int salary;

    public Employee(String name, int age, int salary){
        this.name=name;
        this.age=age;
        this.salary=salary;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return "name = "+name+", Age "+age+", Salary "+salary;
    }
}
class ComparatorExample{
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee("Sumit",25,100000));
        employees.add(new Employee("Rutuja",23,100000));
        employees.add(new Employee("Nayan",22,4334232));

//        Collections.sort(employees, new Comparator<Employee>() {
//            @Override
//            public int compare(Employee o1, Employee o2) {
//                if(o1.getSalary()==o2.getSalary()){
//                    return o1.getAge()-o2.getAge();
//                }else{
//                    return o1.getSalary()-o2.getSalary();
//                }
//            }
//        });
//        using lambda
        employees.sort((e1,e2)->{
            if(e1.getSalary()==e2.getSalary()){
                return e2.getAge()-e1.getAge();
            }else{
                return e1.getSalary()-e2.getSalary();
            }
        });
        for(Employee employee : employees){
            System.out.println(employee.toString());
        }
    }
}
