package top.titov.schedule.adapter;

import android.app.Application;
import android.databinding.DataBindingUtil;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.marshalchen.ultimaterecyclerview.UltimateRecyclerView;
import com.marshalchen.ultimaterecyclerview.UltimateRecyclerviewViewHolder;
import com.marshalchen.ultimaterecyclerview.UltimateViewAdapter;

import java.util.ArrayList;
import java.util.List;

import top.titov.schedule.databinding.LessonItemBinding;
import top.titov.schedule.model.Lesson;

/**
 * Created by Roman on 08.01.2016.
 */
public class LessonRVAdapter extends UltimateViewAdapter<LessonRVAdapter.LessonViewHolder> {

    private List<Lesson> mItemList = new ArrayList<>();

    @Override
    public LessonViewHolder getViewHolder(View view) {
        return new LessonViewHolder(view, false);
    }

    @Override
    public LessonViewHolder onCreateViewHolder(ViewGroup viewGroup) {
        LayoutInflater inflater = LayoutInflater.from(viewGroup.getContext());
        LessonItemBinding binding = LessonItemBinding.inflate(inflater, viewGroup, false);
        return new LessonViewHolder(binding.getRoot(), true);
    }

    public void insert(List<Lesson> pItemList){
        insertInternal(pItemList, mItemList);
    }


    @Override
    public int getAdapterItemCount() {
        return mItemList.size();
    }

    @Override
    public long generateHeaderId(int i) {
        return 0;
    }

    @Override
    public void onBindViewHolder(LessonViewHolder holder, int position) {
        Lesson lesson = mItemList.get(position);
        holder.binding.setLesson(lesson);
    }

    @Override
    public RecyclerView.ViewHolder onCreateHeaderViewHolder(ViewGroup viewGroup) {
        return null;
    }

    @Override
    public void onBindHeaderViewHolder(RecyclerView.ViewHolder viewHolder, int i) {

    }

/*    @Override
    public LessonViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        LessonItemBinding binding = LessonItemBinding.inflate(inflater, parent, false);
        return new LessonViewHolder(binding.getRoot());
    }

    @Override
    public void onBindViewHolder(LessonViewHolder holder, int position) {
        Lesson lesson = mItemList.get(position);
        holder.binding.setLesson(lesson);
    }

    @Override
    public int getItemCount() {
        return 0;
    }*/

    public class LessonViewHolder extends UltimateRecyclerviewViewHolder {

        private LessonItemBinding binding;

        public LessonViewHolder(View itemView, boolean isItem) {
            super(itemView);
            if (isItem) {
                binding = DataBindingUtil.bind(itemView);
            }
        }

/*        LessonItemBinding binding;

        public LessonViewHolder(View v) {
            super(v);
            binding = DataBindingUtil.bind(v);
        }*/
    }
}
