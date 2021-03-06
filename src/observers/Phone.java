package observers;

import observables.IObservable;

public class Phone implements IObservers{
    private IObservable iObservable;
    public Phone(IObservable iObservable){
        this.iObservable=iObservable;
    }
    @Override
    public void update() {
        System.out.println("The observer "+iObservable.getClass().getName()+" has notified me");
        display();
    }

    @Override
    public void display() {
        System.out.println("The latest temperature is "+this.iObservable.getLast_data()+" degree");
    }
}
