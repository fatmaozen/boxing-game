public class Main {
    public static void main(String[] args) {
        Fighter thomas=new Fighter("Thomas",85,100,85,80);
        Fighter michael=new Fighter("Michael",90,100,75,70);
        Match shelby=new Match(thomas,michael,120,70);
        shelby.run();

    }
}
