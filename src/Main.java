import transport.Car;

public class Main {
    public static void main(String[] args) {
        Human maxim = new Human("Максим", 35, null, "бренд-менеджер");
        Human anya = new Human(null, -29, "Москва", "методист образовательных программ");
        Human katya = new Human("Катя", 28, null, "продакт-менеджер");
        Human artyom = new Human("Артем", 27, "Москва", "директор по развитию бизнеса");
        Human vladimir = new Human("Владимир", 21, "Казань", "не работаю");

        System.out.println("//////");

        Car granta = new Car(null, "Granta", 1.7, "желтый", 2015, "Россия", "механика", "седан", "Г650АС", 5, true);
        Car audi = new Car("Audi", "A8 50 L TDI quattro", 3.0, "черный", 2020, "Германия", "авто", "передний привод", "Л5f4МН161", 5, true);
        Car bmw = new Car("BMW", null, 0.0, "черный", 2021, "Германия", "авто", "", "К123ВР159", 5, true);
        Car kia = new Car("Kia", "Sportage 4-го поколения", 2.4, "красный", 2018, "Южная Корея", "авто", "передний привод", "А531ВД159", 5, true);
        Car hyundai = new Car("Hyundai", "Avante", 1.6, "оранжевый", 2016, "Южная Корея", "авто", "задний привод", "К654ОТ159", 5, true);

        System.out.println("//////");
        Flower roze = new Flower("Роза",null, "Нидерланды", 35.59, 0);
        Flower chrysanthemum = new Flower("Хризантема обыкновенная", null, null, 69.90, 5);
        Flower peony = new Flower("Пион", null, "Англия", 69.9, 1);
        Flower gypsophila = new Flower("Гипсофила", null, "Турция", 19.5, 10);

    }

}