public class Elite extends Enemy {
    String special;

    Elite(int hp, int damage, String type, String special){
        super(hp, damage, type);
        this.special = special;
    }

    public void thisElite(){
        System.out.println("ini adalah Sub Class dari \"Super Class Enemy\" bernama Elite");
    }

    public void eliteStats(){
        super.enemyStats();
        System.out.println("Special: " + this.special);
    }
}
