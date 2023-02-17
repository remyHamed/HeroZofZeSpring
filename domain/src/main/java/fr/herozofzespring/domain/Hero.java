package fr.herozofzespring.domain;

public class Hero {
    String name;
    int hp;
    int xp;
    int power;
    int armor;
    Object speciality;
    Object rarity;
    int level;
    public Hero(String name, Object speciality, Object rarity) {
        this.name = name;
        this.speciality = speciality;
        this.rarity = rarity;
    }
}
