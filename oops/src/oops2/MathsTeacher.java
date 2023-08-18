package oops2;

public class MathsTeacher extends Teacher {
	int classNo;
	int experience;

	public MathsTeacher(String name, int id, String natives, int distance, int classNo, int experience) {
		super(name, id, natives, distance);
		this.classNo = classNo;
		this.experience = experience;

	}

	public String toString() {
		return super.toString() + " " + classNo + " " + experience;
	}
}
