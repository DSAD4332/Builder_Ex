public class MechDirector {
    public Mech construct(MechBuilder builder,
                          SquadronLoadout loadout,
                          MechType type) {
        builder.setSquadron(loadout.getSquadronName());
        switch (type) {
            case PRIME:
                builder.setName("Close-combat Mech");
                builder.setType(MechType.PRIME.toString());
                builder.setHealth(4);
                builder.setMove(3);
                builder.setLoadout(loadout.getPrimeWeapon());
                builder.setSpecial(loadout.getSquadronSpecial());
                break;
            case RANGED:
                builder.setName("Range-combat Mech");
                builder.setType(MechType.RANGED.toString());
                builder.setHealth(2);
                builder.setMove(2);
                builder.setLoadout(loadout.getRangedWeapon());
                builder.setSpecial(loadout.getSquadronSpecial());
                break;
            case SCIENCE:
                builder.setName("Support Mech");
                builder.setType(MechType.SCIENCE.toString());
                builder.setHealth(3);
                builder.setMove(2);
                builder.setLoadout(loadout.getScienceWeapon());
                builder.setSpecial(loadout.getSquadronSpecial());
                break;
        }
        return builder.build();
    }
}
