package train;

public class Driver {
    public static void main(String[] args){
        Train t = new Train();
        Wagon w = new Wagon();

        for(int i=1;i<=15;i++){
            System.out.println("------------Station "+i+"----------------");
            w.getOn();
            w.getOff();
        }
    }
}
