import java.util.*;

abstract class Room{
    protected int numberOfBeds;
    protected int squareFeet;
    protected double pricePerNight;

    public Room(int numberOfBeds, int squareFeet, double pricePerNight){
        this.numberOfBeds=numberOfBeds;
        this.squareFeet=squareFeet;
        this.pricePerNight=pricePerNight;
    }

    public void displayRoomDetails(){
        System.out.println("Number of beds: "+numberOfBeds+"\nSquare Feet: "+squareFeet+"\nPrice Per Night: "+pricePerNight);
    }
}

class SingleRoom extends Room{

    public SingleRoom(){super(1,250,1500.0);}
}

class DoubleRoom extends Room{

    public DoubleRoom(){super(3,400,2500.0);}
}

class SuiteRoom extends Room{

    public SuiteRoom(){super(3,750,5000.0);}
}

public class UseCase2HotelBookingApp {
    public static void main(String[] args){
        System.out.println("Welcome to the Hotel Booking Management System\nSystem initialized successfully.");
        SingleRoom s1 = new SingleRoom();
        DoubleRoom d1 = new DoubleRoom();
        SuiteRoom ss1 = new SuiteRoom();
        System.out.println("Single Room:\n");
        s1.displayRoomDetails();
        System.out.println("Double Room:\n");
        d1.displayRoomDetails();
        System.out.println("Suite Room:\n");
        ss1.displayRoomDetails();

    }
}