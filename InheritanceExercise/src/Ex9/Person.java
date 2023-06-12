package Ex9;

class Person {
    private String name;
    private String surname;
    private String phone;

    Person(String name, String surname, String phone) {
        this.name = name;
        this.surname = surname;
        this.phone = phone;
    }

    String getName() {
        return name;
    }

    String getSurname() {
        return surname;
    }

    String getPhone() {
        return phone;
    }
}