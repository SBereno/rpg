package Entities;

public class Player {
    private String name;
    private int level;
    final int max_level = 99;
    private int xp;
    private int xpToLevelUp;
    private int attack;
    private int agility;
    private int defense;
    private int wisdom;
    private int health;
    private int max_health = 22; // 8 per level
    private int mana;
    private int max_mana = 0; // 5 per level
    private int score;
    private boolean isDefending;

    public Player(String name) {
        this.name = name;
        this.level = 1;
        this.xp = 0;
        this.attack = 16;
        this.agility = 6;
        this.defense = 11;
        this.wisdom = 5;
        this.health = max_health;
        this.mana = max_mana;
        this.score = 0;
        this.isDefending = false;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLevel() {
        return this.level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public int getXp() {
        return this.xp;
    }

    public void setXp(int xp) {
        this.xp = xp;
    }

    public int getAttack() {
        return this.attack;
    }

    public void setAttack(int attack) {
        this.attack = attack;
    }

    public int getDefense() {
        return this.defense;
    }

    public void setDefense(int defense) {
        this.defense = defense;
    }

    public int getHealth() {
        return this.health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getMana() {
        return this.mana;
    }

    public void setMana(int mana) {
        this.mana = mana;
    }

    public int getScore() {
        return this.score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public boolean getIsDefending() {
        return this.isDefending;
    }

    public void setIsDefending(boolean isDefending) {
        this.isDefending = isDefending;
    }

    public int getMax_level() {
        return this.max_level;
    }

    public int getAgility() {
        return this.agility;
    }

    public void setAgility(int agility) {
        this.agility = agility;
    }

    public int getWisdom() {
        return this.wisdom;
    }

    public void setWisdom(int wisdom) {
        this.wisdom = wisdom;
    }

    public int getMax_health() {
        return this.max_health;
    }

    public void setMax_health(int max_health) {
        this.max_health = max_health;
    }

    public int getMax_mana() {
        return this.max_mana;
    }

    public void setMax_mana(int max_mana) {
        this.max_mana = max_mana;
    }

    public int getXpToLevelUp() {
        return this.xpToLevelUp;
    }

    public void setXpToLevelUp(int xpToLevelUp) {
        this.xpToLevelUp = xpToLevelUp;
    }

    public boolean isIsDefending() {
        return this.isDefending;
    }

}
