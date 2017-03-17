package vector_diagram;

public class Resistor extends Component {
	
	Resistor() {
		this.setComplex(false);
	}

	void calcValue(double value) {
		this.setValue(value);
	}
}
