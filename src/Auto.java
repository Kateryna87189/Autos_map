import java.util.Objects;

public class Auto {
    private String number;
    private String brand;
    private String color;

    public Auto(String number, String brand, String color) {
        this.number = number;
        this.brand = brand;
        this.color = color;
    }

    public String getNumber() {
        return number;
    }

    public String getBrand() {
        return brand;
    }

    public String getColor() {
        return color;
    }
    @Override
    public String toString() {
        return String.format("Автомобіль з номером: %s, марки: %s, колір: %s ", number, brand, color);
    }


}
