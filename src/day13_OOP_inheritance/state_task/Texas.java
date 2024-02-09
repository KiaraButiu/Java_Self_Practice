package day13_OOP_inheritance.state_task;

public class Texas extends State{

    public String musicGenre;
    public Texas(String name, String abbreviation, String politicalParty, String governor,
                 String senator, int population, String musicGenre) {
        super(name, abbreviation, politicalParty, governor, senator, population);
        this.musicGenre = musicGenre;
    }

    @Override
    public String toString() {
        return super.toString() +
                " musicGenre='" + musicGenre + '\'' +
                '}';
    }
}
