package vector_diagram;

public class Coil extends Component {
	private double induction;

	public Coil() {
		this.setComplex(true);
	}

	public double getInduction() {
		return induction;
	}

	public void setInduction(double induction) {
		this.induction = induction;
		double value = 2.0 * Math.PI * induction;
		this.setValue(value);
	}
}
