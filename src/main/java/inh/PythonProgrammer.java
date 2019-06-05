package inh;

public class PythonProgrammer extends Programmer {
	
	private String ide;

	public String getIde() {
		return ide;
	}

	public void setIde(String ide) {
		this.ide = ide;
	}

	@Override
	public String toString() {
		return  this.id + " - " + this.name + " -" + this.ide;
	}

	
}
