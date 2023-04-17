package en.codegym.task.pro.task10.task1005;

/* 
Serial entrepreneur
Directions say get rid of the constructor, but then nothing works?
skipping for now
Jonathan 4/17
*/

public class Building {
    private String type;

    public Building(String type) {
        this.type = type;
    }

    public void initialize(String str){
        this.type=str;
    }

    public static void main(String[] args) {
        Building building = new Building("Restaurant");
        building.initialize("Barbershop");
    }
}
