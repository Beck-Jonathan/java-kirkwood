public class release {
    private String name;
    private double release_date;
    private String system;

    public release(String name, double release_date, String system) {
        setname(name);
        setRelease_date(release_date);
        setSystem(system);
    }

    public String getname() {
        return name;
    }

    public void setname(String name) {
        if (name == null) {
            throw new IllegalArgumentException("Invalid base");
        }
        this.name = name;
    }

    public double getRelease_date() {
        return release_date;
    }

    public void setRelease_date(double Release_Date) {
        if (Release_Date <= 0) {
            throw new IllegalArgumentException("Invalid height");
        }
        this.release_date = Release_Date;
    }

    public String getSystem() {
        return system;
    }

    public void setSystem(String System) {
        if (System == null) {
            throw new IllegalArgumentException("Invalid height");
        }
        this.system = System;
    }
}
