/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package TuitionManagement.Model;


public class LectureHall {
    private String lecHall_ID;
    private String lecHall_name;
    private String lecHall_Capacity;
   // private String Status;

    public LectureHall() {
    }

    public LectureHall(String lecHall_ID, String lecHall_name, String lecHall_Capacity) {
        this.lecHall_ID = lecHall_ID;
        this.lecHall_name = lecHall_name;
        this.lecHall_Capacity = lecHall_Capacity;
        //this.Status = Status;
    }

    public String getLecHall_ID() {
        return lecHall_ID;
    }

    public void setLecHall_ID(String lecHall_ID) {
        this.lecHall_ID = lecHall_ID;
    }

    public String getLecHall_name() {
        return lecHall_name;
    }

    public void setLecHall_name(String lecHall_name) {
        this.lecHall_name = lecHall_name;
    }

    public String getLecHall_Capacity() {
        return lecHall_Capacity;
    }

    public void setLecHall_Capacity(String lecHall_Capacity) {
        this.lecHall_Capacity = lecHall_Capacity;
    }
    
    
    
}
