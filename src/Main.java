public class Main {
    public static void main(String[] args) {
        IPlayer son = new FootballPlayer(78, 184, 33, "Son Heung-min", "striker");
        IPlayer messi = new AdapterSoccerToFootball(new SoccerPlayer( 148, 5.7f, 32.5f, "Lionel", "Messi", "forward"));
        System.out.println(son.display());
        System.out.println();
        System.out.println(messi.display());


        IPlayer beckham = new AdapterSoccerToFootball(new SoccerPlayer());
        beckham.setHeight(183);
        beckham.setPosition("midfielder");
        beckham.setFullName("David Beckham");
        beckham.setWeight(75);
        beckham.setSpeedKMh(24.7f);
        System.out.println();
        System.out.println(beckham.display());
    }
}