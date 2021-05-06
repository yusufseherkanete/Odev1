package odev1;

class Course {

	public Course() {

	}

	public Course(int id, String courseName, String instructor, int completed) {
		this.id = id;
		this.courseName = courseName;
		this.instructor = instructor;
		this.completed = completed;
	}

	int id;
	String courseName;
	String instructor;
	int completed;
}

class Student {

	public Student() {
	}

	public Student(int id, String studentName, String eMail, String password) {
		this.id = id;
		this.studentName = studentName;
		this.eMail = eMail;
		this.password = password;
	}

	int id;
	String studentName;
	String eMail;
	String password;

}

class CourseManeger {

	public void addCourse(Course course) {
		System.out.println(course.courseName + " course added.");
	}

	public void addHomework(Course course) {
		System.out.println("Homework added to " + course.courseName);
	}

}

public class Main {

	public static void main(String[] args) {

		Course course1 = new Course(1, "Yazýlým Geliþtirici Yetiþtirme Kampý (C# + ANGULAR)", "Engin Demiroð", 100);

		Course course2 = new Course();
		course2.id = 2;
		course2.courseName = "Yazýlým Geliþtirici Yetiþtirme Kampý (JAVA + REACT)";
		course2.instructor = "Engin Demiroð";
		course2.completed = 44;

		Course course3 = new Course(3, "Programlamaya Giriþ için Temel Kurs", "Engin Demiroð", 100);

		Course[] courses = new Course[] { course1, course2, course3 };

		for (Course course : courses) {
			System.out.println(course.courseName);
			System.out.println(course.instructor);
			System.out.println("%"+course.completed+" Tamamlandý");
			System.out.println("----------------------------------------------------------------------");
		}
		
		CourseManeger courseManeger = new CourseManeger();
		courseManeger.addCourse(course1);
		courseManeger.addHomework(course1);
		System.out.println("----------------------------------------------------------------------");

		courseManeger.addCourse(course2);
		courseManeger.addHomework(course2);
		System.out.println("----------------------------------------------------------------------");

		courseManeger.addCourse(course3);
		courseManeger.addHomework(course3);
	}

}
