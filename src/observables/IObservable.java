package observables;

import observers.IObservers;

import java.util.ArrayList;
import java.util.List;

public abstract class IObservable {
    protected int last_data = 18;
    protected List<IObservers> allmyObservers = new ArrayList<>();

    public abstract void addObserver(IObservers iObservers);
    public abstract void removeOberver(IObservers iObservers);
    public abstract void notifyObserver();

    public int getLast_data() {
        return last_data;
    }

    public void setLast_data(int last_data) {
        this.last_data = last_data;
    }

    public List<IObservers> getAllmyObservers() {
        return allmyObservers;
    }

    public void setAllmyObservers(List<IObservers> allmyObservers) {
        this.allmyObservers = allmyObservers;
    }
}
