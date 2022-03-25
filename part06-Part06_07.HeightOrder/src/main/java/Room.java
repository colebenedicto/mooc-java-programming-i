import java.util.ArrayList;

public class Room {
    private ArrayList<Person> list;
    
    public Room() {
        this.list = new ArrayList<>();
    }
    
    public void add(Person person) {
        list.add(person);
    }
    
    public boolean isEmpty() {
        if (this.list.isEmpty()) {
            return true;
        }
        return false;
    }
    
    public ArrayList<Person> getPersons() {
        return list;
    }
    
    public Person shortest() {
        if (this.list.isEmpty()) {
            return null;
        }
        
        Person shortest = new Person("name", 300);
        
        for (Person person : list) {
            if (shortest.getHeight() > person.getHeight()) {
                shortest = person;
            }
        }
        
        return shortest;
    }
    
    public Person take() {
        if (this.list.isEmpty()) {
            return null;
        }
        
        Person removePerson = shortest();
        int j = list.indexOf(removePerson);
        return this.list.remove(j);
    }
}
