package top.titov.schedule.adapter;

import android.databinding.DataBindingUtil;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.List;

import top.titov.schedule.databinding.LessonItemBinding;
import top.titov.schedule.model.Lesson;

/**
 * Created by Roman on 08.01.2016.
 */
public class LessonRVAdapter extends RecyclerView.Adapter<LessonRVAdapter.LessonViewHolder> {

    private List<Lesson> mItemList;

    public LessonRVAdapter(List<Lesson> pItems){
        mItemList = pItems;
    }



    @Override
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
    }

    public class LessonViewHolder extends RecyclerView.ViewHolder {

        LessonItemBinding binding;

        public LessonViewHolder(View v) {
            super(v);
            binding = DataBindingUtil.bind(v);
        }
    }
}
