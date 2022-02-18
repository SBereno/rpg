package Controllers;

import java.util.Random;

import Entities.Enemy;
import Entities.Player;

public class EnemyActions extends CommonActions {
    Random r = new Random();
    int low = 1;
    int high = 100;

    public void turn(Player player, Enemy enemy) {
        attack(player, enemy);
    }

    public void attack(Player player, Enemy enemy) {
        System.out.println(player.getName() + "'s health: " + player.getHealth());
        System.out.println("Enemy " + enemy.getName() + " is attacking...");
        if (isCritOrDodge()) {
            System.out.println(player.getName() + " dodged the attack!");
        } else {
            if (player.getIsDefending()) {
                player.setHealth(player.getHealth() - damageCalculation(enemy.getAttack(), player.getDefense()) / 2);
                System.out.println("Damage dealt: " + damage / 2);
            } else {
                player.setHealth(player.getHealth() - damageCalculation(enemy.getAttack(), player.getDefense()));
                System.out.println("Damage dealt: " + damage);
            }
        }
        if (player.getHealth() < 0) {
            player.setHealth(0);
        }
        System.out.println(player.getName() + "'s health: " + player.getHealth());
    }

    public void skill() {

    }
}
