/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package TuitionManagement.Model;

/**
 *
 * @author Softlogic
 */
public class LectureHallsBooking {
    private String booking_id;
    private String lecture_hall_id;
    private String teacher_id;
    private String Day;
    private String entry_time;
    private String exit_time;
    private String Subject;

    public String getSubject() {
        return Subject;
    }

    public void setSubject(String Subject) {
        this.Subject = Subject;
    }

    public LectureHallsBooking(String booking_id, String lecture_hall_id, String teacher_id, String Day, String entry_time, String exit_time, String Subject) {
        this.booking_id = booking_id;
        this.lecture_hall_id = lecture_hall_id;
        this.teacher_id = teacher_id;
        this.Day = Day;
        this.entry_time = entry_time;
        this.exit_time = exit_time;
        this.Subject = Subject;
    }

    public LectureHallsBooking(String booking_id, String lecture_hall_id, String teacher_id, String Day, String entry_time, String exit_time) {
        this.booking_id = booking_id;
        this.lecture_hall_id = lecture_hall_id;
        this.teacher_id = teacher_id;
        this.Day = Day;
        this.entry_time = entry_time;
        this.exit_time = exit_time;
    }

    public String getBooking_id() {
        return booking_id;
    }

    public void setBooking_id(String booking_id) {
        this.booking_id = booking_id;
    }

    public String getLecture_hall_id() {
        return lecture_hall_id;
    }

    public void setLecture_hall_id(String lecture_hall_id) {
        this.lecture_hall_id = lecture_hall_id;
    }

    public String getTeacher_id() {
        return teacher_id;
    }

    public void setTeacher_id(String teacher_id) {
        this.teacher_id = teacher_id;
    }

    public String getDay() {
        return Day;
    }

    public void setDay(String Day) {
        this.Day = Day;
    }

    public String getEntry_time() {
        return entry_time;
    }

    public void setEntry_time(String entry_time) {
        this.entry_time = entry_time;
    }

    public String getExit_time() {
        return exit_time;
    }

    public void setExit_time(String exit_time) {
        this.exit_time = exit_time;
    }
    
    
}
