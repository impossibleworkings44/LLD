package ObserverDesignPattern.Observer;

import ObserverDesignPattern.Observable.StocksObservable;

public class MobileAlertObserverImpl implements  NotificationAlertObserver{
    String phone;
    StocksObservable observable;

    public MobileAlertObserverImpl(String phone, StocksObservable observable) {
        this.phone = phone;
        this.observable = observable;
    }
    @Override
    public void update() {
        sendMsg(phone, "Hurry up !! Limited Stocks available");
    }

    public void sendMsg(String phone, String msg) {
        System.out.println("msg sent to : "+ phone + " :: body : [ " + msg + " ] ");
    }
}
