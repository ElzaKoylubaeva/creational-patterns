package ru.netology.koylubaevaem.task1;

public class PersonBuilder {

    private String name;

    private String surname;

    private Integer age;

    private String city;

    public PersonBuilder setName(String name) {
        this.name = name;
        return this;
    }

    public PersonBuilder setSurname(String surname) {
        this.surname = surname;
        return this;
    }

    public PersonBuilder setAge(Integer age) {
        int minAge = 0;
        int maxAge = 110;
        if (age >= minAge && age <= maxAge) {
            this.age = age;
            return this;
        } else {
            throw new IllegalStateException("Invalid age value. Minimum age is: " + minAge +
                    ", maximum age is: " + 110);
        }
    }

    public PersonBuilder setCity(String city) {
        this.city = city;
        return this;
    }

    public Person build() {
        if (name != null && surname != null) {
            return new Person(name, surname, age, city);
        } else {
            throw new IllegalStateException("Name and surname are mandatory fields");
        }
    }
}
