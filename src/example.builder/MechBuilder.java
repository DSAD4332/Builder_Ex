public interface MechBuilder {
    void setName(String name);
    void setType(String type);
    void setSquadron(String squadName);
    void setHealth(int health);
    void setMove(int move);
    void setLoadout(String loadout);
    void setSpecial(String special);
    Mech build();
}
