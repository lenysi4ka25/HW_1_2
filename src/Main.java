public class Main {
    public static void main(String[] args) {
        System.out.println("Задание 1, 2");
        Human maksim = new Human("Максим", "Минск", -35, "бренд-менеджером");
        Human ann = new Human("Аня", "Москва", 29, "методистом образовательных программ");
        Human kat = new Human("Катя", null, 28, "продакт менеджером");
        Human artem = new Human("Артём" , "Москва", 27, "директором по развитию бизнеса");
        System.out.println("Задание 3");
        Car ladaGranta = new Car(null, 1.7, "желтого цвета, ", 2015, "сборка в России.");
        Car audi = new Car("Audi A8 50 L TDI quattro, ", 0, null, 2020, "сборка в Германии.");
        Car bmw = new Car("BMW Z8,", 3.0, "черный цвет кузова, ", 0, "сборка в Германии.");
        Car kiasportage = new Car("Kia Sportage 4-го поколения,", 2.4, null, 2018, "сборка в Южной Корее.");
        Car hyundaiavante = new Car("Hyundai Avante,", 1.6, "цвет кузова - оранжевый, ", 0, null);
        System.out.println(maksim);
        System.out.println(ann);
        System.out.println(kat);
        System.out.println(artem);
        System.out.println(ladaGranta);
        System.out.println(audi);
        System.out.println(bmw);
        System.out.println(kiasportage);
        System.out.println(hyundaiavante);
    }
        }

