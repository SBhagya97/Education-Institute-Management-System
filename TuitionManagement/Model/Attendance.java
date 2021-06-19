/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TuitionManagement.Model;


public class Attendance {
    private String reg_id;
    private String subject_id;
    private String date;
    private String name;
    private String subject_name;
    
    public Attendance(){}
    public Attendance(String reg_id,String subject_id,String date){
        this.reg_id=reg_id;
        this.subject_id=subject_id;
        this.date=date;
    }

    public Attendance(String reg_id, String name, String subject_name, String date) {
        this.reg_id=reg_id;
        this.name=name;
        this.subject_name=subject_name;
        this.date=date;
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
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
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
    
}
