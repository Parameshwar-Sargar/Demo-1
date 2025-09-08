package Com.student;

public class student {
private int id;
private String name;
private String address;
private String marks;
public student(int id, String name, String address, String marks) {
	super();
	this.id = id;
	this.name = name;
	this.address = address;
	this.marks = marks;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getAddress() {
	return address;
}
public void setAddress(String address) {
	this.address = address;
}
public String getMarks() {
	return marks;
}
public void setMarks(String marks) {
	this.marks = marks;
}
public static void add(student std) {
	// TODO Auto-generated method stub
	
}


}
