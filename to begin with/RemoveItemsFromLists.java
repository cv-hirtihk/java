import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class RemoveItemsFromLists{
    public static void main(String args[]){
        // Prints date in the format, 1940-06-18
        System.out.println(LocalDate.of(1940, 6, 18));
        
        List<Person> beatles = new ArrayList<>();        
        beatles.add(new Person("1", "John", LocalDate.of(1940, 10, 9)));
        beatles.add(new Person("2", "Paul", LocalDate.of(1942, 6, 18)));
        beatles.add(new Person("3", "George", LocalDate.of(1943, 2, 25)));
        beatles.add(new Person("4", "Ringo", LocalDate.of(1940, 7, 7)));
        
        System.out.println(beatles);
    }
    
    static class Person{
        private final String id;
        private final String name;
        private final LocalDate dateOfBirth;
        
        Person(String id, String name, LocalDate dateOfBirth){
            this.id = id;
            this.name = name;
            this.dateOfBirth = dateOfBirth;
        }
        
        public String getId(){
            return id;
        }
        
        public String getName(){
            return name;
        }
        
        public LocalDate getDateOfBirth(){
            return dateOfBirth;
        }
        
        @Override
        public boolean equals(Object o){
            if(this == o){
                return true;
            }
            
            if(o == null || getClass() != o.getClass()){
                return false;
            }
            
            var person = (Person) o;
            return Objects.equals(id, person.id) && Objects.equals(name, person.name) && Objects.equals(dateOfBirth, person.dateOfBirth);
        }
        
        @Override
        public int hashCode(){
            return Objects.hash(id, name, dateOfBirth);
        }
        
        @Override
        public String toString(){
            return "Person{" + "name='" + name + '\'' + '}';
        }
    }
}
