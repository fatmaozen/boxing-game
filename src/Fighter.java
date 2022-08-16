public class Fighter {
    String name;
    int weight;
    int health;
    int damage;
    int dodge;

    public Fighter(String name,int weight, int health,int damage,int dodge){
        this.name=name;
        this.damage=damage;
        this.weight=weight;
        this.health=health;
        this.dodge=dodge;
    }
    int hit(Fighter foe){
        System.out.println("------------------");
        System.out.println(this.name+" => "+foe.name+"'a "+this.damage+" hasar vurdu");
        if (foe.dodge()){
            System.out.println(foe.name+" gelen hasarı savundu.");
            return foe.health;
        }else {
            System.out.println(foe.name+" gelen hasarı savunamadı.");
        }
        if((foe.health-this.damage)<0)
            return 0;

        return (foe.health-this.damage);
    }

    private boolean dodge() {
        double randomValue=Math.random()*100;
        return randomValue<=this.dodge;
    }
}
