/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package student;

/**
 *
 * @author Ali
 */
public class Student {

    // the student’s first name
 private String firstName;
 // the student’s last name
 private String lastName;
 // the student ID
 private String id;
 //the grade
 private int grade;
 
 public Student(String fName, String lname, String sID){
 firstName = fName;
 lastName = lname;
 id = sID;
 grade = 0;
 }
 
 public String getFirstName() {
 return firstName;
 }
 
 public void setFirstName(String fName) {
 this.firstName = fName;
 }
 
 public void setGrade(int grade){
     this.grade = grade;
 }
 public void print() {
 System.out.println(lastName + ", student ID: "
 + id + ", grade: " + grade);
 }
 
 
    public static void main(String[] args) {
        Student std1 = new Student("Ehsan","Edalat", "9031066");
 Student std2 = new Student("Seyed", "Ahmadpanah", "9031806");
 Student std3 = new Student("Ahmad", "Asadi", "9031054");

 std1.print();
 std1.setGrade(15);
 std1.print();

 std2.print();
 std2.setGrade(11);
 std2.print();

 std3.print();
 std3.setFirstName("HamidReza");
 std3.print();
    }
    
}
