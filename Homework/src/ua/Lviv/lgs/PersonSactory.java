package ua.Lviv.lgs;

public class PersonSactory {
//Inner class
    private static class SportsMan implements Personable{

        @Override
        public void eat() {
            System.out.println("SportsMan is eating");
        }

        @Override
        public void move() {
            System.out.println("SportsMan is moving");
        }

        @Override
        public void sleeep() {
            System.out.println("SportsMan is eating");
        }
    }
    public static SportsMan createdSportsMan(){
        return new SportsMan();
    }

    //Local class
    public Personable createdHouseLifeLocal(){
        class HouseLife implements Personable{

            @Override
            public void eat() {
                System.out.println("HouseLife is eating");

            }

            @Override
            public void move() {
                System.out.println("HouseLife is moving");
            }

            @Override
            public void sleeep() {
                System.out.println("HouseLife is sleeping");
            }
        }
        return new HouseLife();
    }
//Anonimus class
    public Personable createdAnonimus(){
        return new Personable() {
            @Override
            public void eat() {
                System.out.println("Anonimus is eating");

            }

            @Override
            public void move() {
                System.out.println("Anonimus is moving");
            }

            @Override
            public void sleeep() {
                System.out.println("Anonimus is sleeping");
            }

        };
    }

    //Static measted class
    private static class GolfPlayer implements Personable{
        @Override
        public void eat() {
            System.out.println("GolfPlayer is eating");

        }

        @Override
        public void move() {
            System.out.println("GolfPlayer is moving");
        }

        @Override
        public void sleeep() {
            System.out.println("GolfPlayer is sleeping");
        }
    }

    public static GolfPlayer createdGolfPlayer(){
        return new GolfPlayer();
    }

}
