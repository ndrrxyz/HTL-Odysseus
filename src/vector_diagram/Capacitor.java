package vector_diagram;

public class Capacitor extends Component{
	private double capacity;
	
	public Capacitor() {
		this.setComplex(true);
	}

	public double getCapacity() {
		return capacity;
	}

	public void setCapacity(double capacity) {
		this.capacity = capacity;
		double value = -1.0 * (1.0 / (2.0 * Math.PI * capacity));
		this.setValue(value);
	}
}
