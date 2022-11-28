public class Car {
    String model;
    double engineCapacity;
    String bodyColor;
    int yearOfProduction;
    String productionCountry;

    Car(String model, double engineCapacity, String bodyColor, int yearOfProduction, String productionCountry) {
        this.model = model;
        this.engineCapacity = engineCapacity;
        this.bodyColor = bodyColor;
        this.yearOfProduction = yearOfProduction;
        this.productionCountry = productionCountry;
        System.out.println(model + " объём двигателя " + engineCapacity + " л., " + bodyColor + yearOfProduction + productionCountry);
    }
}
