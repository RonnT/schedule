package top.titov.schedule.helper;

/**
 * Created by Ron on 13.02.2016.
 */
public class LessonHelper {

    public static String getLessonTime(int pNumber){
        String result;
        switch (pNumber){
            case 1:
                result = "9:00 - 10:30";
                break;
            case 2:
                result = "10:40 - 12:10";
                break;
            case 3:
                result = "12:20 - 13:50";
                break;
            case 4:
                result = "14:30 - 16:00";
                break;
            case 5:
                result = "16:10 - 17:40";
                break;
            case 6:
                result = "16:10 - 17:40";
                break;
            case 7:
                result = "17:50 - 19:20";
                break;
            case 8:
                result = "19:30 - 21:00";
                break;
            default:
                result = "Wrong lesson number!";
        }
        return result;
    }
}
