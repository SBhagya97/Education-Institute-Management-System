/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TuitionManagement.Model;

import java.util.Date;


public class Student {

    private String student_id;
    private String student_name;
    private String gender;
    private String dateOfBirth;
    private String address;
    private String contact_number;
    private String email;

    public Student() {
    }

    public Student(String student_id, String student_name, String gender, String dateOfBirth, String address, String contact_number, String email) {
        this.student_id = student_id;
        this.student_name = student_name;
        this.gender = gender;
        this.dateOfBirth = dateOfBirth;
        this.address = address;
        this.contact_number = contact_number;
        this.email = email;

    }

    public Student(String id, String name, String dateOfBirth, String address, String contact_number, String email) {
        this.student_id = id;
        this.student_name = name;
        this.dateOfBirth = dateOfBirth;
        this.address = address;
        this.contact_number = contact_number;
        this.email = email;
    }

    /**
     * @return the student_id
     */
    public String getStudent_id() {
        return student_id;
    }

    /**
     * @param student_id the student_id to set
     */
    public void setStudent_id(String student_id) {
        this.student_id = student_id;
    }

    /**
     * @return the student_name
     */
    public String getStudent_name() {
        return student_name;
    }

    /**
     * @param student_name the student_name to set
     */
    public void setStudent_name(String student_name) {
        this.student_name = student_name;
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
     * @return the dateOfBirth
     */
    public String getDateOfBirth() {
        return dateOfBirth;
    }

    /**
     * @param dateOfBirth the dateOfBirth to set
     */
    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = this.dateOfBirth;
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
     * @return the contact_number
     */
    public String getContact_number() {
        return contact_number;
    }

    /**
     * @param contact_number the contact_number to set
     */
    public void setContact_number(String contact_number) {
        this.contact_number = contact_number;
    }

    /**
     * @return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email the email to set
     */
    public void setEmail(String email) {
        this.email = email;
    }
}
