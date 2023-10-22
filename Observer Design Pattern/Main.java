import java.math.BigDecimal;

public class Main {

    public static void main(String[] args) {
        BigDecimal maxTemp = BigDecimal.valueOf(23);
        BigDecimal minTemp = BigDecimal.valueOf(28);

        Termometer termometer = new Termometer(maxTemp, minTemp);


        Parent mom = new Parent("Mom");
        Parent dad = new Parent("Dad");

        termometer.add(mom);

        for(int i = termometer.getMomentaryTemp().intValue(); i<= 30; i++){
            termometer.setMomentaryTemp(BigDecimal.valueOf(i));
        }
    }

}
