public class Match {
    Fighter f1;
    Fighter f2;
    int minWeight;
    int maxWeight;

    public Match(Fighter f1,Fighter f2,int maxWeight,int minWeight){
        this.f1=f1;
        this.f2=f2;
        this.maxWeight=maxWeight;
        this.minWeight=minWeight;
    }
    public void run(){
        if (checkWeight()){
            while (this.f1.health>=0 && this.f2.health>=0){
                System.out.println("** Yeni Round **");
                int draw=Math.round((float)Math.random());
                if (draw==0){
                    f2.health=f1.hit(f2);
                    if (isWin())
                        break;
                }
                if (draw==1){
                    f1.health=f2.hit(f1);
                    if (isWin())
                        break;
                }
                printScore();
            }

        }else{
            System.out.println("Sporcuların ağırlıkları uyuşmuyor.");
        }
    }

    void printScore() {
        System.out.println(f1.name+" Kalan can: "+f1.health);
        System.out.println(f2.name+" Kalan can: "+f2.health);

    }

    boolean isWin() {
        if (f1.health==0) {
            System.out.println("Kazanan: " + f2.name);
            return true;
        }
        if (f2.health==0) {
            System.out.println("Kazanan: " + f1.name);
            return true;
        }
        return false;
    }

    boolean checkWeight(){
        return (this.f1.weight>=minWeight && this.f1.weight<=maxWeight)&&(this.f2.weight>=minWeight && this.f2.weight<=maxWeight);
}
}
