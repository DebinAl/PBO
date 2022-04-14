
public class Main {
    public static void main(String[] args){

        Entity entity = new Entity(100,20);
        entity.thisEntity();
        entity.showStats();

        System.out.println(" ");

        Enemy enemy = new Enemy(80, 15, "Zombie");
        enemy.thisEnemy();
        enemy.enemyStats();

        System.out.println(" ");

        Elite elite = new Elite(120, 15, "Ogre", "Double Damage");
        elite.thisElite();
        elite.eliteStats();

        System.out.println(" ");

        elite.enemyStats();
    }
}
