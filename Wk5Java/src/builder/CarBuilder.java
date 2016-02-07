package builder;

/**
 * Created by geoff_000 on 07/02/2016.
 */
public interface CarBuilder {

    Car getCar();

    void buildBody();
    void buildPower();
    void buildEngine();
    void buildBreaks();
    void buildSeats();
    void buildWindows();
    void buildFuelType();
}
