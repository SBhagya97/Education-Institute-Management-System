/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TuitionManagement.Model;


public class Payment {

    private String payment_id;
    private String reg_id;
    private String subject_id;
    private String month;
    private String date;
    private double subject_fee;
    private String subject_name;
    private String student_name;
    private String batch_id;
    private String contact_number;
    private String student_id;

    public Payment() {
    }

    public Payment(String payment_id, String reg_id, String subject_id, String month, String date, double subject_fee) {
        this.payment_id = payment_id;
        this.reg_id = reg_id;
        this.subject_id = subject_id;
        this.month = month;
        this.date = date;
        this.subject_fee = subject_fee;
    }

    public Payment(String string, String string0, String string1, String string2, String string3, String string4, double aDouble) {
        this.payment_id = string;
        this.reg_id = string0;
        this.subject_id = string1;
        this.subject_name = string2;
        this.month = string3;
        this.date = string4;
        this.subject_fee = aDouble;
    }

    public Payment( String student_id, String student_name,String reg_id, String subject_id, String subject_name, String batch_id, String contact_number) {
        this.reg_id = reg_id;
        this.subject_id = subject_id;
        this.subject_name = subject_name;
        this.student_name = student_name;
        this.batch_id = batch_id;
        this.contact_number = contact_number;
        this.student_id = student_id;
    }

   

   
    

   

    

    /**
     * @return the payment_id
     */
    public String getPayment_id() {
        return payment_id;
    }

    /**
     * @param payment_id the payment_id to set
     */
    public void setPayment_id(String payment_id) {
        this.payment_id = payment_id;
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
     * @param subject_fee the subject_fee to set
     */
    public void setSubject_fee(double subject_fee) {
        this.subject_fee = subject_fee;
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
     * @return the month
     */
    public String getMonth() {
        return month;
    }

    /**
     * @param month the month to set
     */
    public void setMonth(String month) {
        this.month = month;
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

}
