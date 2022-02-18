package Controllers;

import java.util.Random;

import Entities.Enemy;
import Entities.Player;

public abstract class CommonActions {
    Random r = new Random();
    int damage;
    int baseDamage;
    int range;

    public void turn(Player player, Enemy enemy) {

    }

    public void attack(Player player, Enemy enemy) {

    }

    public void skill(Player player, Enemy enemy) {

    }

    public int damageCalculation(int attack, int defense) {
        if (isCritOrDodge()) {
            System.out.println("A critical hit!");
            damage = (int) (attack * (r.nextDouble(1.05 - 0.95) + 0.95));
            return damage;
        } else {
            baseDamage = attack / 2 - defense / 4;
            range = baseDamage / 16 + 1;
            if (baseDamage > 0) {
                damage = r.nextInt(((baseDamage + range) - (baseDamage - range)) + 1) + (baseDamage - range);
                return damage;
            } else {
                damage = r.nextInt(2);
                return damage;
            }
        }
    }

    public boolean isCritOrDodge() {
        if (r.nextInt(32) == 0) {
            return true;
        } else {
            return false;
        }
    }
}
