/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TuitionManagement.Model;


public class Subject {

    private String subject_id;
    private String subject_name;
    private double subject_fee;
    private String teacher_id;
    private Teacher t1;

    public Subject() {
    }

    public Subject(String subject_id, String subject_name, double subject_fee, String teacher_id) {
        this.subject_id = subject_id;
        this.subject_name = subject_name;
        this.subject_fee = subject_fee;
        this.teacher_id = teacher_id;
    }

    public Subject(String sId) {
        this.subject_id = sId;
        
    }

    public Subject(String subject_id, String subject_name, double sub_fee, Teacher t1) {
        this.subject_id = subject_id;
        this.subject_name = subject_name;
        this.subject_fee = sub_fee;
        this.t1 = t1;
    }

    public Subject( String subject_name,String subject_id,double subject_fee) {
        this.subject_id = subject_id;
        this.subject_name = subject_name;
        this.subject_fee=subject_fee;
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
     * @return the subject_fee
     */
    public double getSubject_fee() {
        return subject_fee;
    }

    /**
     * @param subject_fee the subject_fee to set
     */
    public void setSubject_fee(String subject_fee) {
        this.setSubject_fee(subject_fee);
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
     * @param subject_fee the subject_fee to set
     */
    public void setSubject_fee(double subject_fee) {
        this.subject_fee = subject_fee;
    }

    /**
     * @return the t1
     */
    public Teacher getT1() {
        return t1;
    }

    /**
     * @param t1 the t1 to set
     */
    public void setT1(Teacher t1) {
        this.t1 = t1;
    }

}
