package generic;

public class Box<T> {
	T container;

	// create a constructor
	public Box(T container) {
		this.container = container;
	}
	
	public  void performSometask1() {
		if(container instanceof String ) {
		System.out.println(" Length of "+container+" is "+((String) this.container).length());
		}else if(container  instanceof Integer) {
			System.out.println("This is integer value "+container);
		}
	}

	public Object getvalue() {
		
		return this.container;

	}

	
}
