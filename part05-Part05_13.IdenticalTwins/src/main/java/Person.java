
import java.util.Objects;

public class Person {

    private String name;
    private SimpleDate birthday;
    private int height;
    private int weight;

    public Person(String name, SimpleDate birthday, int height, int weight) {
        this.name = name;
        this.birthday = birthday;
        this.height = height;
        this.weight = weight;
    }

    public boolean equals(Object person) {
        if (this == person){
            return true;
        }
        
        if (!(person instanceof Person)) {
            return false;
        }
        
        Person otherPerson = (Person) person;
        
        if (this.name.equals(otherPerson.name) 
               && this.height == otherPerson.height
               && this.weight == otherPerson.weight
               && this.birthday.equals(otherPerson.birthday)) {
            return true;
        }
        
        return false;
    }
}
