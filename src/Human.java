import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Calendar;
import java.util.Objects;

public class Human {
    private String name;
    private Integer yearOfBirth;
    private String town;
    private String position;

    public String getName() {
        return name;
    }

    public Integer getYearOfBirth() {
        return yearOfBirth;
    }

    public String getTown() {
        return town;
    }

    public String getPosition() {
        return position;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setYearOfBirth(Integer yearOfBirth) {
        this.yearOfBirth = yearOfBirth;
    }

    public void setTown(String town) {
        this.town = town;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public Human(String name, Integer yearOfBirth, String town, String position) {
      if (name == null) {
          name = "Информация не указана";
      } else {
        this.name = name;
        if (yearOfBirth >= 0) {
            this.yearOfBirth = yearOfBirth;
        } else {
            this.yearOfBirth = Math.abs(yearOfBirth);
        }
        if (town == null) {
            town = "Информация не указана";
        } else {
            this.town = town;
        }
        if (position == null) {
            position = "Информация не указана";
        } else {
            this.position = position;
        }
        System.out.println(this);
    }
}

    @Override
    public String toString() {
        return "Привет! Меня зовут " +
                name + ", я из города " +
                town +
                ". Мне " + (Calendar.getInstance().get(Calendar.YEAR) - yearOfBirth) + " лет. Я работаю на должности " + position + ". Будем знакомы!";
    }
}
