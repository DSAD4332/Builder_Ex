public class Main {
    public static void main(String[] args) {
        Coin penny = new Coin.Builder("Penny", 0.8, 1)
                .setDescription("Regular Penny")
                .build();
        penny.getResult();

        MechDirector director = new MechDirector();

        MechBuilder builder = new PrimeMechBuilder();

        Mech computer = director.construct(builder);

        System.out.println(computer);
    }
}