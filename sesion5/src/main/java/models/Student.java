package models;

/**
 * @author jadg13
 * @version 1.0
 * @created 03-sep.-2024 05:52:50
 */
public class Student {

	private String cif;
	private String firstName;
	private String lastName;
	private String career;
	private boolean isScholarShip;
	private float average;

	public Student(){

	}

	public Student(String cif, String firstName, String lastName, String career, boolean isScholarShip, float average) {
		this.cif = cif;
		this.firstName = firstName;
		this.lastName = lastName;
		this.career = career;
		this.isScholarShip = isScholarShip;
		this.average = average;
	}

	public String getCif() {
		return cif;
	}

	public void setCif(String cif) {
		this.cif = cif;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getCareer() {
		return career;
	}

	public void setCareer(String career) {
		this.career = career;
	}

	public boolean isScholarShip() {
		return isScholarShip;
	}

	public void setScholarShip(boolean scholarShip) {
		isScholarShip = scholarShip;
	}

	public float getAverage() {
		return average;
	}

	public void setAverage(float average) {
		this.average = average;
	}

	@Override
	public String toString() {
		final StringBuffer sb = new StringBuffer("Student{");
		sb.append("cif='").append(cif).append('\'');
		sb.append(", firstName='").append(firstName).append('\'');
		sb.append(", lastName='").append(lastName).append('\'');
		sb.append(", career='").append(career).append('\'');
		sb.append(", isScholarShip=").append(isScholarShip);
		sb.append(", average=").append(average);
		sb.append('}');
		return sb.toString();
	}
}//end Student