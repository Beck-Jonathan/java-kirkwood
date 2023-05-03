package data;

import java.time.LocalDate;

public class Zelda_Game implements  Comparable<Zelda_Game>, Cloneable{
    private String name;
    private int release_year;
    private boolean IsMultiplayer;
    private String platform;
    private Double secondhand_price;
    private LocalDate dateCompleted;

    public Zelda_Game() {
        name = "unknown";
        release_year = 0;
        IsMultiplayer = false;
        platform = "none";
        secondhand_price = 0d;
        dateCompleted = LocalDate.now();
    }

    public Zelda_Game(String name, int release_year, boolean isMultiplayer, String platform, Double secondhand_price, LocalDate dateCompleted) {
        this.name = name;
        this.release_year = release_year;
        this.IsMultiplayer = isMultiplayer;
        this.platform = platform;
        this.secondhand_price = secondhand_price;
        this.dateCompleted = dateCompleted;
    }

    public String getName() {

        return name;
    }

    public void setName(String name) {

        this.name = name;
    }

    public int getRelease_year() {

        return release_year;
    }

    public void setRelease_date(int release_year) {

        this.release_year = release_year;
    }

    public boolean isMultiplayer() {

        return IsMultiplayer;
    }

    public void setMultiplayer(boolean multiplayer) {
        IsMultiplayer = multiplayer;
    }

    public String getPlatform() {

        return platform;
    }

    public void setPlatform(String platform) {

        this.platform = platform;
    }

    public double getSecondhand_price() {

        return secondhand_price;
    }

    public void setSecondhand_price(Double secondhand_price) {

        this.secondhand_price = secondhand_price;
    }

    public LocalDate getDateCompleted() {

        return dateCompleted;
    }

    public void setDateCompleted(LocalDate dateCompleted) {

        this.dateCompleted = dateCompleted;
    }

    @Override
    public int compareTo(Zelda_Game o) {

        return this.name.compareTo(o.name);
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString() {
        return "Zelda_Game{" +
                "name='" + name + '\'' +
                ", release_year=" + release_year +
                ", IsMultiplayer=" + IsMultiplayer +
                ", platform='" + platform + '\'' +
                ", secondhand_price=" + secondhand_price +
                ", dateCompleted=" + dateCompleted +
                '}';
    }
}
