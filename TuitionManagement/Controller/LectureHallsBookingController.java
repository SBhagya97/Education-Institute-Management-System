/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package TuitionManagement.Controller;

import TuitionManagement.DB.DBConnection;
import TuitionManagement.Model.LectureHallsBooking;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author Softlogic
 */
public class LectureHallsBookingController {
    public static int addLectureHallBooking(LectureHallsBooking lb1) throws ClassNotFoundException, SQLException {
        String SQL = "insert into  lecture_halls_booking values(?,?,?,?,?,?)";
        Connection conn = DBConnection.getDBConnection().getConnection();
        PreparedStatement stm = conn.prepareStatement(SQL);
        stm.setObject(1, lb1.getBooking_id());
        stm.setObject(2, lb1.getLecture_hall_id());
        stm.setObject(3, lb1.getTeacher_id());
        stm.setObject(4, lb1.getDay());
        stm.setObject(5, lb1.getEntry_time());
        stm.setObject(6, lb1.getExit_time());
        //stm.setObject(4, b1.getSubject_id());
        int res = stm.executeUpdate();
        return res;
    }
    
     public static ArrayList<LectureHallsBooking> getAllLectureHallBooking() throws ClassNotFoundException, SQLException {
        String SQL = "select  booking_id,lecture_hall_name,teacher_name,s.subject_name,Day, Entry_time, Exit_time  from lecture_halls l,teacher t,subject s, lecture_halls_booking b where t.teacher_id=s.teacher_id && b.lecture_hall_id=l.lecture_hall_id && b.teacher_id=t.teacher_id;";
        Connection conn = DBConnection.getDBConnection().getConnection();
        Statement stm = conn.createStatement();
        ResultSet rst = stm.executeQuery(SQL);
        ArrayList<LectureHallsBooking> lectureHallBookingList = new ArrayList<>();
        
        while (rst.next()) {
            LectureHallsBooking lb1 = new LectureHallsBooking(rst.getString(1), rst.getString(2), rst.getString(3), rst.getString(4), rst.getString(5), rst.getString(6),rst.getString(7));
            lectureHallBookingList.add(lb1);
            
        }
        return lectureHallBookingList;
    }
     
      public static  int deleteLectureHallBooking(String booking_id)throws ClassNotFoundException,SQLException{
        String SQL="delete from lecture_halls_booking where  booking_id ='"+booking_id+"'";
        Connection conn=DBConnection.getDBConnection().getConnection();
        Statement stm=conn.createStatement();
        int res=stm.executeUpdate(SQL);
        return res;
       
        
    }
    
}
