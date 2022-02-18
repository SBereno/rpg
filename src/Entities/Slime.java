package Entities;

public class Slime extends Enemy {

    public Slime(int playerLevel) {
        resetStats(playerLevel);
    }

    public void resetStats(int playerLevel) {
        this.name = "Slime";
        this.level = playerLevel;
        this.attack = 10;
        this.defense = 8;
        this.agility = 6;
        this.health = 7;
        this.xp = 1;
    }
}
