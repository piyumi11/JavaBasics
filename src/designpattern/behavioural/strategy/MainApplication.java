package designpattern.behavioural.strategy;

public class MainApplication {

    public static void main( String[] arg ) {

        Context context = new Context( new OperationAdd() );
        System.out.println( context.exectureStrategy( 4, 5 ));

        context = new Context( new OperationSubstract() );
        System.out.println( context.exectureStrategy( 4, 5 ));

    }
}
