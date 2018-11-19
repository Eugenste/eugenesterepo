package ua.training.watchesFactory;

public class CasioWatchFactory implements WatchFactory {
    @Override
    public Watch getWatch() {
        return new Casio();
    }
}
