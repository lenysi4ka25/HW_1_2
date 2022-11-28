import java.time.Year;
public class Human {

    String name;
    String city;
    int age;
    int currentYear = Year.now().getValue();
    String post;

    Human(String name, String city, int age, String post) {

        this.name = name;
        this.city = city;
        this.age = age;
        this.post = post;

        System.out.println("Привет! Меня зовут: " + name + ". Я из города: " + city + ". Я родился в " + (currentYear - age) + " году." + " Я работаю на должности " + post + ". Будем знакомы!");
    }
}