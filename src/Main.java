public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world!");
        Wall wall= new Wall(9,8);
        System.out.println(wall.getWidth());
        Person person= new Person("5","9",8);
        System.out.println("Firstname: " + person.getFirstName());

        System.out.println("LastName: " + person.getLastName());

        System.out.println("Age: " + person.getAge());
    }
}