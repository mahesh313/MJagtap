/**
 * Created by jagtapm on 7/21/2017.
 */
public class Person {
    private String name;
    private String gender;

    public Person(String name, String gender) {
        this.name = name;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    @Override
    public boolean equals(Object object) {
        Person person = (Person)object;
        if(person!= null && this.getName().equals(person.getName()) && this.getGender().equals(person.getGender()))
            return true;
        else
            return false;
    }

    @Override
    public int hashCode() {
        return (this.getName() + this.getGender()).hashCode();
    }
}
