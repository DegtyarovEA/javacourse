package com.qulix.cs.classes;

public class Car {
    private static int counter = 0;
    private final int id = counter++;
    private String mark;
    private String model;
    private int yearIssue;
    private String colour;
    private int cost;
    private String governmentNumber;

    public Car() {
        this.mark = "undefined";
        this.model = "undefined";
        this.yearIssue = 0;
        this.colour = "undefined";
        this.cost = 0;
        this.governmentNumber = "undefined";
    }

    public Car(String mark, String model, int yearIssue, String colour, int cost, String governmentNumber) {
        this.mark = mark;
        this.model = model;
        this.yearIssue = yearIssue;
        this.colour = colour;
        this.cost = cost;
        this.governmentNumber = governmentNumber;
    }

    public static Car[] createArrayCars(int count) {
        Car[] cars = new Car[count];
        for (int i = 0; i < cars.length; i++) {
            cars[i] = new Car("mark" + i, "model" + i, 2000 + i,
                    "colour" + i, 1000 * i, String.valueOf(8000 + i).concat(" KC-7"));
        }
        return cars;
    }

    public static void printCars(Car[] cars, String mark) {
        for (int i = 0; i < cars.length; i++) {
            if (cars[i].getMark().equals(mark)) {
                System.out.print(cars[i] + "\n" );
            }
        }
    }

    public static void printCars(Car[] cars, String model, int moreYears) {
        for (int i = 0; i < cars.length; i++) {
            if (cars[i].getModel().equals(model) &&
                    (2019 - cars[i].getYearIssue() >= moreYears)) {
                System.out.print(cars[i] + "\n" );
            }
        }
    }

    public static void printCars(Car[] cars, int year, int minCost) {
        for (int i = 0; i < cars.length; i++) {
            if (cars[i].getYearIssue() == year && cars[i].getCost() >= minCost) {
                System.out.print(cars[i] + "\n" );
            }
        }
    }

    public int getId() {
        return id;
    }

    public String getMark() {
        return mark;
    }

    public String getModel() {
        return model;
    }

    public int getYearIssue() {
        return yearIssue;
    }

    public String getColour() {
        return colour;
    }

    public int getCost() {
        return cost;
    }

    public String getGovernmentNumber() {
        return governmentNumber;
    }

    public void setMark(String mark) {
        this.mark = mark;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setYearIssue(int yearIssue) {
        this.yearIssue = yearIssue;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public void setGovernmentNumber(String governmentNumber) {
        this.governmentNumber = governmentNumber;
    }

    @Override
    public String toString() {
        return "Car:" +
                "\nID: " + id +
                "\nMark: " + mark +
                "\nModel: " + model +
                "\nYear of issue: " + yearIssue +
                "\nColour: " + colour +
                "\nCost: " + cost +
                "\nNumber: " + governmentNumber + "\n";
    }

    public static void main(String[] args) {
        Car[] cars = createArrayCars(5);

        cars[2].setMark("mark0");
        cars[3].setMark("mark0");
        System.out.println("Вывод всех авто с маркой \"mark0\"");
        printCars(cars, "mark0");

        cars[0].setModel("model2");
        cars[1].setModel("model2");
        System.out.println("Вывод всех авто с моделью \"model2\" и которым более 5 лет");
        printCars(cars, "model2", 5);

        System.out.println("Вывод всех авто 2002 года у которых цена более 1002");
        printCars(cars, 2002, 1002);
    }
}
