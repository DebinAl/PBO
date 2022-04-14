public class Entity {
    int hp;
    int damage;

    Entity(int hp, int damage){
        this.hp = hp;
        this.damage = damage;
    }

    public void thisEntity(){
        System.out.println("Ini adalah Super Class bernama Entity");
    }

    public void showStats(){
        System.out.println("HP: " + this.hp + "\nDamage: "+ this.damage);
    }
}
