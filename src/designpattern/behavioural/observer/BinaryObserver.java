package designpattern.behavioural.observer;

public class BinaryObserver extends Observer {

    BinaryObserver( Subject subject ) {
        this.subject = subject;
        this.subject.attach( this );
    }

    @Override
    public void update() {
        System.out.println( "BinaryObserver " + this.subject.getState() );
    }
}
