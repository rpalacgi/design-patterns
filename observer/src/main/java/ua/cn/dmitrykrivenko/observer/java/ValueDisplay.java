package ua.cn.dmitrykrivenko.observer.java;

import java.util.Observable;
import java.util.Observer;
import ua.cn.dmitrykrivenko.observer.own.Display;

/**
 *
 * @author Dmitry Krivenko <dmitrykrivenko@gmail.com>
 */
public class ValueDisplay implements Observer, Display {

    Observable observable;
    private int value;

    public ValueDisplay(Observable o) {
        observable = o;
        observable.addObserver(this);
    }

    public void update(Observable o, Object arg) {
        if (o instanceof SomeData) {
            SomeData someData = (SomeData) o;
            value = someData.getValue();
            display();
        }
    }

    public void display() {
        System.out.println("Value: " + value);
    }

    public int getValue() {
        return value;
    }
}
