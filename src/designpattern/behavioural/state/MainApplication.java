package designpattern.behavioural.state;

public class MainApplication {

    public static void main( String[] arg ) {

        Context context = new Context();
        StartState startState = new StartState();
        startState.doAction( context );
        System.out.println( context.getState().toString() );

        StopState stopState = new StopState();
        stopState.doAction( context );
        System.out.println( context.getState().toString() );

    }
}
