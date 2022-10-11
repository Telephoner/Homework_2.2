public class Main {
    public static void main(String[] args) {
        Human maxim = new Human("Максим", 1987, null, "бренд-менеджер");
        Human anya = new Human(null, -1993, "Москва", "методист образовательных программ");
        Human katya = new Human("Катя", 1994, null, "продакт-менеджер");
        Human artyom = new Human("Артем", 1995, "Москва", "директор по развитию бизнеса");

        System.out.println(maxim);
        System.out.println(anya);

        Car granta = new Car(null, "Granta", 1.7, "желтый", 2015, "Россия");
        Car audi = new Car("Audi", "A8 50 L TDI quattro", 3.0, "черный", 2020, "Германия");
        Car bmw = new Car("BMW", null, 0.0, "черный", 2021, "Германия");
        Car kia = new Car("Kia", "Sportage 4-го поколения", 2.4, "красный", 2018, "Южная Корея");
        Car hyundai = new Car("Hyundai", "Avante", 1.6, "оранжевый", 2016, "Южная Корея");
    }

}