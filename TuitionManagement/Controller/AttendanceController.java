/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TuitionManagement.Controller;

import TuitionManagement.DB.DBConnection;
import TuitionManagement.Model.Attendance;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class AttendanceController {

    public static int enterAttendance(Attendance a1) throws ClassNotFoundException, SQLException {
        String SQL = "insert into attendance values(?,?,?)";
        Connection conn = DBConnection.getDBConnection().getConnection();
        PreparedStatement stm = conn.prepareStatement(SQL);
        stm.setObject(1, a1.getReg_id());
        stm.setObject(2, a1.getSubject_id());
        stm.setObject(3, a1.getDate());
        int res = stm.executeUpdate();
        return res;
    }

    public static ArrayList<Attendance> viewAttendance(String month, String reg_id) throws ClassNotFoundException, SQLException {
        String SQL ="select a.reg_id,student_name,subject_name,a.date from student s,subject ss,attendance a,registration r where r.student_Id=s.student_Id && ss.subject_Id=r.subject_Id && ss.subject_Id=a.subject_Id && a.reg_Id='"+reg_id+"' && month(a.date) = '"+month+"' group by a.date;";
        Connection conn = DBConnection.getDBConnection().getConnection();
        Statement stm = conn.createStatement();
        ResultSet rst = stm.executeQuery(SQL);
        ArrayList<Attendance> attenList = new ArrayList<>();
        while (rst.next()) {
            Attendance a1 = new Attendance(rst.getString(1), rst.getString(2), rst.getString(3), rst.getString(4));
            attenList.add(a1);
        }
        return attenList;
    }

}
