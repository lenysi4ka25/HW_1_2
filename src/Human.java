import java.time.Year;
public class Human {

    String name;
    String city;
    int age;
    int currentYear = Year.now().getValue();

    Human(String name, String city, int age) {
        this.name = name;
        this.city = city;
        this.age = age;
        System.out.println("Привет! Меня зовут: " + name + ". Я из города: " + city + ". Я родился в " + (currentYear - age) + " году. Будем знакомы!");
          }
}