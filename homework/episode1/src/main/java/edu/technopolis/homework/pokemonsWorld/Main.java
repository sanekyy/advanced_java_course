package edu.technopolis.homework.pokemonsWorld;

/**
 * Created by ihb on 15.01.17.
 */
public class Main {
    public static void main(String[] args) {

        int wins = 0;

        for(int i=0; i<100; i++) {
            Pokemon pokemon1 = new Pokemon("Picachu", 500, 20, 350, 3);
            Pokemon pokemon2 = new Pokemon("Low", 200, 40, 30, 4);
            if(new Arena(pokemon1, pokemon2).fight() == 1){
                wins++;
            }
        }

        System.out.println(wins);
    }
}
