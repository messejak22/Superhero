public class Superhero extends Tester {

    private String name;
    private String ability;
    private String costume;
    private String weakness;
    private int threatLevel;


    public Superhero(String initName, String intiAbility, String initCostume, String initWeakness, int initThreatLevel) {
        name = initName;
        ability = intiAbility;
        costume = initCostume;
        weakness = initWeakness;
        threatLevel = initThreatLevel;
    }

    public String getName() {
        return name;
    }

    public String getAbility() {
        return ability;
    }

    public String getCostume() {
        return costume;
    }

    public int getThreatLevel() {
        return threatLevel;
    }

    public String getWeakness() {
        return weakness;
    }





    
}