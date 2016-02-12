package top.titov.schedule.model;

import top.titov.schedule.helper.LessonHelper;

/**
 * Created by Roman on 07.01.2016.
 */
public class Lesson {
    private String date;
    private int number;
    private String name;
    private String lecturer;

    public Lesson(String pDate, int pNumber, String pName, String pLecturer){
        date = pDate;
        number = pNumber;
        name = pName;
        lecturer = pLecturer;
    }

    public Lesson(){}

    public String getDate() {
        return date;
    }

    public int getNumber() {
        return number;
    }

    public String getName() {
        return name;
    }

    public String getLecturer() {
        return lecturer;
    }

    public String getTime(){
        return LessonHelper.getLessonTime(number);
    }
}
