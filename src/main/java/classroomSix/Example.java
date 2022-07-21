package classroomSix;

import com.github.javafaker.Faker;

public class Example {

    public static void main(String[] args) {
        Employee employee1 = new Employee("Juris", "Kreilis", 31);
        Faker faker = new Faker();
        String name = faker.name().firstName();
        String lastName = faker.name().lastName();
        int age = faker.number().numberBetween(1, 100);
        Employee employee2 = new Employee(name, lastName, age);
        System.out.println(employee2.toString());
        System.out.println(employee1.toString());
        System.out.println(faker.letterify("123456432345432???232"));
    }

}
