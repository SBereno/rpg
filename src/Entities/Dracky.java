package Entities;

public class Dracky extends Enemy {

    public Dracky(int playerLevel) {
        resetStats(playerLevel);
    }

    public void resetStats(int playerLevel) {
        this.name = "Dracky";
        this.level = playerLevel + 1;
        this.attack = 12;
        this.defense = 9;
        this.agility = 8;
        this.health = 10;
        this.xp = 2;
    }
}
