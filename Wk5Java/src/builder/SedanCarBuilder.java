package builder;

/**
 * Created by geoff_000 on 07/02/2016.
 */
public class SedanCarBuilder implements CarBuilder {

    private Car carInProgress;

    public SedanCarBuilder(){
        carInProgress = new Car("SEDAN");

    }


    public void setCarType(){
        carInProgress.setCarType("SEDAN");
    }


    public void buildBody(){
        carInProgress.setBodyStyle("External dimensions: overall length (inches): 202.9,\n" +
                "overall width (inches): 76.2, overall height (inches): 60.7,\n" +
                "wheelbase (inches): 112.9, front track (inches): 65.3,\n" +
                "rear track (inches): 65.5 and curb to curb turning circle (feet): 39.5");
    }


    public void buildPower(){
        carInProgress.setPower(" 285 hp @ 6,500 rpm; 253 ft lb of torque @ 4,000 rpm");
    }

    public void buildEngine(){
        carInProgress.setEngine("3.5L Duramax V 6 DOHC\n");
    }

    public void buildBreaks(){
        carInProgress.setBreaks(" Four-wheel disc brakes: two ventilated. Electronic brake distribution\n");
    }

    public void buildSeats(){
        carInProgress.setSeats("Front seat centre armrest.Rear seat centre armrest.Split-folding rear seats");
    }

    public void buildWindows(){
        carInProgress.setWindows("Laminated side windows.Fixed rear window with defroster");

    }

    public void buildFuelType(){
        carInProgress.setFuelType("Diesel 19 MPG city, 29 MPG highway, 23 MPG combined and 437 mi. range");
    }




    public Car getCar(){
        return carInProgress;
    }


}
