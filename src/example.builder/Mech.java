public class Mech {
    private String name;
    private String type;
    private String squadName;
    private int health;
    private int move;
    private String loadout;
    private String special;

//    public String getName() {
//        return name;
//    }
    public void setName(String name) {
        this.name = name;
    }
//    public String getType() {
//        return type;
//    }
    public void setType(String type) {
        this.type = type;
    }
//    public String getSquadName() {
//        return squadName;
//    }
    public void setSquadName(String squadName) {
        this.squadName = squadName;
    }
//    public int getHealth() {
//        return health;
//    }
    public void setHealth(int health) {
        this.health = health;
    }
//    public int getMove() {
//        return move;
//    }
    public void setMove(int move) {
        this.move = move;
    }
//    public String getLoadout() {
//        return loadout;
//    }
    public void setLoadout(String loadout) {
        this.loadout = loadout;
    }
//    public String getSpecial() {
//        return special;
//    }
    public void setSpecial(String special) {
        this.special = special;
    }

    @Override
    public String toString() {
        return "Mech{" +
                "Name='" + name + '\'' +
                ", Type='" + type + '\'' +
                ", SquadName='" + squadName + '\'' +
                ", Health='" + health + '\'' +
                ", Move='" + move + '\'' +
                ", Loadout='" + loadout + '\'' +
                ", Special='" + special + '\'' +
                '}';
    }

}
