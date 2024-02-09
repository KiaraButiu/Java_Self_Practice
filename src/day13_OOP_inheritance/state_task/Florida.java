package day13_OOP_inheritance.state_task;

public class Florida extends State{
    public Florida(String name, String abbreviation, String politicalParty, String governor, String senator, int population) {
        super(name, abbreviation, politicalParty, governor, senator, population);
    }

    public void partySpot(){
        System.out.println( getName() + " has a lot of party spot");
    }
}
