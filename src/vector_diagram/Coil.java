package vector_diagram;

public class Coil extends Component {
	
	Coil() {
		this.setComplex(true);
	}
	
	void calcValue(double induction, double frequency) {
		this.setValue(2.0 * Math.PI * frequency * induction);
	}
}
