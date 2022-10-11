public class Car {
    String brand;
    String model;
    double engineVolume;
    String color;
    int productionYear;
    String productionCountry;

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

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setEngineVolume(double engineVolume) {
        this.engineVolume = engineVolume;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setProductionYear(int productionYear) {
        this.productionYear = productionYear;
    }

    public void setProductionCountry(String productionCountry) {
        this.productionCountry = productionCountry;
    }

    public Car(String brand, String model, double engineVolume, String color, int productionYear, String productionCountry) {
        if (brand == null) {
            brand = "default";
        } else {
            this.brand = brand;
        }
        if (model == null) {
            model = "default";
        } else {
            this.model = model;
        }
        if (engineVolume == 0.0) {
            engineVolume = 1.5;
        } else {
            this.engineVolume = engineVolume;
        }
        if (color == null) {
            color = "белый";
        } else {
            this.color = color;
        }
        if (productionYear == 0) {
            productionYear = 2000;
        } else {
            this.productionYear = productionYear;
        }
        if (productionCountry == "null") {
            productionCountry = "default";
        } else {
            this.productionCountry = productionCountry;
        }
        System.out.println(this);

    }

    @Override
    public String toString() {
        return "Автомобиль: " + getBrand() + " " + getModel() + ". Объем двигателя: " + getEngineVolume() + ". Цвет: " + getColor() + ". Год производства: " + getProductionYear() + ". Страна производства: " + getProductionCountry();
    }
}
