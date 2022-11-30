public class Car {
    String model;
    double engineCapacity;
    String bodyColor;
    int yearOfProduction;
    String productionCountry;

    Car(String model, double engineCapacity, String bodyColor, int yearOfProduction, String productionCountry) {
        if (model == null) {
            this.model = " default ";
        }else {
            this.model = model;
        }
        if (Double.compare(engineCapacity, 0) == 0) {
            this.engineCapacity = 1.5;
        }else {
            this.engineCapacity = engineCapacity;
        }
        if (productionCountry == null) {
            this.productionCountry = " default ";
        }else {
            this.productionCountry = productionCountry;
        }
        if (bodyColor == null) {
            this.bodyColor = "белый, ";
        }else {
            this.bodyColor = bodyColor;
        }
        if (yearOfProduction == 0) {
            this.yearOfProduction = 2000;
        }else {
            this.yearOfProduction = yearOfProduction;
        }

//        System.out.println(model +
    }

    @Override
    public String toString() {
        return
                model + " объём двигателя " +
                        engineCapacity + " л., " +
                        bodyColor + yearOfProduction + " года выпуска, " + productionCountry;
    }
}
