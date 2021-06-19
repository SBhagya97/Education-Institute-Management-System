/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TuitionManagement.Model;


public class Registration {

    private String reg_id;
    private String student_id;
    private String student_name;
    private String subject_id;
    private String batch_id;
    private String date;
    private String batch_type;
    private double reg_fee;
    private Student s;

    public Registration() {

    }

    public Registration(String reg_id, String student_id, String subject_id, String batch_id, String date, double reg_fee) {
        this.reg_id = reg_id;
        this.student_id = student_id;
        this.subject_id = subject_id;
        this.batch_id = batch_id;
        this.date = date;
        this.reg_fee = reg_fee;
    }

    public Registration(String reg_id, String subject_id, String batch_id, String date, double reg_fee, String sid,Student s) {
        this.reg_id = reg_id;
        this.subject_id = subject_id;
        this.batch_id = batch_id;
        this.date = date;
        this.reg_fee = reg_fee;
        this.student_id = sid;
        this.s=s;
    }
    //select reg_id,student_id,batch_type,b.batch_id,b.subject_id,date,reg_fee

    public Registration(String reg_id, String student_id, String subject_id, String batch_id, String date, String batch_type, double reg_fee) {
        this.reg_id = reg_id;
        this.student_id = student_id;
        this.subject_id = subject_id;
        this.batch_id = batch_id;
        this.date = date;
        this.batch_type = batch_type;
        this.reg_fee = reg_fee;
    }
    

    public Registration(String reg_id, String student_id, String student_name, String batch_type,String batch_id, String subject_id, String date,double reg_fee) {
        this.reg_id = reg_id;
        this.student_id = student_id;
        this.student_name = student_name;
        this.subject_id = subject_id;
        this.batch_id = batch_id;
        this.date = date;
        this.batch_type = batch_type;
        this.reg_fee = reg_fee;
    }

  

    public Registration(String regId, String subject_id, String batch_id, String d1, double fee, String sid) {
         this.reg_id = regId;
        this.subject_id = subject_id;
        this.batch_id = batch_id;
        this.date = d1;
        this.reg_fee = fee;
        this.student_id = sid;
    }

    public Registration(String regId, String subject_id, String batch_id, String d1, double fee, Student s) {
           this.reg_id = regId;
        this.subject_id = subject_id;
        this.batch_id = batch_id;
        this.date = d1;
        this.reg_fee =fee;
        this.s=s;
    }

    /**
     * @return the reg_id
     */
    public String getReg_id() {
        return reg_id;
    }

    /**
     * @param reg_id the reg_id to set
     */
    public void setReg_id(String reg_id) {
        this.reg_id = reg_id;
    }

    /**
     * @return the student_id
     */
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
     * @return the batch_id
     */
    public String getBatch_id() {
        return batch_id;
    }

    /**
     * @param batch_id the batch_id to set
     */
    public void setBatch_id(String batch_id) {
        this.batch_id = batch_id;
    }

    /**
     * @return the date
     */
    public String getDate() {
        return date;
    }

    /**
     * @param date the date to set
     */
    public void setDate(String date) {
        this.date = date;
    }

    /**
     * @return the reg_fee
     */
    public double getReg_fee() {
        return reg_fee;
    }

    /**
     * @param reg_fee the reg_fee to set
     */
    public void setReg_fee(double reg_fee) {
        this.reg_fee = reg_fee;
    }

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
     * @return the batch_type
     */
    public String getBatch_type() {
        return batch_type;
    }

    /**
     * @param batch_type the batch_type to set
     */
    public void setBatch_type(String batch_type) {
        this.batch_type = batch_type;
    }

    /**
     * @return the s
     */
    public Student getS() {
        return s;
    }

    /**
     * @param s the s to set
     */
    public void setS(Student s) {
        this.s = s;
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

}
