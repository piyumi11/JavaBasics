package designpattern.behavioural.observer;

public class MainApplication {

    public static void main( String []arg ) {
        Subject subject = new Subject();
        new BinaryObserver( subject );
        new OctalObserver( subject );
        subject.setState( 34 );
    }
}
