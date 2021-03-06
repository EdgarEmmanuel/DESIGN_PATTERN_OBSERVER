import observables.WeatherStation;
import observers.Phone;

import java.util.Random;

public class Client {
    private static int n =10;
    /**
     * create an array with differente temperature
     * @param val
     * @return
     */
    public static int[] variousTemparature(int val){
        int[] temperatures = new int[n];
        for(int i=0;i<n;i++){
            temperatures[i]=new Random().nextInt(val);
        }
        return temperatures;
    }

    public static void main(String[] args) throws InterruptedException {
        //instantiate the weather station
        WeatherStation weatherStation = new WeatherStation();

        //instantoiate an observer
        Phone phoneA = new Phone(weatherStation);

        // the variuous temperature for the next 10 days
        int[] futureTemperature = variousTemparature(67);

        //register an observer to the observable
        weatherStation.addObserver(phoneA);

        //assign the different temperatures to the weather station after 6 milliseconds
        for (int j=0;j<n;j++){
            weatherStation.setLastData(futureTemperature[j]);
            Thread.sleep(1000);
        }
    }
}
