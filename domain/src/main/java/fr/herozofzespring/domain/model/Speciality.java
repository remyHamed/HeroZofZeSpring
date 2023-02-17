package fr.herozofzespring.domain.model;

public enum Speciality {
    TANK(1000,100,20,"MAGE",20),ASSASSIN(800,200,5,"TANK",30),MAGE(700,150,10,"ASSASSIN",25);//NAN
    private final int hp;
    private final int power;
    private final int armor;
    private final String advantage;
    private final int buffer;

    Speciality(int hp, int power, int armor, String advantage, int buffer) {
        this.hp = hp;
        this.power = power;
        this.armor = armor;
        this.advantage = advantage;
        this.buffer = buffer;
    }

    public int getHp() {
        return hp;
    }

    public int getPower() {
        return power;
    }

    public int getArmor() {
        return armor;
    }

    public String getAdvantage() {
        return advantage;
    }

    public int getBuffer() {
        return buffer;
    }




}
