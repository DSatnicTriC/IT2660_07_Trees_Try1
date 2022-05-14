// per exercise 30 it must be called this
public class Listing {

	// start of privates and encapsulated fields
	private String name; // key field
	private int idNumber;
	private double gradePointAverage;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getIdNumber() {
		return idNumber;
	}

	public void setIdNumber(int idNumber) {
		this.idNumber = idNumber;
	}

	public double getGradePointAverage() {
		return gradePointAverage;
	}

	public void setGradePointAverage(double gradePointAverage) {
		this.gradePointAverage = gradePointAverage;
	}
	// end of privates and encapsulated fields

	public Listing(String name, int idNumber, double gradePointAverage) {
		this.name = name;
		this.idNumber = idNumber;
		this.gradePointAverage = gradePointAverage;
	}

	public String toString() {
		var toString = "Name: " + this.name + "\nId: " + this.idNumber + "\nGpa: " + this.gradePointAverage;
		return toString;
	}

	public Listing deepCopy() {
		return new Listing(this.name, this.idNumber, this.gradePointAverage);
	}

	public int compareTo(String targetKey) {
		return this.name.compareTo(targetKey);
	}
}