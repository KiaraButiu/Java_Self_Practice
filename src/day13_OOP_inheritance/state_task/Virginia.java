package day13_OOP_inheritance.state_task;

public class Virginia extends State{
    public String footballTeam;

    public Virginia(String name, String abbreviation, String politicalParty, String governor, String senator, int population, String footballTeam) {
        super(name, abbreviation, politicalParty, governor, senator, population);
        this.footballTeam = footballTeam;
    }


    @Override
    public String toString() {
        return super.toString() +
                " footballTeam='" + footballTeam + '\'' +
                '}';
    }
}
