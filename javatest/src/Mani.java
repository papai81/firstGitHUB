import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Mani {

    public static void main(String[] args) {
        List<Person> people = List.of(new Person("Maa", Gender.FEMALE),
                new Person("Baba", Gender.MALE),
                new Person("Didi", Gender.FEMALE),
                new Person("Bou", Gender.FEMALE),
                new Person("Hriduu", Gender.MALE)

        );
        //IMPERATIVE
        /*List<Person> females = new ArrayList<>();
        for(Person person: people){
            if(person.gender.equals(Gender.FEMALE)){
                females.add(person);
            }
        }
        for(Person female: females){
            System.out.println(female.name);
        }*/
        //Declarative
        people.stream().filter(per->per.gender.equals(Gender.FEMALE)).collect(Collectors.toList()).forEach(System.out::println);

    }
    static class Person{
        public Person(String name, Gender gender) {
            this.name = name;
            this.gender = gender;
        }

        @Override
        public String toString() {
            return "Person{" +
                    "name='" + name + '\'' +
                    ", gender=" + gender +
                    '}';
        }

        private final String name;
        private final Gender gender;
    }
    enum Gender{
        MALE,FEMALE
    }
}
