package builder;

/**
 * Created by geoff_000 on 07/02/2016.
 */
public class CarDirector {

    private CarBuilder carBuilder;

    public CarDirector(CarBuilder carBuilder){
        this.carBuilder = carBuilder;
    }

    public void build(){
            carBuilder.buildBody();
            carBuilder.buildBreaks();
            carBuilder.buildEngine();
            carBuilder.buildFuelType();
            carBuilder.buildPower();
            carBuilder.buildSeats();
            carBuilder.buildWindows();


    }
}
