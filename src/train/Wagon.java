package train;

import java.util.Random;

public class Wagon extends Train{
    public int passengers=0;
    public int passCapacity=40;

    public Wagon(int passCapacity){
        this.passCapacity = passCapacity;
    }
    public Wagon() {

    }
    @Override
    public void getOff() {
        Random rnd = new Random();
        int x = rnd.nextInt(40);
        super.getOff();
        passengers= passengers-x;
        if(passengers<0){
            System.out.println("Train is empty.");
            passengers = 0;
            System.out.println("Passenger:"+passengers);
        }
        else
        {
            System.out.println("Passengers:"+passengers);
        }
    }

    @Override
    public void getOn() {
        Random rnd = new Random();
        int x = rnd.nextInt(40);
        passengers=passengers+x;

        super.getOn();
        if(passengers>passCapacity)
        {
            System.out.println("Limit!");
            passengers = passengers-passCapacity;
            System.out.println("Passengers:"+passengers);
        }
        else
        {
            System.out.println("Passengers:"+passengers);
        }
    }

}
