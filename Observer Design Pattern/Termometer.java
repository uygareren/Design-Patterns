import java.math.BigDecimal;

public class Termometer extends Observable{

    private BigDecimal momentaryTemp;
    private BigDecimal maxTemp;
    private BigDecimal minTemp;

    public Termometer(BigDecimal maxTemp, BigDecimal minTemp){
        this.maxTemp = maxTemp;
        this.minTemp = minTemp;
        this.momentaryTemp = BigDecimal.valueOf(24);
    }

    public BigDecimal getMomentaryTemp() {
        return momentaryTemp;
    }

    public void setMomentaryTemp(BigDecimal momentaryTemp) {
        this.momentaryTemp = momentaryTemp;

        System.out.println(momentaryTemp);

        checkTemperature();
    }

    public void checkTemperature(){
        boolean compareToMaxTemp = momentaryTemp.compareTo(maxTemp) >= 0;
        boolean compareToMinTemp = momentaryTemp.compareTo(minTemp) <= 0;

        if(compareToMaxTemp || compareToMinTemp){
            notifyObserver();
        }
    }




}
