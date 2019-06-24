package designpattern.behavioural.strategy;

public class Context {

    Strategy strategy;

    public Context( Strategy strategy ) {
        this.strategy = strategy;
    }

    public int exectureStrategy( int num1, int num2 ) {
        return strategy.doOperation( num1, num2 );
    }
}
