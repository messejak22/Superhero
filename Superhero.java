public class Superhero extends Tester {

    private String name;
    private String ability;
    private String costume;
    private String weakness;
    private String threatLevel;

    // builds a superhero 
    public Superhero(String initName, String intiAbility, String initCostume, String initWeakness, String initThreatLevel) {
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

    public String getThreatLevel() {
        return threatLevel;
    }

    public String getWeakness() {
        return weakness;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAbility(String ability) {
        this.ability = ability;
    }
    public void setCostume(String costume) {
        this.costume = costume;
    } 
    public void setWeakness(String weakness) {
        this.weakness = weakness;
    }
     public void setThreatLevel(String threatLevel) {
        this.threatLevel = threatLevel;
    }


    public String toString() {
        return name + ability + costume + weakness + threatLevel;
    }



    
}