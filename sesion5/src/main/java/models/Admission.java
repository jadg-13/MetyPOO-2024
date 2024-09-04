package models;


/**
 * @author jadg13
 * @version 1.0
 * @created 03-sep.-2024 05:52:53
 */
public class Admission {

	public Admission(){

	}

	/**
	 * Calcula si el estudiante tiene derecho a beca
	 * @param student
	 */
	public void calcScholarship(Student student){
		student.setScholarShip(student.getAverage()>=80);
	}
}//end Admission