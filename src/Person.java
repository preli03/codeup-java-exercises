public class Person {
    private String name;

    public Person(String name) {
        this.name = name;
    }


    //return the persons name
    public String getName() {
        return name;
    }


    //change the name field to the passed value
    public void setName(String name) {
        this.name = name;
    }

    // print a message to the console using the persons name
    public void sayHello() {
        System.out.println("Hello, " + name + "!");
    }
    public static void main(String[] args) {
        Person person = new Person("Patricio M.");
        System.out.println("Name: " + person.getName());
        person.setName("Codeup Class");
        person.sayHello();
    }


}

