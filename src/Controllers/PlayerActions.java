package Controllers;

import java.util.Random;
import java.util.Scanner;

import Entities.Enemy;
import Entities.Player;

public class PlayerActions extends CommonActions {
    Random r = new Random();
    static Scanner scanner = new Scanner(System.in);

    public void turn(Player player, Enemy enemy) {
        System.out.println("What should " + player.getName() + " do?");
        switch (scanner.nextLine()) {
            case "attack":
                attack(player, enemy);
                break;
            case "defend":
                defend(player, enemy);
                break;
            case "item":
                item();
                break;
            case "skill":
                skill();
                break;
        }
    }

    public void attack(Player player, Enemy enemy) {
        player.setIsDefending(false);
        System.out.println("Enemy " + enemy.getName() + "'s health: " + enemy.getHealth());
        System.out.println("Attacking...");
        if (isCritOrDodge()) {
            System.out.println(enemy.getName() + " dodged the attack!");
        } else {
            enemy.setHealth(enemy.getHealth() - damageCalculation(player.getAttack(), enemy.getDefense()));
            System.out.println("Damage dealt: " + damage);
        }
        if (enemy.getHealth() < 0) {
            enemy.setHealth(0);
        }
        System.out.println("Enemy " + enemy.getName() + "'s health: " + enemy.getHealth());
    }

    public void defend(Player player, Enemy enemy) {
        if (!player.getIsDefending()) {
            player.setIsDefending(true);
        }
        System.out.println("Defending...");
    }

    public void item() {

    }

    public void skill() {

    }

    public void xpToLevelUp(Player player) {
        player.setXpToLevelUp((int) Math.round(4 * Math.pow(player.getLevel(), 2) / 5));
        System.out.println("TEEEEEEST " + player.getXpToLevelUp());
    }

    public int randomStatIncrease() {
        return r.nextInt(5 - 2 + 1) + 2;
    }

    public void checkLevelUp(Player player) {
        xpToLevelUp(player);
        if (player.getXp() >= player.getXpToLevelUp() && player.getLevel() < player.getMax_level()) {
            player.setXp(0);
            player.setLevel(player.getLevel() + 1);
            player.setAttack(player.getAttack() + randomStatIncrease());
            player.setAgility(player.getAgility() + randomStatIncrease());
            player.setDefense(player.getDefense() + randomStatIncrease());
            player.setWisdom(player.getWisdom() + randomStatIncrease());
            player.setMax_health(player.getMax_health() + 8);
            player.setHealth(player.getMax_health());
            player.setMax_mana(player.getMax_mana() + 5);
            player.setMana(player.getMax_mana());
            System.out.println("LEVEL UP! " + player.getName() + " is now level " + player.getLevel() + ".");
        }
    }
}
