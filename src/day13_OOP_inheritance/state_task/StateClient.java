package day13_OOP_inheritance.state_task;

public class StateClient {
    public static void main(String[] args) {

        Virginia virginia = new Virginia("Virginia", "VA","Democrat",
                "Glenn Youngkin", "Mark Warner", 8_642_000, "Washington Commanders");
        System.out.println(virginia);


        California california = new California("California", "CA", "Democrat",
                "Gavin Newsom", "Alex Padilla", 39_024_000);
        System.out.println(california);


        Texas texas = new Texas("Texas", "TX", "Republican", "Greg Abbott",
                "Ted Cruz", 29_053_000, "country music");
        System.out.println(texas);

        Florida florida = new Florida("Florida", "FL", "Republican", "Ron DeSantis",
                "Rick Scott", 21_078_000);
        System.out.println(florida);
        florida.partySpot();


    }
}
