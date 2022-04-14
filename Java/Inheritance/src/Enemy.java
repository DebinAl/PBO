public class Enemy extends Entity {
    String type;

    Enemy(int hp, int damage, String type) {
        super(hp, damage);
        this.type = type;
    }

    public void thisEnemy(){
        System.out.println("ini adalah Sub Class dari \"Super Class Entity\" bernama Enemy");
    }

    public void enemyStats(){
        super.showStats();
        System.out.println("Type: " + this.type);
    }
}
