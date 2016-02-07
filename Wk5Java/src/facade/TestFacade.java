package facade;

/**
 * Created by geoff_000 on 07/02/2016.
 */
public class TestFacade {
    public static void main(String[] args){

        Facade facade = new Facade(new ScheduleServerImpl());
        facade.start();
        facade.stop();

    }
}
