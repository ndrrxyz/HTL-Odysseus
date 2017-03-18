package vector_diagram;

import java.util.*;

public class Circuit {
	private ArrayList<Component> component = new ArrayList<Component>();
	
	public Circuit() {
		
	}
	
	public void addComponent(Component component) {
		this.component.add(component);
	}
}
