package edu.technopolis.homework.pokemonsWorld;

import edu.technopolis.homework.MyIO;

import java.io.PrintStream;
import java.util.Random;

/**
 * Created by ihb on 15.01.17.
 */
public class Arena {
    PrintStream out = MyIO.getOut();

    private Random rand = new Random(System.currentTimeMillis());
    int tern;

    Pokemon p1, p2;

    public Arena(Pokemon p1, Pokemon p2) {
        this.p1 = p1;
        this.p2 = p2;
    }

    int fight(){

        tern = whoFirst();

        while(p1.getHp()>0&&p2.getHp()>0){
            switch (tern%2){
                case 0:
                    p1.attack(p2);
                    break;
                case 1:
                    p2.attack(p1);
                    break;
            }

            try {
                Thread.sleep(3);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            tern++;
        }

        if(p1.getHp()>0){
            out.println(p1.getName() + " win!");
            return 1;
        } else {
            out.println(p2.getName() + " win!");
            return 2;
        }
    }

    private int whoFirst(){
        return rand.nextInt()%2;
    }
}
