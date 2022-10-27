package ru.netology.koylubaevaem.task1;

public class Person {

    private final String name;

    private final String surname;

    private Integer age;

    private String city;

    public Person(String name, String surname, Integer age, String city) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.city = city;
    }

    public boolean hasAge() {
        return age != null;
    }

    public void happyBirthday() {
        if (hasAge()) {
            age++;
        } else {
            System.out.println("The age is not set");
        }
    }

    public boolean hasAddress() {
        return city != null;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getAge() {
        return age;
    }

    public String getCity() {
        return city;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                ", city='" + city + '\'' +
                '}';
    }

    public PersonBuilder newChildBuilder() {
        return new PersonBuilder()
                .setSurname(surname)
                .setAge(1)
                .setCity(city);
    }
}
