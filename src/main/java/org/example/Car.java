package org.example;

public class Car implements Comparable<Car> {
    int speed;
    int price;
    String model;
    String color;

    Car(int speed, int price, String model, String color) {
        this.speed = speed;
        this.price = price;
        this.model = model;
        this.color = color;
    }

    public String toString() {
        return this.model + " " + this.color + " " + this.speed + " " + this.price;
    }

    // Сортируем по скорости/цене
    public int compareTo(Car anotherCar) {
        // speedDifference > 0 if this car has higher speed than anotherCar
        // speedDifference < 0 if this car has lower speed than anotherCar
        // speedDifference == 0 if this car has the same speed as anotherCar

        // Speed comparison
        int speedDifference = this.speed - anotherCar.speed;
//        System.out.println("speedDifference: " + speedDifference + " between " + this.model + " vs " + anotherCar.model);
        if (speedDifference != 0)
            return speedDifference;

        // Price comparison
        int priceDifference = this.price - anotherCar.price;
//        System.out.println("priceDifference: " + priceDifference + " between " + this.model + " vs " + anotherCar.model);
        if (priceDifference != 0)
            return priceDifference;

        // Model & Color comparison
        int modelComparisonResult = this.model.compareTo(anotherCar.model);
//        System.out.println("modelComparisonResult: " + modelComparisonResult  + " between " + this.model + " vs " + anotherCar.model);
        return modelComparisonResult != 0
                ? modelComparisonResult
                : this.color.compareTo(anotherCar.color);
    }

    // Сравнение 2-х строковых значений
    // return this.model.compareTo((Car)o).model);
}

