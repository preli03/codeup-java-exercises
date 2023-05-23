import java.util.Arrays;

public class ArraysExercises {

    public static void main(String[] args) {
       /* int[] numbers = {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(numbers));
*/
        //create an array that holds 3 DC female villains
        Person[] persons = new Person[3];
        persons[0] = new Person("Poison Ivy");
        persons[1] = new Person("Batgirl");
        persons[2] = new Person("Harley");
        for (Person person : persons) {
            System.out.println(person.getName());
        }

        persons = addPerson(persons, new Person("Ripley"));
//made a for loop to iterate the updated persons

        for (Person person : persons) {
            System.out.println(person.getName());
        }
    }
//this output provides the concatenation of the old array and new array including said new person or DC villain in this example
    public static Person[] addPerson(Person[] people, Person newPerson) {
        Person[] newPeople = Arrays.copyOf(people, people.length + 1);
        newPeople[newPeople.length - 1] = newPerson;
        return newPeople;
    }
}
