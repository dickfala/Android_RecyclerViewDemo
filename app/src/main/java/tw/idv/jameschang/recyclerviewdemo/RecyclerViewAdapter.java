package tw.idv.jameschang.recyclerviewdemo;

import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by cyy on 2017/12/5.
 */

public class RecyclerViewAdapter  extends RecyclerView.Adapter<RecyclerViewAdapter.ViewHolder>{

    private static final String TAG = RecyclerViewAdapter.class.getSimpleName();
    ArrayList<UserModel> userListData;
    public RecyclerViewAdapter(ArrayList<UserModel> userData) {

        userListData = userData;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.info_item,parent,false);
        ViewHolder holder = new ViewHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {

        String account = userListData.get(position).getAccount();
        String sport = userListData.get(position).getSport();
        int age = userListData.get(position).getAge();
        String sex = userListData.get(position).getSex();

        UserModel userModel = new UserModel(account,sport,sex,age);

        holder.account.setText(userModel.getAccount());
        holder.sport.setText(userModel.getSport());
        holder.sex.setText(userModel.getSex());
        holder.age.setText(userModel.getAge()+"");
    }

    @Override
    public int getItemCount() {
        Log.d(TAG, "getItemCount: " + userListData);
        return userListData.size();
    }

    public static  class ViewHolder extends RecyclerView.ViewHolder{

        private final TextView account;
        private final TextView age;
        private final TextView sport;
        private final TextView sex;

        public ViewHolder(View itemView) {
            super(itemView);
            account = itemView.findViewById(R.id.acount);
            age = itemView.findViewById(R.id.age);
            sport = itemView.findViewById(R.id.sport);
            sex = itemView.findViewById(R.id.sex);
        }
    }
}
