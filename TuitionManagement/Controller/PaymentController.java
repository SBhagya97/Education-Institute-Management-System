/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TuitionManagement.Controller;

import TuitionManagement.DB.DBConnection;
import TuitionManagement.Model.Payment;
import java.lang.Thread.State;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;


public class PaymentController {

    public static ArrayList<Payment> viewAllPayments() throws ClassNotFoundException, SQLException {
        String SQL = "select payment_id,reg_id,s.subject_id,subject_name,month,date,s.subject_fee "
                + "from payment p,subject s "
                + "where p.subject_id=s.subject_id;";
        Connection conn = DBConnection.getDBConnection().getConnection();
        Statement stm = conn.createStatement();
        ResultSet rst = stm.executeQuery(SQL);
        ArrayList<Payment> paymentList = new ArrayList<>();
        while (rst.next()) {
            Payment p1 = new Payment(rst.getString(1), rst.getString(2), rst.getString(3), rst.getString(4), rst.getString(5), rst.getString(6), rst.getDouble(7));
            paymentList.add(p1);
        }
        return paymentList;
    }

    public static ArrayList<Payment> viewNotPaidMonthlyPayment(String month, String subject_id) throws ClassNotFoundException, SQLException {
        String SQL = "select s.student_id,student_name,reg_id,sub.subject_id,subject_name,b.batch_id,s.contact_number "
                + "from student s,registration r,subject sub,batch b "
                + "where s.student_id=r.student_id && r.batch_id=b.batch_id && b.subject_id=sub.subject_id && r.reg_id not in(select reg_id from payment where month(date)='" + month + "') && sub.subject_id='" + subject_id + "'";
        Connection conn = DBConnection.getDBConnection().getConnection();
        Statement stm = conn.createStatement();
        ResultSet rst = stm.executeQuery(SQL);
        ArrayList<Payment> paymentList = new ArrayList<>();
        while (rst.next()) {
            Payment p1 = new Payment(rst.getString("student_id"), rst.getString("student_name"), rst.getString("reg_id"), rst.getString("subject_id"), rst.getString("subject_name"), rst.getString("batch_id"),rst.getString("contact_number"));
            paymentList.add(p1);
        }
        return paymentList;
    }

    public static ArrayList<Payment> viewPayments(String subject_name, String month) throws ClassNotFoundException, SQLException {
        String SQL = "select distinct payment_id,reg_id,s.subject_id,subject_name,month,date,s.subject_fee from payment p,subject s where p.subject_id=s.subject_id && subject_name like '" + subject_name + "' && month like '" + month + "'";
        Connection conn = DBConnection.getDBConnection().getConnection();
        Statement stm = conn.createStatement();
        ResultSet rst = stm.executeQuery(SQL);
        ArrayList<Payment> paymentList = new ArrayList<>();
        while (rst.next()) {
            Payment p1 = new Payment(rst.getString(1), rst.getString(2), rst.getString(3), rst.getString(4), rst.getString(5), rst.getString(6), rst.getDouble(7));
            paymentList.add(p1);
        }
        return paymentList;
    }

    public static int enterPayment(Payment p1) throws ClassNotFoundException, SQLException {
        String SQL = "insert into payment values(?,?,?,?,?,?)";
        Connection conn = DBConnection.getDBConnection().getConnection();
        PreparedStatement stm = conn.prepareStatement(SQL);
        stm.setObject(1, p1.getPayment_id());
        stm.setObject(2, p1.getReg_id());
        stm.setObject(3, p1.getSubject_id());
        stm.setObject(4, p1.getMonth());
        stm.setObject(5, p1.getDate());
        stm.setObject(6, p1.getSubject_fee());
        int res = stm.executeUpdate();
        return res;
    }
}
