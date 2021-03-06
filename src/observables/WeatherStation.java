package observables;

import observers.IObservers;

public class WeatherStation extends IObservable{
    @Override
    public void addObserver(IObservers iObservers) {
        this.allmyObservers.add(iObservers);
    }

    @Override
    public void removeOberver(IObservers iObservers) {
        this.allmyObservers.remove(iObservers);
    }

    @Override
    public void notifyObserver() {
        for(IObservers d:this.getAllmyObservers()){
            d.update();
        }
    }

    public int getLastData(){
        return this.last_data;
    }

    public void setLastData(int value){
        this.setLast_data(value);
        notifyObserver();
    }
}
