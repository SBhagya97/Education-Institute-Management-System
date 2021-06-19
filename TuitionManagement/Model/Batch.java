/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TuitionManagement.Model;


public class Batch {
    private String batch_id;
    private String batch_type;
    private String year;
    private String subject_id;
    private String subject_name;
    private int number_of_student;

    public Batch() {
    }

    public Batch(String batch_id, String batch_type, String year, String subject_id) {
        this.batch_id = batch_id;
        this.batch_type = batch_type;
        this.year = year;
        this.subject_id = subject_id;
    }

    public Batch(String batch_id, String year) {
        this.batch_id = batch_id;
        this.year = year;
    }

    
    public Batch(String batch_type) {
        this.batch_type = batch_type;
    }

    public Batch(String batch_id, String batch_type, String year, String subject_id, String subject_name) {
        this.batch_id = batch_id;
        this.batch_type = batch_type;
        this.year = year;
        this.subject_id = subject_id;
        this.subject_name = subject_name;
        
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
     * @return the year
     */
    public String getYear() {
        return year;
    }

    /**
     * @param year the year to set
     */
    public void setYear(String year) {
        this.year = year;
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
     * @return the number_of_student
     */
    public int getNumber_of_student() {
        return number_of_student;
    }

    /**
     * @param number_of_student the number_of_student to set
     */
    public void setNumber_of_student(int number_of_student) {
        this.number_of_student = number_of_student;
    }
        
    
}
