package ru.avbugorov.interviews1.lesson1.personbuilder;

public class PersonBuilder {
    Person person;


    PersonBuilder createPerson() {
        person = new Person();
        return this;
    }


    PersonBuilder addFirstName(String firstName) {
        person.setFirstName(firstName);
        return this;
    }

    PersonBuilder addLastName(String lastName) {
        person.setLastName(lastName);
        return this;
    }

    PersonBuilder addMiddleName(String middleName) {
        person.setMiddleName(middleName);
        return this;
    }

    PersonBuilder addCountry(String country) {
        person.setCountry(country);
        return this;
    }

    PersonBuilder addAddress(String address) {
        person.setAddress(address);
        return this;
    }

    PersonBuilder addPone(String phone) {
        person.setPhone(phone);
        return this;
    }

    PersonBuilder addAge(int age) {
        person.setAge(age);
        return this;
    }

    PersonBuilder addGender(String gender) {
        person.setGender(gender);
        return this;
    }

    public Person getPerson() {
        return person;
    }
}
