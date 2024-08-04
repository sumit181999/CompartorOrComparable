import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Person implements Comparable<Person>{
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return name + " (" + age + ")";
    }

    @Override
    public int compareTo(Person p) {
        return p.age-this.age;
    }
}
class ComparableExample{
    public static void main(String[] args) {
        List<Person> list = new ArrayList<>();
        list.add(new Person("sumit",24));
        list.add(new Person("rutuja",22));
        list.add(new Person("nayan",26));
        Collections.sort(list);

        for(Person people  : list){
            System.out.println(people.toString());
        }
    }
}
