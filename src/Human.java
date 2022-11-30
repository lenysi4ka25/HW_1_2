import java.time.Year;
public class Human {

    String name;
    String city;
    int age;
    int currentYear = Year.now().getValue();
    String post;

    Human(String name, String city, int age, String post) {

        if (age < 0) {
            this.age = 0;
        } else {
            this.age = age;
        }
        if (name == null) {
            this.name = "Информация не указана";
        }else {
            this.name = name;
        }
        if (city == null) {
            this.city = "Информация не указана";
        }else {
            this.city = city;
        }
        if (post == null) {
            this.post = "Информация не указана";
        }else {
            this.post = post;
        }
        }

    @Override
    public String toString() {
        return "Привет! Меня зовут " + name +
                " Я из города: " + city +
                ". Я родился в " + (currentYear - age) +
                " году. Я работаю на должности " + post + ". Будем знакомы!";
    }
}
    /*Задание 1
Продолжим работать с классом human.

Дополните созданные ранее конструкторы проверками, которые позволяют проверить, что год рождения не может быть отрицательным,
или ставят значение по умолчанию, равное нулю.

Если не указано имя, город проживания или должность, то программа должна подставить значение «Информация не указана» при выводе в консоль.*/