public class Person {
String firstName;
String lastName;
int age;
String city;
String job;
  public Person(String firstName,String lastName,int age){
    this.firstName=firstName;
    this.lastName=lastName;
  }

    public Person(String firstName,String lastName,int age, String city){
      this.firstName=firstName;
    }
public String getFirstName(){
    return firstName;
}
  public String getLastName(){
    return lastName;
  }
  public int getAge(){
    return age;
  }
  public boolean isTeen (){
    return (age>13 && age<19);

  }
}
