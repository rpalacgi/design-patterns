package ua.cn.dmitrykrivenko.mediator;

/**
 *
 * @author Dmitry Krivenko <dmitrykrivenko@gmail.com>
 */
public abstract class Colleague {

    private Mediator mediator;

    public Colleague(Mediator mediator) {
        this.mediator = mediator;
    }

    //send a message via the mediator
    public void send(String message) {
        mediator.send(message, this);
    }

    //get access to the mediator
    public Mediator getMediator() {
        return mediator;
    }

    public abstract void receive(String message);
}