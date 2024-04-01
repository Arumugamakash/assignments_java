package assignment12.qn4.faculty;

import assignment12.qn4.course.Course;

public class Faculty {
	private String name;
	private int id;
	private long phoneNumber;
	private String address;
    private Course course;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public long getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(long phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public Course getCourse() {
		return course;
	}
	public void setCourse(Course course) {
		this.course = course;
	}
	@Override
	public String toString() {
		return "Faculty [name=" + name + ", id=" + id + ", phoneNumber=" + phoneNumber + ", address=" + address
				+ ", course=" + course + "]";
	}
    
    

}
