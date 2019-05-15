package model;

public class Student implements Comparable<Student>{
	private int code;
	private String name;
	private Student left;
	private Student rigth;
	
	public Student(int code, String name) {
		super();
		this.code = code;
		this.name = name;
	}

	public Student getLeft() {
		return left;
	}

	public void setLeft(Student left) {
		this.left = left;
	}

	public Student getRigth() {
		return rigth;
	}

	public void setRigth(Student rigth) {
		this.rigth = rigth;
	}

	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	@Override
	public int compareTo(Student o) {
		int comparation;
		if(code < o.code) {
			comparation = -1;
		}else if(code>o.code) {
			comparation =1;
		}else {
			comparation = 0;
		}
		return comparation;
	}
}
