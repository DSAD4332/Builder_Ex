public class MechDirector {
    public Mech construct(MechBuilder builder) {
        builder.setName("Combat Mech");
        builder.setType("Prime");
        builder.setSquadName("Rift Walkers");
        builder.setHealth(3);
        builder.setMove(3);
        builder.setLoadout("Titan Fist");
        builder.setSpecial("None");

        return builder.build();
    }
}
