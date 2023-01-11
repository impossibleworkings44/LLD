package ObserverDesignPattern;

import ObserverDesignPattern.Observable.IphoneObservableImpl;
import ObserverDesignPattern.Observable.StocksObservable;
import ObserverDesignPattern.Observer.EmailAlertObserverImpl;
import ObserverDesignPattern.Observer.MobileAlertObserverImpl;
import ObserverDesignPattern.Observer.NotificationAlertObserver;

public class Store {
    public static void main(String[] args) {
        StocksObservable iphoneStocksObservable = new IphoneObservableImpl();
        NotificationAlertObserver observer1 = new MobileAlertObserverImpl("+91487674398", iphoneStocksObservable);
        NotificationAlertObserver observer2 = new EmailAlertObserverImpl("xyz@gmail.com", iphoneStocksObservable);

        iphoneStocksObservable.add(observer1);
        iphoneStocksObservable.add(observer2);

        iphoneStocksObservable.setStockCount(100);
        iphoneStocksObservable.setStockCount(5);


    }
}
