package ua.Lviv.lgs;

public class PersonAbleAplication {
    public static void main(String[] args) {
        PersonSactory ps = new PersonSactory();
        Personable sportsMan = ps.createdSportsMan();
        sportsMan.eat();
        sportsMan.move();
        sportsMan.sleeep();

        System.out.println();

        Personable houseLife = ps.createdHouseLifeLocal();
        houseLife.eat();
        houseLife.move();
        houseLife.sleeep();

        System.out.println();

        Personable anonimus = ps.createdAnonimus();
        anonimus.eat();
        anonimus.move();
        anonimus.sleeep();

        System.out.println();

        Personable staticClass = PersonSactory.createdGolfPlayer();
        staticClass.eat();
        staticClass.move();
        staticClass.sleeep();

    }
}
