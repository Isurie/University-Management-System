/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package abcuniversity;

/**
 *
 * @author PC
 */
public class Student {

    private int regID;
    private String firstName;
    private String lastName;
    private int age;
    private String address;
    private String gender;
    private String faculty;
    private String department;
    private int yearOfRegistration;

    /**
     * @return the regID
     */
    public int getRegID() {
        return regID;
    }

    /**
     * @param regid the regID to set
     */
    public void setRegID(int regid) {
        this.regID = regid;
    }

    /**
     * @return the firstName
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * @param firstName the firstName to set
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    /**
     * @return the lastName
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * @param lastName the lastName to set
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    /**
     * @return the age
     */
    public int getAge() {
        return age;
    }

    /**
     * @param age the age to set
     */
    public void setAge(int age) {
        this.age = age;
    }

    /**
     * @return the address
     */
    public String getAddress() {
        return address;
    }

    /**
     * @param address the address to set
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * @return the gender
     */
    public String getGender() {
        return gender;
    }

    /**
     * @param gender the gender to set
     */
    public void setGender(String gender) {
        this.gender = gender;
    }

    /**
     * @return the faculty
     */
    public String getFaculty() {
        return faculty;
    }

    /**
     * @param faculty the faculty to set
     */
    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }

    /**
     * @return the department
     */
    public String getDepartment() {
        return department;
    }

    /**
     * @param department the department to set
     */
    public void setDepartment(String department) {
        this.department = department;
    }

    /**
     * @return the yearOfRegistration
     */
    public int getYearOfRegistration() {
        return yearOfRegistration;
    }

    /**
     * @param yearOfRegistration the yearOfRegistration to set
     */
    public void setYearOfRegistration(int yearOfRegistration) {
        this.yearOfRegistration = yearOfRegistration;
    }
}
