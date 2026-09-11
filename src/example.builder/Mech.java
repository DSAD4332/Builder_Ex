public class Mech {
    private String name;
    private String type;
    private String squadron;
    private int health;
    private int move;
    private String loadout;
    private String special;

//    public String getName() {
//        return this.name;
//    }
    public void setName(String name) {
        this.name = name;
    }
//    public String getType() {
//        return this.type;
//    }
    public void setType(String type) {
        this.type = type;
    }
//    public String getSquadron() {
//        return this.squadron;
//    }
    public void setSquadron(String squadron) {
        this.squadron = squadron;
    }
//    public int getHealth() {
//        return this.health;
//    }
    public void setHealth(int health) {
        this.health = health;
    }
//    public int getMove() {
//        return this.move;
//    }
    public void setMove(int move) {
        this.move = move;
    }
//    public String getLoadout() {
//        return this.loadout;
//    }
    public void setLoadout(String loadout) {
        this.loadout = loadout;
    }
//    public String getSpecial() {
//        return this.special;
//    }
    public void setSpecial(String special) {
        this.special = special;
    }

    @Override
    public String toString() {
        return "Mech{" +
                "Name='" + name + '\'' +
                ", Type='" + type + '\'' +
                ", Squadron='" + squadron + '\'' +
                ", Health='" + health + '\'' +
                ", Move='" + move + '\'' +
                ", Loadout='" + loadout + '\'' +
                ", Special='" + special + '\'' +
                '}';
    }

}
