package designpattern.behavioural.state;

public class Context {

    private State state;

    public Context() {
        this.state = null;
    }

    public void setState( State state ) {
        this.state = state;
    }

    public State getState() {
        return this.state;
    }
}
