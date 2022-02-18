import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

import Controllers.CommonActions;
import Controllers.EnemyActions;
import Controllers.PlayerActions;
import Entities.Dracky;
import Entities.Enemy;
import Entities.Player;
import Entities.Slime;

public class App {
    public static void main(String[] args) throws Exception {
        // Player and enemy declaration
        System.out.println("Enter player name:");
        Scanner scanner = new Scanner(System.in);
        Enemy enemy;
        Player player = new Player(scanner.nextLine());
        System.out.println("Player's name is " + player.getName() + ". A level " + player.getLevel() + " adventurer.");

        // Actions declaration and enemy list
        ArrayList<CommonActions> combatOrder = new ArrayList<CommonActions>();
        EnemyActions enemyActions = new EnemyActions();
        PlayerActions playerActions = new PlayerActions();
        ArrayList<Enemy> enemies = new ArrayList<Enemy>();
        enemies.add(new Slime(player.getLevel()));
        enemies.add(new Dracky(player.getLevel()));
        Random r = new Random();
        int selectedEnemy;

        // Combat loop
        while (player.getHealth() > 0) {
            // Select random enemy
            selectedEnemy = r.nextInt(enemies.size());
            enemies.get(selectedEnemy).resetStats(player.getLevel());
            enemy = enemies.get(selectedEnemy);
            System.out.println("An enemy " + enemy.getName() + " is approaching.");

            // Combat order
            if (player.getAgility() >= enemy.getAgility()) {
                combatOrder.add(playerActions);
                combatOrder.add(enemyActions);
            } else {
                combatOrder.add(enemyActions);
                combatOrder.add(playerActions);
            }

            // Turn loop
            while (player.getHealth() > 0 && enemy.getHealth() > 0) {
                for (int index = 0; index < combatOrder.size(); index++) {
                    if (player.getHealth() > 0 && enemy.getHealth() > 0) {
                        combatOrder.get(index).turn(player, enemy);
                    }
                }
            }

            // Choosing winner
            combatOrder.clear();
            if (player.getHealth() <= 0) {
                System.out.println(player.getName() + " has been defeated.");
            } else {
                player.setScore(player.getScore() + 1);
                player.setXp(player.getXp() + enemy.getXp());
                playerActions.checkLevelUp(player);
                System.out.println("Enemy " + enemy.getName() + " has been defeated.");
            }
        }
        scanner.close();
    }
}
