package inh;

public class JavaProgrammer extends Programmer {
	private String framework;

	public String getFramework() {
		return framework;
	}

	public void setFramework(String framework) {
		this.framework = framework;
	}
	
	@Override
	public String toString() {
		return  this.id + " - " + this.name + " -" + this.framework;
	}
}
