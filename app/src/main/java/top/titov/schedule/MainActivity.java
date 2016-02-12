package top.titov.schedule;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.view.View;
import android.widget.Toast;

import com.marshalchen.ultimaterecyclerview.UltimateRecyclerView;

import java.util.ArrayList;
import java.util.List;

import top.titov.schedule.adapter.LessonRVAdapter;
import top.titov.schedule.model.Lesson;

public class MainActivity extends AppCompatActivity {

    private UltimateRecyclerView mRecyclerView;
    private LessonRVAdapter mAdapter;

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
        lessonList.add(new Lesson("20.01.16",1,"Алгоритмы и СД","Иванов И.И."));
        lessonList.add(new Lesson("20.01.16",2,"ООП","Петров И.И."));
        lessonList.add(new Lesson("20.01.16",3,"Информатика","Сидоров И.И."));
        lessonList.add(new Lesson("20.01.16",4,"Социология","Толстокоров И.И."));
        lessonList.add(new Lesson("20.01.16",5,"Философия","Самсонов И.И."));
        lessonList.add(new Lesson("21.01.16",1,"Алгоритмы и СД","Иванов И.И."));
        lessonList.add(new Lesson("21.01.16",2,"ООП","Петров И.И."));
        lessonList.add(new Lesson("21.01.16",3,"Информатика","Сидоров И.И."));
        lessonList.add(new Lesson("21.01.16",4,"Социология","Толстокоров И.И."));
        lessonList.add(new Lesson("21.01.16",5,"Философия","Самсонов И.И."));

        mAdapter = new LessonRVAdapter();
        initRecyclerView();

        mAdapter.insert(lessonList);
        Toast.makeText(this, String.valueOf(mAdapter.getAdapterItemCount()), Toast.LENGTH_LONG);

    }

    private void initRecyclerView(){
        mRecyclerView = (UltimateRecyclerView) findViewById(R.id.activity_recyclerview);

        mRecyclerView.setLayoutManager(new LinearLayoutManager(mRecyclerView.getContext()));
        mRecyclerView.setAdapter(mAdapter);
        //mRecyclerView.setDefaultOnRefreshListener(this);
       /* mAdapter.setCustomLoadMoreView(LayoutInflater.from(getActivity())
                .inflate(R.layout.view_load_more, null));*/
        //mRecyclerView.enableLoadmore();
        //mRecyclerView.setOnLoadMoreListener(this);
        mRecyclerView.showLoadMoreItemNum = 11;
        mRecyclerView.hideEmptyView();
    }

    public void onFabClick(View v){
        Toast.makeText(this,"Fab clicked", Toast.LENGTH_LONG);
    }
}
