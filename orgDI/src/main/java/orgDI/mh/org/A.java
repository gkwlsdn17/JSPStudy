package orgDI.mh.org;

public class A {

	private String name;

	public A() {}
	public A(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "A [name=" + name + "]";
	}
	
	
}
