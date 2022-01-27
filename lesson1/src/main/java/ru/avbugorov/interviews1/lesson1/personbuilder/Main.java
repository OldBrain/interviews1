package ru.avbugorov.interviews1.lesson1.personbuilder;

public class Main {

  public static void main(String[] args) {
    PersonBuilder personBuilder = new PersonBuilder();

    Person person = personBuilder.
        createPerson().
        addFirstName("Иван").
        addLastName("Иванов").
        addMiddleName("Иванович").
        addAddress("Москва").
        addCountry("Россия").
        addPone("25-25-25").
        addAge(45).
        addGender("М").
        getPerson();

    System.out.println(person.toString());
  }

}
