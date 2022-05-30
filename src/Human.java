public class Human {

    String name;
    String surname;
    String patronymic;
    int age;

    void setName(String name) {
        this.name = name;
    }

    String getName() {
        return name;
    }

    void setSurname(String surname) {
        this.surname = surname;
    }

    String getSurname() {
        return surname;
    }

    void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }

    String getPatronymic() {
        return patronymic;
    }

    void setAge(int age) {
        this.age = age;
    }

    int getAge() {
        return age;
    }

    Human() {

    }

    Human(String name, int age) {

    }

    @Override
    public String toString() {
        return "Human{" +
                "name='" + name +
                "surname='" + surname +
                "patronymic='" + patronymic +
                "age ='" + age + '}';
    }
}


