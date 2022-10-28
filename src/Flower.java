public class Flower {
    private String flowerName;
    private String flowerColor;
    private String country;
    private double cost;
    int lifeSpan;

    public Flower(String flowerName, String flowerColor, String country, double cost, Integer lifeSpan) {
        if (isEmptyOrNull(flowerName)) {
            this.flowerName = "Цветок";
        } else {
            this.flowerName = flowerName;
        }
        if (isEmptyOrNull(flowerColor)) {
            this.flowerColor = "Белый";
        } else {
            this.flowerColor = flowerColor;
        }
        if (isEmptyOrNull(country)) {
            this.country = "Россия";
        } else {
            this.country = country;
        }
        if (cost <= 0) {
            this.cost = 1;
        } else {
            this.cost = cost;
        }
        if (lifeSpan <= 0) {
            this.lifeSpan = 3;
        } else {
            this.lifeSpan = lifeSpan;
        }
        System.out.println(this);
    }

    public String getFlowerColor() {
        return flowerColor;
    }

    public void setFlowerColor(String flowerColor) {
        this.flowerColor = flowerColor;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(Integer cost) {
        this.cost = cost;
    }

    public void setLifeSpan(int lifeSpan) {
        if (lifeSpan == Integer.parseInt(null)) {
            this.lifeSpan = 3;
        } else {
            this.lifeSpan = lifeSpan;
        }
    }

    public static boolean isEmptyOrNull(String value) {
        return value == null || value.isEmpty();
    }

    @Override
    public String toString() {
        return "Flower{" +
                "name='" + flowerName + '\'' +
                ", flowerColor='" + flowerColor + '\'' +
                ", country='" + country + '\'' +
                ", cost=" + cost +
                ", lifeSpan=" + lifeSpan +
                '}';
    }
}
