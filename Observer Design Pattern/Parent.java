public class Parent implements Observer{

    private String name;

    public Parent(String name){
        this.name = name;
    }

    @Override
    public void update(Observable observable) {

        Termometer termometer = (Termometer) observable;

        System.out.println(name + "said: oh! this" + termometer.getMomentaryTemp() + "degre is dangerous for child!");


    }
}
