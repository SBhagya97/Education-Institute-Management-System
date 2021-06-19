/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package TuitionManagement.Controller;

/**
 *
 * @author Softlogic
 */
import TuitionManagement.DB.DBConnection;
import TuitionManagement.Model.LectureHall;
import TuitionManagement.Model.Teacher;
import com.sun.net.httpserver.Authenticator;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class LectureHallController {
    
    
    public static ArrayList<LectureHall>searchSelectdLectureHall(String lectureHall_id)throws ClassNotFoundException,SQLException{
        Connection conn=DBConnection.getDBConnection().getConnection();
        //String SQL="select t.teacher_id,teacher_name,subject_id,s.subject_name,subject_fee,contact_number,email from teacher t,subject s where t.teacher_id=s.teacher_id && t.teacher_id='"+teacher_id+"'";
        String SQL="select * from lecture_halls where lecture_hall_id='"+lectureHall_id+"'";
        Statement stm=conn.createStatement();
        ResultSet rst=stm.executeQuery(SQL);
        ArrayList<LectureHall>lectureHallList=new ArrayList<>();
        while(rst.next()){
            LectureHall le1=new LectureHall(rst.getString(1),rst.getString(2),rst.getString(3));
            lectureHallList.add(le1);
        }
        return lectureHallList;
    }
    
    public static int addLectureHall(LectureHall le1) throws ClassNotFoundException, SQLException {
        String SQL = "insert into lecture_halls values(?,?,?)";
        Connection conn = DBConnection.getDBConnection().getConnection();
        PreparedStatement stm = conn.prepareStatement(SQL);
        stm.setObject(1, le1.getLecHall_ID());
        stm.setObject(2, le1.getLecHall_name());
        stm.setObject(3, le1.getLecHall_Capacity());
        //stm.setObject(4, b1.getSubject_id());
        int res = stm.executeUpdate();
        return res;
    }
    
     public static  int deleteLectureHall(String lectureHall_id)throws ClassNotFoundException,SQLException{
        String SQL="delete from lecture_halls where lecture_hall_id='"+lectureHall_id+"'";
        Connection conn=DBConnection.getDBConnection().getConnection();
        Statement stm=conn.createStatement();
        int res=stm.executeUpdate(SQL);
        return res;
       
        
    }
     
     public static boolean updateLectureHall(LectureHall le1) throws ClassNotFoundException, SQLException {
       String SQL = "update lecture_halls set lecture_hall_name=?,capacity=? where  lecture_hall_id=?";
        Connection conn = DBConnection.getDBConnection().getConnection();
        PreparedStatement stm = conn.prepareStatement(SQL);
        stm.setObject(1, le1.getLecHall_name());
        stm.setObject(2, le1.getLecHall_Capacity());
//        stm.setObject(3, t1.getContact_number());
//        stm.setObject(4, t1.getEmail());
        stm.setObject(3, le1.getLecHall_ID());
        int res = stm.executeUpdate();
        if(res>0){
            return true;
        }
        return false;
    }
    
     
     public static ArrayList<LectureHall> viewAllLectureHallDetails() throws ClassNotFoundException, SQLException {
        Connection conn = DBConnection.getDBConnection().getConnection();
        String SQL = "Select * from  lecture_halls";
        Statement stm = conn.createStatement();
        ResultSet rst = stm.executeQuery(SQL);
        ArrayList<LectureHall> lectureHallList = new ArrayList<>();
        while (rst.next()) {
            LectureHall le1 = new LectureHall(rst.getString(1), rst.getString(2), rst.getString(3));
            lectureHallList.add(le1);
        }
        return lectureHallList;
    }
     
     public static LectureHall searchLectureHall(String lectureHall_name) throws ClassNotFoundException, SQLException {
        String SQL = "select * from  lecture_halls where lecture_hall_name='" +lectureHall_name + "'";
        Connection conn = DBConnection.getDBConnection().getConnection();
        Statement stm = conn.createStatement();
        ResultSet rst = stm.executeQuery(SQL);
        if (rst.next()) {
            LectureHall le1 = new LectureHall(rst.getString(1), rst.getString(2), rst.getString(3));
            return le1;
        } else {
            return null;
        }
    }
     
     public static ArrayList<LectureHall> viewAllLectureDetails() throws ClassNotFoundException, SQLException {
        Connection conn = DBConnection.getDBConnection().getConnection();
        String SQL = "select * from lecture_halls";
        Statement stm = conn.createStatement();
        ResultSet rst = stm.executeQuery(SQL);
        ArrayList<LectureHall> lectureHallsList = new ArrayList<>();
        while (rst.next()) {
            LectureHall le1 = new LectureHall(rst.getString(1), rst.getString(2), rst.getString(3));
            lectureHallsList.add(le1);
        }
        return lectureHallsList;
    }
     
}
