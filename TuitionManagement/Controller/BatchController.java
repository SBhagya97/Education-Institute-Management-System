/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TuitionManagement.Controller;

import TuitionManagement.DB.DBConnection;
import TuitionManagement.Model.Batch;
import com.sun.xml.internal.bind.util.Which;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import javax.naming.spi.DirStateFactory;


public class BatchController {

    public static ArrayList<Batch> viewAllBatchType() throws ClassNotFoundException, SQLException {
        String SQL = "select distinct batch_type from batch";
        Connection conn = DBConnection.getDBConnection().getConnection();
        Statement stm = conn.createStatement();
        ResultSet rst = stm.executeQuery(SQL);
        ArrayList<Batch> batchList = new ArrayList<>();
        while (rst.next()) {
            Batch b1 = new Batch(rst.getString("batch_type"));
            batchList.add(b1);

        }
        return batchList;

    }

    public static ArrayList<Batch> viewAllBatch() throws ClassNotFoundException, SQLException {
        String SQL = "select b.batch_id,b.batch_type,b.year,subject_name,b.subject_id from subject s,batch b where s.subject_id=b.subject_id order by 5";
        Connection conn = DBConnection.getDBConnection().getConnection();
        Statement stm = conn.createStatement();
        ResultSet rst = stm.executeQuery(SQL);
        ArrayList<Batch> batchList = new ArrayList<>();
        while (rst.next()) {
            Batch b1 = new Batch(rst.getString("batch_id"), rst.getString("batch_type"), rst.getString("year"), rst.getString("subject_name"),rst.getString("subject_id"));
            batchList.add(b1);
        }
        return batchList;
    }

    public static ArrayList<Batch> searchBatchIDs(String type, int year, String subject_id) throws ClassNotFoundException, SQLException {
        String sql = "select batch_id,batch_type,subject_id,year from batch where subject_id like '" + subject_id + "' && year like '" + year + "' && batch_type like '" + type + "'";
        Connection conn = DBConnection.getDBConnection().getConnection();
        Statement stm = conn.createStatement();
        ResultSet rst = stm.executeQuery(sql);
        ArrayList<Batch> bList = new ArrayList<>();
        while (rst.next()) {
            Batch b1 = new Batch(rst.getString(1), rst.getString(2));
            bList.add(b1);
        }
        return bList;
    }

    public static int addBatch(Batch b1) throws ClassNotFoundException, SQLException {
        String SQL = "insert into batch values(?,?,?,?)";
        Connection conn = DBConnection.getDBConnection().getConnection();
        PreparedStatement stm = conn.prepareStatement(SQL);
        stm.setObject(1, b1.getBatch_id());
        stm.setObject(2, b1.getBatch_type());
        stm.setObject(3, b1.getYear());
        stm.setObject(4, b1.getSubject_id());
        int res = stm.executeUpdate();
        return res;
    }

}
