package model;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CourseTest {

	private Course x;
	
	private void setupScenary1() {
		x = new Course();
	}
	private void setupScenary2() {
		x = new Course();
		x.addStudent(100,"emilio");
	}
	@Test
	private void addStudentTest() {
		setupScenary1();
		x.addStudent(100,"emilio");
		assertNotNull(x, "no existe");
	}
	@Test
	private void search() {
		setupScenary2();
		Student ser = x.searchStudent(100);
		assertNotNull(ser);
	}
	@Test
	void test(){
		fail("Not yet implemented");
	}

}
