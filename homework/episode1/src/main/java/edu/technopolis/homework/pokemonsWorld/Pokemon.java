package edu.technopolis.homework.pokemonsWorld;

import edu.technopolis.homework.MyIO;

/**
 * Created by ihb on 15.01.17.
 */
public class Pokemon {

    private String name;

    private int hp;

    private int height;
    private int weight;
    private int agility;

    private int baseDamage;
    private double damage;


    Pokemon(String name, int hp, int height, int weight, int baseDamage) {
        this.name = name;
        this.hp = hp;
        this.height = height;
        this.weight = weight;
        this.agility =(int) (100 * 1./((weight)%50+5));
        this.baseDamage = baseDamage;

        calculateDamage();
    }

    private void calculateDamage() {
        damage = name.length() + 1000./hp + height/20. + 10./weight + baseDamage;
    }

    String getName(){
        return name;
    }

    int getHp() {
        return hp;
    }

    void attack(Pokemon defendPokemon) {
        if(System.currentTimeMillis()%100>agility){
            defendPokemon.receiveDamage(this.damage);
        } else {
            MyIO.getOut().println(this.name + " missed");
        }
    }

    private void receiveDamage(double receiveDamage) {
        hp-=receiveDamage;
        calculateDamage();
    }
}
