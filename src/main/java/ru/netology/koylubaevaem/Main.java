package ru.netology.koylubaevaem;

public class Main {

    public static void main(String[] args) {

        Person mom = new PersonBuilder()
                .setName("Ann")
                .setSurname("Wolf")
                .setAge(31)
                .setCity("Sydney")
                .build();
        System.out.println(mom);

        Person son = mom.newChildBuilder()
                .setName("Antony")
                .build();
        System.out.println(son);

        try {
            new PersonBuilder().build();
        } catch (IllegalStateException e) {
            e.printStackTrace();
        }

        try {
            new PersonBuilder().setAge(-100).build();
        } catch(IllegalArgumentException e){
            e.printStackTrace();
        }
    }
}
