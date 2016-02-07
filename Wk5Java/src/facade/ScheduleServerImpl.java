package facade;

/**
 * Created by geoff_000 on 07/02/2016.
 */
public class ScheduleServerImpl implements ScheduleServer {

    public void startBooting(){
        System.out.println("Booting...");
    }

    public void readSystemConfigFile(){
        System.out.println("System config file read.");
    }

    public void init(){
        System.out.println("Server initialized.");
    }

    public void initializeContext(){
        System.out.println("Initializing context...");
    }

    public void initializeListeners(){
        System.out.println("Listeners activated.");
    }

    public void createSystemObjects(){
        System.out.println("System objects created.");
    }

    public void releaseProcesses(){
        System.out.println("Processes released.");
    }

    public void destory(){
        System.out.println("Destorying...");
    }

    public void destroySystemObjects(){
        System.out.println("System objects destroyed.");

    }

    public void destoryListeners(){
        System.out.println("Destorying listeners...");
    }

    public void destoryContext(){
        System.out.println("Destorying context...");
    }

    public void shutdown(){
        System.out.println("Shutdown complete.");
    }

}
