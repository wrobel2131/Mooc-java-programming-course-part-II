package validating;

public class Person {

    private String name;
    private int age;

    public Person(String name, int age) {
        if(name == null || name.isBlank() || name.length() > 40) {
            throw new IllegalArgumentException("Name cannot be empty or over 40 characters long!");
        }
        if(age < 0 || age > 120) {
            throw new IllegalArgumentException("Age must be between 0 and 120");
        }

        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}
