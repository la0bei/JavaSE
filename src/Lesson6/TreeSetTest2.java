package Lesson6;

import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeSet;

/**
 * Created by user01 on 2016/5/4.
 */
public class TreeSetTest2 {
    public static void main(String[] args) {
        TreeSet<Person> set = new TreeSet<Person>(new PersonComparator());
        set.add(new Person(10));
        set.add(new Person(20));
        set.add(new Person(60));
        set.add(new Person(40));

        for (Iterator<Person> iterator = set.iterator(); iterator.hasNext();) {
            Person p = iterator.next();
            System.out.println(p.score);
        }

    }
}
class Person {
    int score;
    public Person(int score) {
        this.score = score;
    }

    @Override
    public String toString() {
        return String.valueOf(score);
    }
}
class PersonComparator implements Comparator<Person>{
    @Override
    public int compare(Person o1, Person o2) {
        return o1.score - o2.score;
    }
}
