/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab;

/**
 *
 * @author Ali
 */
public class Lab {

 private Lab[] students;
 private int avg;
 private String day;
 private int capacity;
 private int currentSize;
 public Lab(int cap, String d) {
 }
    
 public void enrollStudent(Lab std) {
 if (currentSize < capacity) {
 students[currentSize] = std;
 currentSize++;
 } else {
 System.out.println("Lab is full!!!");
 }
 }
 
 public void print() {
 System.out.print(students +"student :");
  System.out.print(avg +"avrage : :");
 }
 
 public Lab[] getStudents() {
     return students;
 }
 
 public void setStudents(Lab[] students) {
     this.students = students;
 }
 
 public int getAvg() {  
     return avg;
 }
 
 public void calculateAvg() {
 
 }
 
 public String getDay() {
     return day;
 }
 
 public void setDay(String day) {
     this.day = day;
 }
 
 public int getCapacity() {
     return capacity;
 }
 
 public void setCapacity(int capacity) {
 
 this.capacity = capacity;
 }
    public static void main(String[] args) {
        
    }
    
}
