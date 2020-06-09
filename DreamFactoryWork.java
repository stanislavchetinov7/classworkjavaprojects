package company;


public class DreamFactoryWork {

public static void main(String[] args) {	


    
	
	      
}

public class Machine{
	
int power;
int height;
String color;
	
}


public abstract class HeatManager {
    protected int power;
    protected double maxTemperature;

    public HeatManager(int power, double maxTemperature) {
        this.power = power;
        this.maxTemperature = maxTemperature;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public double getMaxTemperature() {
        return maxTemperature;
    }

    public void setMaxTemperature(double maxTemperature) {
        this.maxTemperature = maxTemperature;
    }
}


public class WrapperEngine extends HeatManager {


    public WrapperEngine(int power, double maxTemperature) {
        super(power, maxTemperature);
    }
}


public class Engine extends Machine{


    public Engine(int power, double height, String color) {
        
    }

}



}




























	
		







	

	






	
	
	
	
	
	
