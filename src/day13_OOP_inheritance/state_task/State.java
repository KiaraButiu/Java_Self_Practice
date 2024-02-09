package day13_OOP_inheritance.state_task;

public class State {
    private String name, abbreviation;
    private String politicalParty;
    private String Governor, senator;
    private long population;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name == null || name.isBlank() || name.isEmpty()){
            System.err.println("Invalid input");
            System.exit(1);
        }
        this.name = name;
    }

    public String getAbbreviation() {
        return abbreviation;
    }

    public void setAbbreviation(String abbreviation) {
        if (abbreviation == null || abbreviation.isBlank() || abbreviation.isEmpty()){
            System.err.println("Invalid input");
            System.exit(1);
        }
        this.abbreviation = abbreviation;
    }

    public String getPoliticalParty() {
        return politicalParty;
    }

    public void setPoliticalParty(String politicalParty) {
        if (politicalParty == null || politicalParty.isBlank() || politicalParty.isEmpty()){
            System.err.println("Invalid input");
            System.exit(1);
        }
        this.politicalParty = politicalParty;
    }

    public String getGovernor() {
        return Governor;
    }

    public void setGovernor(String governor) {
        if (governor == null || governor.isBlank() || governor.isEmpty()){
            System.err.println("Invalid input");
            System.exit(1);
        }
        Governor = governor;
    }

    public String getSenator() {
        return senator;
    }

    public void setSenator(String senator) {
        if (senator == null || senator.isBlank() || senator.isEmpty()){
            System.err.println("Invalid input");
            System.exit(1);
        }
        this.senator = senator;
    }

    public long getPopulation() {
        return population;
    }

    public void setPopulation(long population) {
        if (population <= 0){
            System.err.println("Population must be greater than zero");
            System.exit(1);
        }
        this.population = population;
    }

    public State(String name, String abbreviation, String politicalParty, String governor, String senator, int population) {
       setName(name);
       setAbbreviation(abbreviation);
       setPoliticalParty(politicalParty);
       setGovernor(governor);
       setSenator(senator);
       setPopulation(population);
    }

    @Override
    public String toString() {
        return  getClass().getSimpleName() + "{" +
                "name='" + name + '\'' +
                ", abbreviation='" + abbreviation + '\'' +
                ", politicalParty='" + politicalParty + '\'' +
                ", Governor='" + Governor + '\'' +
                ", senator='" + senator + '\'' +
                ", population=" + population +
                '}';
    }
}
/* State Task Requirements:
1. Create a class named 'State' with the following specifications:
   Attributes:
       - name: String
       - abbreviation: String
       - politicalParty: String
       - Governor: String
       - senator: String
       - population: int

   Encapsulation Requirements:
       - Ensure attributes are private with getters and setters.
       - Conditions for Encapsulation:
           - 'name', 'abbreviation', 'politicalParty', 'Governor', and 'senator' must not be null, empty, or blank.
           - 'population' must be greater than zero.

   Constructor:
       - Add a constructor to initialize all fields.

   Methods:
       - toString(): Prints the information of the State object.

2. Create the following subclasses of the State class:
      - Virginia
      - California
      - Texas
      - Florida
   - Add any additional fields and methods as necessary.

3. Create a class named 'StateClients':
   - Create multiple objects representing different states.
   - Test the methods and variables of each object.*/