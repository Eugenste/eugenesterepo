package ua.training.watchesFactory;

import java.util.HashMap;
import java.util.Map;

public class Controller {
    private Map<String, WatchFactory> watchFactoryMap = new HashMap<>();
    public void initWatchFactories(){
        watchFactoryMap.putIfAbsent("Rolex", new RolexWatchFactory());
        watchFactoryMap.putIfAbsent("Casio", new CasioWatchFactory());
    }
    public WatchFactory createWatch(String name){
        return watchFactoryMap.get(name);
    }
}
