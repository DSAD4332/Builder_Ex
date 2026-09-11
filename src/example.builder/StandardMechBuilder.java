public class StandardMechBuilder implements MechBuilder {
    private final Mech mech = new Mech();

    @Override
    public void setName(String name) {
        mech.setName(name);
    }
    @Override
    public void setType(String type) {
        mech.setType(type);
    }
    @Override
    public void setSquadron(String squadron) {
        mech.setSquadron(squadron);
    }
    @Override
    public void setHealth(int health) {
        mech.setHealth(health);
    }
    @Override
    public void setMove(int move) {
        mech.setMove(move);
    }
    @Override
    public void setLoadout(String loadout) {
        mech.setLoadout(loadout);
    }
    @Override
    public void setSpecial(String special) {
        mech.setSpecial(special);
    }
    @Override
    public Mech build() {
        return mech;
    }
}
