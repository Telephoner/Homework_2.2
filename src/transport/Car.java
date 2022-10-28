package transport;

import java.time.LocalDate;

public class Car {
    private String brand;
    private String model;
    double engineVolume;
    String color;
    private int productionYear;
    private String productionCountry;
    String transmission;
    private String typeOfBody;
    private String registrationNumber;
    private int numberOfSeats;
    boolean summerTyres;

    public static class Key {
        private boolean remoteEngineLaunch;
        private boolean keylessAccess;


        public Key(boolean remoteEngineLaunch, boolean keylessAccess) {
            if (remoteEngineLaunch) {
                this.remoteEngineLaunch = true;
            } else {
                remoteEngineLaunch = Boolean.parseBoolean("Неверные данные");
            }
            if (keylessAccess) {
                this.keylessAccess = true;
            } else {
                this.keylessAccess = Boolean.parseBoolean("Неверные данные");
            }
        }
    }

    public static class Insurance {
        private LocalDate insuranceExpirationDate;
        private double insuranceCost;
        private String insuranceNumber;

        public Insurance(LocalDate insuranceExpirationDate, double insuranceCost, String insuranceNumber) {
            this.insuranceExpirationDate = insuranceExpirationDate;

            if (insuranceExpirationDate.isBefore(LocalDate.now())) {
                System.out.println("Данная страховка действительна.");
            } else if (insuranceExpirationDate.isAfter(LocalDate.now())) {
                System.out.println("Нужно срочно менять страховку!");
            }
            this.insuranceCost = insuranceCost;
            if (insuranceNumber.length() != 9) {

                this.insuranceNumber = "Номер страховки неверный";

            } else {
                this.insuranceNumber = insuranceNumber;
            }
        }
    }


    public String getTransmission() {
        return transmission;
    }

    public void setTransmission(String transmission) {
        this.transmission = transmission;
    }

    public String getTypeOfBody() {
        return typeOfBody;
    }

    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public void setRegistrationNumber(String registrationNumber) {
        this.registrationNumber = registrationNumber;
    }

    public int getNumberOfSeats() {
        return numberOfSeats;
    }

    public boolean isSummerTyres() {
        return summerTyres;
    }

    public void setSummerTyres(boolean summerTyres) {
        this.summerTyres = summerTyres;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public double getEngineVolume() {
        return engineVolume;
    }

    public String getColor() {
        return color;
    }

    public int getProductionYear() {
        return productionYear;
    }

    public String getProductionCountry() {
        return productionCountry;
    }

    public void setEngineVolume(double engineVolume) {
        this.engineVolume = engineVolume;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Car(String brand, String model, double engineVolume, String color, int productionYear, String productionCountry, String transmission, String typeOfBody, String registrationNumber, int numberOfSeats, boolean summerTyres) {

        if (brand == null) {
            this.brand = "default";
        } else {
            this.brand = brand;
        }
        if (model == null) {
            this.model = "default";
        } else {
            this.model = model;
        }
        if (engineVolume == 0.0) {
            this.engineVolume = 1.5;
        } else {
            this.engineVolume = engineVolume;
        }
        if (isEmptyOrNull(color)) {
            this.color = "белый";
        } else {
            this.color = color;
        }
        if (productionYear == 0) {
            this.productionYear = 2000;
        } else {
            this.productionYear = productionYear;
        }
        if (isEmptyOrNull(productionCountry)) {
            this.productionCountry = "default";
        } else {
            this.productionCountry = productionCountry;
        }
        if (isEmptyOrNull(transmission)) {
            this.transmission = "default";
        } else {
            this.transmission = transmission;
        }
        if (isEmptyOrNull(typeOfBody)) {
            this.typeOfBody = "default";

        } else {
            this.typeOfBody = typeOfBody;
        }
        if (checkNumber(registrationNumber)) {
            this.registrationNumber = registrationNumber;
        } else {
            this.registrationNumber = "Это неправильный регистрационный номер";
        }
        this.numberOfSeats = numberOfSeats;
        this.summerTyres = summerTyres;
        System.out.println(this);
    }

    public static boolean isEmptyOrNull(String value) {
        return value == null || value.isEmpty();
    }

    public void changeTyres() {
        this.summerTyres = !this.summerTyres;
    }

    public boolean checkNumber(String registrationNumber) {
//        х000хх000
        if (registrationNumber.length() < 9) {
            return false;
        }
        char[] number = registrationNumber.toCharArray();
        if (!Character.isAlphabetic(number[0])) {
            return false;
        }
        if (!Character.isDigit(number[1])) {
            return false;
        }
        if (!Character.isDigit(number[2])) {
            return false;
        }
        if (!Character.isDigit(number[3])) {
            return false;
        }
        if (!Character.isAlphabetic(number[4])) {
            return false;
        }
        if (!Character.isAlphabetic(number[5])) {
            return false;
        }
        if (!Character.isDigit(number[6])) {
            return false;
        }
        if (!Character.isDigit(number[7])) {
            return false;
        }
        if (!Character.isDigit(number[8])) {
            return false;
        }
        this.registrationNumber = registrationNumber;
        return true;
    }


    @Override
    public String toString() {
        return "Car{" + "brand='" + brand + '\'' + ", model='" + model + '\'' + ", engineVolume=" + engineVolume + ", color='" + color + '\'' + ", productionYear=" + productionYear + ", productionCountry='" + productionCountry + '\'' + ", transmission='" + transmission + '\'' + ", typeOfBody='" + typeOfBody + '\'' + ", registrationNumber='" + registrationNumber + '\'' + ", numberOfSeats=" + numberOfSeats + ", summerTyres=" + summerTyres + '}';
    }
}
