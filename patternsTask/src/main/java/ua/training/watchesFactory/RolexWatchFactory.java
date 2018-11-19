package ua.training.watchesFactory;

public class RolexWatchFactory implements WatchFactory {
    @Override
    public Watch getWatch() {
        return new Rolex();
    }
}
