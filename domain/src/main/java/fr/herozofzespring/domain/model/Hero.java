package fr.herozofzespring.domain.model;

public class Hero {
    String name;
    int hp;
    int xp;
    int power;
    int armor;
    Speciality speciality;
    Rarity rarity;
    int level;
    public Hero(String name, Speciality speciality, Rarity rarity) {
        this.name = name;
        this.speciality = speciality;
        this.rarity = rarity;
    }
}
