package facade;

/**
 * Created by geoff_000 on 07/02/2016.
 */
public class Facade {

    private ScheduleServer server;

    public Facade(ScheduleServer server){
        this.server = server;
    }


    public void start(){
        server.startBooting();
        server.readSystemConfigFile();
        server.init();
        server.initializeContext();
        server.initializeListeners();
        server.createSystemObjects();
    }

    public void stop(){

        server.releaseProcesses();
        server.destory();
        server.destroySystemObjects();
        server.destoryListeners();
        server.destoryContext();
        server.shutdown();

    }
}
