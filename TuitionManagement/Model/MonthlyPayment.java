/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TuitionManagement.Model;


public class MonthlyPayment {
    private String payment_id;
    private String reg_id;
    private String subject_id;
    private String date;
    
    public MonthlyPayment(){}
    public MonthlyPayment(String payment_id,String reg_id,String subject_id,String date){
        this.payment_id=payment_id;
        this.reg_id=reg_id;
        this.subject_id=subject_id;
        this.date=date;
        
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
    
}
