package vector_diagram;

public class Capacitor extends Component {
	Capacitor() {
		this.setComplex(true);
	}

	void calcValue(double capacity, double frequency) {
		this.setValue(-1.0 * (1.0 / (2.0 * Math.PI * frequency * capacity)));
	}
}
