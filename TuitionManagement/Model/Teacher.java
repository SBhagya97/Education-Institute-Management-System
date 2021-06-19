/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TuitionManagement.Model;


public class Teacher {

    private String teacher_id;
    private String teacher_name;
    private String subject_name;
    private String contact_number;
    private String email;
    private String subject_id;
    private double subject_fee;

    public Teacher() {
    }

    public Teacher(String teacher_id, String teacher_name, String subject_name, String contact_number, String email) {
        this.teacher_id = teacher_id;
        this.teacher_name = teacher_name;
        this.subject_name = subject_name;
        this.contact_number = contact_number;
        this.email = email;
    }

    public Teacher(String teacher_id, String teacher_name, String subject_id,String subject_name,double subject_fee,String contact_number, String email) {
        this.teacher_id = teacher_id;
        this.teacher_name = teacher_name;
        this.subject_name = subject_name;
        this.contact_number = contact_number;
        this.email = email;
        this.subject_id = subject_id;
        this.subject_fee = subject_fee;
    }

    public Teacher(String teacher_id) {
        this.teacher_id = teacher_id;
    }

    
        
    

    

    /**
     * @return the teacher_id
     */
    public String getTeacher_id() {
        return teacher_id;
    }

    /**
     * @param teacher_id the teacher_id to set
     */
    public void setTeacher_id(String teacher_id) {
        this.teacher_id = teacher_id;
    }

    /**
     * @return the teacher_name
     */
    public String getTeacher_name() {
        return teacher_name;
    }

    /**
     * @param teacher_name the teacher_name to set
     */
    public void setTeacher_name(String teacher_name) {
        this.teacher_name = teacher_name;
    }

    /**
     * @return the subject_name
     */
    public String getSubject_name() {
        return subject_name;
    }

    /**
     * @param subject_name the subject_name to set
     */
    public void setSubject_name(String subject_name) {
        this.subject_name = subject_name;
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

    /**
     * @return the subject_id
     */
    public String getSubject_id() {
        return subject_id;
    }

    /**
     * @param subject_id the subject_id to set
     */
    public void setSubject_id(String subject_id) {
        this.subject_id = subject_id;
    }

    /**
     * @return the subject_fee
     */
    public double getSubject_fee() {
        return subject_fee;
    }

    /**
     * @param subject_fee the subject_fee to set
     */
    public void setSubject_fee(double subject_fee) {
        this.subject_fee = subject_fee;
    }

}
