package web;

public class Car {
    String mark;
    String country;
    int power;

    @Override
    public String toString() {
        return "Car: " +
                "mark='" + mark + '\'' +
                ", country='" + country + '\'' +
                ", power=" + power;
    }

    public Car(String mark, String country, int power) {
        this.mark = mark;
        this.country = country;
        this.power = power;
    }

    public String getMark() {
        return mark;
    }

    public void setMark(String mark) {
        this.mark = mark;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }
}
