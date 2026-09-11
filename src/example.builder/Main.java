public class Main {
    public static void main(String[] args) {
        SquadronLoadout flame = new FlameBehemoths().getLoadout();
        SquadronLoadout steel = new SteelJudoka().getLoadout();
        SquadronLoadout cataclysm = new Cataclysm().getLoadout();

        MechDirector director = new MechDirector();

        Mech FlamePrimeMech = director.construct(new StandardMechBuilder(), flame, MechType.PRIME);
        Mech SteelRangedMech = director.construct(new StandardMechBuilder(), steel, MechType.RANGED);
        Mech CataclysmScienceMech = director.construct(new StandardMechBuilder(), cataclysm, MechType.SCIENCE);
        System.out.println(FlamePrimeMech);
        System.out.println(SteelRangedMech);
        System.out.println(CataclysmScienceMech);
    }
}