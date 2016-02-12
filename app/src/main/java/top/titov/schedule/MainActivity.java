package top.titov.schedule;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.List;

import top.titov.schedule.model.Lesson;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        List<Lesson> lessonList = new ArrayList<>();
        lessonList.add(new Lesson("19.01.16",1,"Алгоритмы и СД","Иванов И.И."));
        lessonList.add(new Lesson("19.01.16",2,"ООП","Петров И.И."));
        lessonList.add(new Lesson("19.01.16",3,"Информатика","Сидоров И.И."));
        lessonList.add(new Lesson("19.01.16", 4, "Социология", "Толстокоров И.И."));
        lessonList.add(new Lesson("19.01.16", 5, "Философия", "Самсонов И.И."));
        lessonList.add(new Lesson("19.01.16",1,"Алгоритмы и СД","Иванов И.И."));
        lessonList.add(new Lesson("19.01.16",2,"ООП","Петров И.И."));
        lessonList.add(new Lesson("19.01.16",3,"Информатика","Сидоров И.И."));
        lessonList.add(new Lesson("19.01.16",4,"Социология","Толстокоров И.И."));
        lessonList.add(new Lesson("19.01.16",5,"Философия","Самсонов И.И."));
        lessonList.add(new Lesson("19.01.16",1,"Алгоритмы и СД","Иванов И.И."));
        lessonList.add(new Lesson("19.01.16",2,"ООП","Петров И.И."));
        lessonList.add(new Lesson("19.01.16",3,"Информатика","Сидоров И.И."));
        lessonList.add(new Lesson("19.01.16",4,"Социология","Толстокоров И.И."));
        lessonList.add(new Lesson("19.01.16",5,"Философия","Самсонов И.И."));
    }
}
