public class SquadronLoadout {
    private final String squadronName;
    private final String squadronSpecial;
    private final String primeWeapon;
    private final String rangedWeapon;
    private final String scienceWeapon;

    public SquadronLoadout(String squadronName,
                            String squadronSpecial,
                            String primeWeapon,
                            String rangedWeapon,
                            String scienceWeapon) {
        this.squadronName = squadronName;
        this.squadronSpecial = squadronSpecial;
        this.primeWeapon = primeWeapon;
        this.rangedWeapon = rangedWeapon;
        this.scienceWeapon = scienceWeapon;
    }

    public String getSquadronName() {
        return squadronName;
    }
    public String getSquadronSpecial() {
        return squadronSpecial;
    }
    public String getPrimeWeapon() {
        return primeWeapon;
    }
    public String getRangedWeapon() {
        return rangedWeapon;
    }
    public String getScienceWeapon() {
        return scienceWeapon;
    }
}
