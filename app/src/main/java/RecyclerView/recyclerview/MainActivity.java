package RecyclerView.recyclerview;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

import RecyclerView.recyclerview.Model.UserModel;
import butterknife.BindView;
import butterknife.ButterKnife;


public class MainActivity extends AppCompatActivity
{
    private LinearLayoutManager linearLayoutManager;
    private DividerItemDecoration dividerItemDecoration;
    private getAdapter adapter;
    private ArrayList<UserModel> userModels;

    //start_butter_knife
    @BindView(R.id.r_v)
    RecyclerView recyclerView;
    //end define_r_v

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //click Right to activity_main ---> Generate (choose = butter_knife_injections)
        ButterKnife.bind(this);
        //end_butter_knife

        initVS();

    }

    private void initVS()
    {
        linearLayoutManager = new LinearLayoutManager(getApplicationContext() , RecyclerView.VERTICAL , false);
        recyclerView.setLayoutManager(linearLayoutManager);
        dividerItemDecoration = new DividerItemDecoration(getApplicationContext() , DividerItemDecoration.VERTICAL);
        recyclerView.addItemDecoration(dividerItemDecoration);
        initLista();
    }

    private void initLista()
    {
        userModels = new ArrayList<>();
        userModels.add(new UserModel("Mostafa" ,"01552994735" , "Shubra El-Khema"));
        userModels.add(new UserModel("Mostafa" ,"01552994735" , "Shubra El-Khema"));
        userModels.add(new UserModel("Mostafa" ,"01552994735" , "Shubra El-Khema"));
        userModels.add(new UserModel("Mostafa" ,"01552994735" , "Shubra El-Khema"));
        userModels.add(new UserModel("Mostafa" ,"01552994735" , "Shubra El-Khema"));
        userModels.add(new UserModel("Mostafa" ,"01552994735" , "Shubra El-Khema"));
        userModels.add(new UserModel("Mostafa" ,"01552994735" , "Shubra El-Khema"));
        userModels.add(new UserModel("Mostafa" ,"01552994735" , "Shubra El-Khema"));
        userModels.add(new UserModel("Mostafa" ,"01552994735" , "Shubra El-Khema"));
        userModels.add(new UserModel("Mostafa" ,"01552994735" , "Shubra El-Khema"));
        userModels.add(new UserModel("Mostafa" ,"01552994735" , "Shubra El-Khema"));
        userModels.add(new UserModel("Mostafa" ,"01552994735" , "Shubra El-Khema"));
        userModels.add(new UserModel("Mostafa" ,"01552994735" , "Shubra El-Khema"));
        userModels.add(new UserModel("Mostafa" ,"01552994735" , "Shubra El-Khema"));
        userModels.add(new UserModel("Mostafa" ,"01552994735" , "Shubra El-Khema"));
        userModels.add(new UserModel("Mostafa" ,"01552994735" , "Shubra El-Khema"));
        userModels.add(new UserModel("Mostafa" ,"01552994735" , "Shubra El-Khema"));
        userModels.add(new UserModel("Mostafa" ,"01552994735" , "Shubra El-Khema"));
        userModels.add(new UserModel("Mostafa" ,"01552994735" , "Shubra El-Khema"));
        userModels.add(new UserModel("Mostafa" ,"01552994735" , "Shubra El-Khema"));
        userModels.add(new UserModel("Mostafa" ,"01552994735" , "Shubra El-Khema"));
        userModels.add(new UserModel("Mostafa" ,"01552994735" , "Shubra El-Khema"));
        userModels.add(new UserModel("Mostafa" ,"01552994735" , "Shubra El-Khema"));
        userModels.add(new UserModel("Mostafa" ,"01552994735" , "Shubra El-Khema"));
        userModels.add(new UserModel("Mostafa" ,"01552994735" , "Shubra El-Khema"));
        userModels.add(new UserModel("Mostafa" ,"01552994735" , "Shubra El-Khema"));
        userModels.add(new UserModel("Mostafa" ,"01552994735" , "Shubra El-Khema"));
        userModels.add(new UserModel("Mostafa" ,"01552994735" , "Shubra El-Khema"));
        userModels.add(new UserModel("Mostafa" ,"01552994735" , "Shubra El-Khema"));
        userModels.add(new UserModel("Mostafa" ,"01552994735" , "Shubra El-Khema"));
        userModels.add(new UserModel("Mostafa" ,"01552994735" , "Shubra El-Khema"));
        userModels.add(new UserModel("Mostafa" ,"01552994735" , "Shubra El-Khema"));
        userModels.add(new UserModel("Mostafa" ,"01552994735" , "Shubra El-Khema"));
        userModels.add(new UserModel("Mostafa" ,"01552994735" , "Shubra El-Khema"));
        userModels.add(new UserModel("Mostafa" ,"01552994735" , "Shubra El-Khema"));
        userModels.add(new UserModel("Mostafa" ,"01552994735" , "Shubra El-Khema"));
        userModels.add(new UserModel("Mostafa" ,"01552994735" , "Shubra El-Khema"));
        userModels.add(new UserModel("Mostafa" ,"01552994735" , "Shubra El-Khema"));
        userModels.add(new UserModel("Mostafa" ,"01552994735" , "Shubra El-Khema"));
        userModels.add(new UserModel("Mostafa" ,"01552994735" , "Shubra El-Khema"));
        userModels.add(new UserModel("Mostafa" ,"01552994735" , "Shubra El-Khema"));
        userModels.add(new UserModel("Mostafa" ,"01552994735" , "Shubra El-Khema"));
        userModels.add(new UserModel("Mostafa" ,"01552994735" , "Shubra El-Khema"));
        userModels.add(new UserModel("Mostafa" ,"01552994735" , "Shubra El-Khema"));
        userModels.add(new UserModel("Mostafa" ,"01552994735" , "Shubra El-Khema"));
        userModels.add(new UserModel("Mostafa" ,"01552994735" , "Shubra El-Khema"));
        userModels.add(new UserModel("Mostafa" ,"01552994735" , "Shubra El-Khema"));
        userModels.add(new UserModel("Mostafa" ,"01552994735" , "Shubra El-Khema"));
        userModels.add(new UserModel("Mostafa" ,"01552994735" , "Shubra El-Khema"));
        userModels.add(new UserModel("Mostafa" ,"01552994735" , "Shubra El-Khema"));
        userModels.add(new UserModel("Mostafa" ,"01552994735" , "Shubra El-Khema"));
        userModels.add(new UserModel("Mostafa" ,"01552994735" , "Shubra El-Khema"));
        userModels.add(new UserModel("Mostafa" ,"01552994735" , "Shubra El-Khema"));
        userModels.add(new UserModel("Mostafa" ,"01552994735" , "Shubra El-Khema"));
        userModels.add(new UserModel("Mostafa" ,"01552994735" , "Shubra El-Khema"));
        userModels.add(new UserModel("Mostafa" ,"01552994735" , "Shubra El-Khema"));
        userModels.add(new UserModel("Mostafa" ,"01552994735" , "Shubra El-Khema"));
        userModels.add(new UserModel("Mostafa" ,"01552994735" , "Shubra El-Khema"));
        userModels.add(new UserModel("Mostafa" ,"01552994735" , "Shubra El-Khema"));
        userModels.add(new UserModel("Mostafa" ,"01552994735" , "Shubra El-Khema"));
        userModels.add(new UserModel("Mostafa" ,"01552994735" , "Shubra El-Khema"));
        userModels.add(new UserModel("Mostafa" ,"01552994735" , "Shubra El-Khema"));
        userModels.add(new UserModel("Mostafa" ,"01552994735" , "Shubra El-Khema"));
        userModels.add(new UserModel("Mostafa" ,"01552994735" , "Shubra El-Khema"));
        userModels.add(new UserModel("Mostafa" ,"01552994735" , "Shubra El-Khema"));
        userModels.add(new UserModel("Mostafa" ,"01552994735" , "Shubra El-Khema"));
        userModels.add(new UserModel("Mostafa" ,"01552994735" , "Shubra El-Khema"));
        userModels.add(new UserModel("Mostafa" ,"01552994735" , "Shubra El-Khema"));
        userModels.add(new UserModel("Mostafa" ,"01552994735" , "Shubra El-Khema"));
        userModels.add(new UserModel("Mostafa" ,"01552994735" , "Shubra El-Khema"));
        userModels.add(new UserModel("Mostafa" ,"01552994735" , "Shubra El-Khema"));
        userModels.add(new UserModel("Mostafa" ,"01552994735" , "Shubra El-Khema"));
        userModels.add(new UserModel("Mostafa" ,"01552994735" , "Shubra El-Khema"));
        userModels.add(new UserModel("Mostafa" ,"01552994735" , "Shubra El-Khema"));
        userModels.add(new UserModel("Mostafa" ,"01552994735" , "Shubra El-Khema"));
        userModels.add(new UserModel("Mostafa" ,"01552994735" , "Shubra El-Khema"));
        userModels.add(new UserModel("Mostafa" ,"01552994735" , "Shubra El-Khema"));
        userModels.add(new UserModel("Mostafa" ,"01552994735" , "Shubra El-Khema"));
        userModels.add(new UserModel("Mostafa" ,"01552994735" , "Shubra El-Khema"));
        userModels.add(new UserModel("Mostafa" ,"01552994735" , "Shubra El-Khema"));
        userModels.add(new UserModel("Mostafa" ,"01552994735" , "Shubra El-Khema"));
        userModels.add(new UserModel("Mostafa" ,"01552994735" , "Shubra El-Khema"));
        userModels.add(new UserModel("Mostafa" ,"01552994735" , "Shubra El-Khema"));
        userModels.add(new UserModel("Mostafa" ,"01552994735" , "Shubra El-Khema"));
        userModels.add(new UserModel("Mostafa" ,"01552994735" , "Shubra El-Khema"));
        userModels.add(new UserModel("Mostafa" ,"01552994735" , "Shubra El-Khema"));
        userModels.add(new UserModel("Mostafa" ,"01552994735" , "Shubra El-Khema"));
        userModels.add(new UserModel("Mostafa" ,"01552994735" , "Shubra El-Khema"));
        userModels.add(new UserModel("Mostafa" ,"01552994735" , "Shubra El-Khema"));
        userModels.add(new UserModel("Mostafa" ,"01552994735" , "Shubra El-Khema"));
        userModels.add(new UserModel("Mostafa" ,"01552994735" , "Shubra El-Khema"));
        userModels.add(new UserModel("Mostafa" ,"01552994735" , "Shubra El-Khema"));
        userModels.add(new UserModel("Mostafa" ,"01552994735" , "Shubra El-Khema"));
        userModels.add(new UserModel("Mostafa" ,"01552994735" , "Shubra El-Khema"));
        userModels.add(new UserModel("Mostafa" ,"01552994735" , "Shubra El-Khema"));
        userModels.add(new UserModel("Mostafa" ,"01552994735" , "Shubra El-Khema"));
        userModels.add(new UserModel("Mostafa" ,"01552994735" , "Shubra El-Khema"));
        userModels.add(new UserModel("Mostafa" ,"01552994735" , "Shubra El-Khema"));
        userModels.add(new UserModel("Mostafa" ,"01552994735" , "Shubra El-Khema"));
        userModels.add(new UserModel("Mostafa" ,"01552994735" , "Shubra El-Khema"));
        userModels.add(new UserModel("Mostafa" ,"01552994735" , "Shubra El-Khema"));
        userModels.add(new UserModel("Mostafa" ,"01552994735" , "Shubra El-Khema"));
        userModels.add(new UserModel("Mostafa" ,"01552994735" , "Shubra El-Khema"));
        userModels.add(new UserModel("Mostafa" ,"01552994735" , "Shubra El-Khema"));
        userModels.add(new UserModel("Mostafa" ,"01552994735" , "Shubra El-Khema"));
        userModels.add(new UserModel("Mostafa" ,"01552994735" , "Shubra El-Khema"));
        userModels.add(new UserModel("Mostafa" ,"01552994735" , "Shubra El-Khema"));
        userModels.add(new UserModel("Mostafa" ,"01552994735" , "Shubra El-Khema"));
        userModels.add(new UserModel("Mostafa" ,"01552994735" , "Shubra El-Khema"));
        userModels.add(new UserModel("Mostafa" ,"01552994735" , "Shubra El-Khema"));
        userModels.add(new UserModel("Mostafa" ,"01552994735" , "Shubra El-Khema"));
        userModels.add(new UserModel("Mostafa" ,"01552994735" , "Shubra El-Khema"));
        userModels.add(new UserModel("Mostafa" ,"01552994735" , "Shubra El-Khema"));
        userModels.add(new UserModel("Mostafa" ,"01552994735" , "Shubra El-Khema"));
        userModels.add(new UserModel("Mostafa" ,"01552994735" , "Shubra El-Khema"));
        userModels.add(new UserModel("Mostafa" ,"01552994735" , "Shubra El-Khema"));
        userModels.add(new UserModel("Mostafa" ,"01552994735" , "Shubra El-Khema"));
        userModels.add(new UserModel("Mostafa" ,"01552994735" , "Shubra El-Khema"));
        userModels.add(new UserModel("Mostafa" ,"01552994735" , "Shubra El-Khema"));
        userModels.add(new UserModel("Mostafa" ,"01552994735" , "Shubra El-Khema"));
        userModels.add(new UserModel("Mostafa" ,"01552994735" , "Shubra El-Khema"));
        userModels.add(new UserModel("Mostafa" ,"01552994735" , "Shubra El-Khema"));
        userModels.add(new UserModel("Mostafa" ,"01552994735" , "Shubra El-Khema"));
        userModels.add(new UserModel("Mostafa" ,"01552994735" , "Shubra El-Khema"));
        userModels.add(new UserModel("Mostafa" ,"01552994735" , "Shubra El-Khema"));
        userModels.add(new UserModel("Mostafa" ,"01552994735" , "Shubra El-Khema"));
        userModels.add(new UserModel("Mostafa" ,"01552994735" , "Shubra El-Khema"));
        userModels.add(new UserModel("Mostafa" ,"01552994735" , "Shubra El-Khema"));
        userModels.add(new UserModel("Mostafa" ,"01552994735" , "Shubra El-Khema"));
        userModels.add(new UserModel("Mostafa" ,"01552994735" , "Shubra El-Khema"));
        userModels.add(new UserModel("Mostafa" ,"01552994735" , "Shubra El-Khema"));
        userModels.add(new UserModel("Mostafa" ,"01552994735" , "Shubra El-Khema"));
        userModels.add(new UserModel("Mostafa" ,"01552994735" , "Shubra El-Khema"));
        userModels.add(new UserModel("Mostafa" ,"01552994735" , "Shubra El-Khema"));
        userModels.add(new UserModel("Mostafa" ,"01552994735" , "Shubra El-Khema"));
        userModels.add(new UserModel("Mostafa" ,"01552994735" , "Shubra El-Khema"));
        userModels.add(new UserModel("Mostafa" ,"01552994735" , "Shubra El-Khema"));
        userModels.add(new UserModel("Mostafa" ,"01552994735" , "Shubra El-Khema"));
        userModels.add(new UserModel("Mostafa" ,"01552994735" , "Shubra El-Khema"));
        userModels.add(new UserModel("Mostafa" ,"01552994735" , "Shubra El-Khema"));
        userModels.add(new UserModel("Mostafa" ,"01552994735" , "Shubra El-Khema"));
        userModels.add(new UserModel("Mostafa" ,"01552994735" , "Shubra El-Khema"));
        userModels.add(new UserModel("Mostafa" ,"01552994735" , "Shubra El-Khema"));
        userModels.add(new UserModel("Mostafa" ,"01552994735" , "Shubra El-Khema"));
        userModels.add(new UserModel("Mostafa" ,"01552994735" , "Shubra El-Khema"));
        userModels.add(new UserModel("Mostafa" ,"01552994735" , "Shubra El-Khema"));
        userModels.add(new UserModel("Mostafa" ,"01552994735" , "Shubra El-Khema"));
        userModels.add(new UserModel("Mostafa" ,"01552994735" , "Shubra El-Khema"));
        userModels.add(new UserModel("Mostafa" ,"01552994735" , "Shubra El-Khema"));
        userModels.add(new UserModel("Mostafa" ,"01552994735" , "Shubra El-Khema"));
        userModels.add(new UserModel("Mostafa" ,"01552994735" , "Shubra El-Khema"));
        userModels.add(new UserModel("Mostafa" ,"01552994735" , "Shubra El-Khema"));
        userModels.add(new UserModel("Mostafa" ,"01552994735" , "Shubra El-Khema"));
        userModels.add(new UserModel("Mostafa" ,"01552994735" , "Shubra El-Khema"));
        userModels.add(new UserModel("Mostafa" ,"01552994735" , "Shubra El-Khema"));
        userModels.add(new UserModel("Mostafa" ,"01552994735" , "Shubra El-Khema"));
        userModels.add(new UserModel("Mostafa" ,"01552994735" , "Shubra El-Khema"));
        userModels.add(new UserModel("Mostafa" ,"01552994735" , "Shubra El-Khema"));
        userModels.add(new UserModel("Mostafa" ,"01552994735" , "Shubra El-Khema"));
        userModels.add(new UserModel("Mostafa" ,"01552994735" , "Shubra El-Khema"));
        userModels.add(new UserModel("Mostafa" ,"01552994735" , "Shubra El-Khema"));
        userModels.add(new UserModel("Mostafa" ,"01552994735" , "Shubra El-Khema"));
        userModels.add(new UserModel("Mostafa" ,"01552994735" , "Shubra El-Khema"));
        userModels.add(new UserModel("Mostafa" ,"01552994735" , "Shubra El-Khema"));
        userModels.add(new UserModel("Mostafa" ,"01552994735" , "Shubra El-Khema"));
        userModels.add(new UserModel("Mostafa" ,"01552994735" , "Shubra El-Khema"));
        userModels.add(new UserModel("Mostafa" ,"01552994735" , "Shubra El-Khema"));
        userModels.add(new UserModel("Mostafa" ,"01552994735" , "Shubra El-Khema"));
        userModels.add(new UserModel("Mostafa" ,"01552994735" , "Shubra El-Khema"));
        userModels.add(new UserModel("Mostafa" ,"01552994735" , "Shubra El-Khema"));
        userModels.add(new UserModel("Mostafa" ,"01552994735" , "Shubra El-Khema"));
        userModels.add(new UserModel("Mostafa" ,"01552994735" , "Shubra El-Khema"));
        userModels.add(new UserModel("Mostafa" ,"01552994735" , "Shubra El-Khema"));
        userModels.add(new UserModel("Mostafa" ,"01552994735" , "Shubra El-Khema"));
        userModels.add(new UserModel("Mostafa" ,"01552994735" , "Shubra El-Khema"));
        userModels.add(new UserModel("Mostafa" ,"01552994735" , "Shubra El-Khema"));
        userModels.add(new UserModel("Mostafa" ,"01552994735" , "Shubra El-Khema"));
        userModels.add(new UserModel("Mostafa" ,"01552994735" , "Shubra El-Khema"));
        userModels.add(new UserModel("Mostafa" ,"01552994735" , "Shubra El-Khema"));
        userModels.add(new UserModel("Mostafa" ,"01552994735" , "Shubra El-Khema"));
        userModels.add(new UserModel("Mostafa" ,"01552994735" , "Shubra El-Khema"));
        userModels.add(new UserModel("Mostafa" ,"01552994735" , "Shubra El-Khema"));
        userModels.add(new UserModel("Mostafa" ,"01552994735" , "Shubra El-Khema"));
        userModels.add(new UserModel("Mostafa" ,"01552994735" , "Shubra El-Khema"));
        userModels.add(new UserModel("Mostafa" ,"01552994735" , "Shubra El-Khema"));
        userModels.add(new UserModel("Mostafa" ,"01552994735" , "Shubra El-Khema"));
        userModels.add(new UserModel("Mostafa" ,"01552994735" , "Shubra El-Khema"));
        userModels.add(new UserModel("Mostafa" ,"01552994735" , "Shubra El-Khema"));
        userModels.add(new UserModel("Mostafa" ,"01552994735" , "Shubra El-Khema"));
        userModels.add(new UserModel("Mostafa" ,"01552994735" , "Shubra El-Khema"));
        userModels.add(new UserModel("Mostafa" ,"01552994735" , "Shubra El-Khema"));
        userModels.add(new UserModel("Mostafa" ,"01552994735" , "Shubra El-Khema"));
        userModels.add(new UserModel("Mostafa" ,"01552994735" , "Shubra El-Khema"));
        userModels.add(new UserModel("Mostafa" ,"01552994735" , "Shubra El-Khema"));
        userModels.add(new UserModel("Mostafa" ,"01552994735" , "Shubra El-Khema"));
        userModels.add(new UserModel("Mostafa" ,"01552994735" , "Shubra El-Khema"));
        userModels.add(new UserModel("Mostafa" ,"01552994735" , "Shubra El-Khema"));
        userModels.add(new UserModel("Mostafa" ,"01552994735" , "Shubra El-Khema"));
        userModels.add(new UserModel("Mostafa" ,"01552994735" , "Shubra El-Khema"));
        userModels.add(new UserModel("Mostafa" ,"01552994735" , "Shubra El-Khema"));
        userModels.add(new UserModel("Mostafa" ,"01552994735" , "Shubra El-Khema"));
        userModels.add(new UserModel("Mostafa" ,"01552994735" , "Shubra El-Khema"));
        userModels.add(new UserModel("Mostafa" ,"01552994735" , "Shubra El-Khema"));
        userModels.add(new UserModel("Mostafa" ,"01552994735" , "Shubra El-Khema"));
        userModels.add(new UserModel("Mostafa" ,"01552994735" , "Shubra El-Khema"));
        userModels.add(new UserModel("Mostafa" ,"01552994735" , "Shubra El-Khema"));
        userModels.add(new UserModel("Mostafa" ,"01552994735" , "Shubra El-Khema"));
        userModels.add(new UserModel("Mostafa" ,"01552994735" , "Shubra El-Khema"));
        userModels.add(new UserModel("Mostafa" ,"01552994735" , "Shubra El-Khema"));
        userModels.add(new UserModel("Mostafa" ,"01552994735" , "Shubra El-Khema"));
        userModels.add(new UserModel("Mostafa" ,"01552994735" , "Shubra El-Khema"));
        userModels.add(new UserModel("Mostafa" ,"01552994735" , "Shubra El-Khema"));
        userModels.add(new UserModel("Mostafa" ,"01552994735" , "Shubra El-Khema"));
        userModels.add(new UserModel("Mostafa" ,"01552994735" , "Shubra El-Khema"));
        userModels.add(new UserModel("Mostafa" ,"01552994735" , "Shubra El-Khema"));
        userModels.add(new UserModel("Mostafa" ,"01552994735" , "Shubra El-Khema"));
        userModels.add(new UserModel("Mostafa" ,"01552994735" , "Shubra El-Khema"));
        userModels.add(new UserModel("Mostafa" ,"01552994735" , "Shubra El-Khema"));
        userModels.add(new UserModel("Mostafa" ,"01552994735" , "Shubra El-Khema"));
        userModels.add(new UserModel("Mostafa" ,"01552994735" , "Shubra El-Khema"));
        userModels.add(new UserModel("Mostafa" ,"01552994735" , "Shubra El-Khema"));
        userModels.add(new UserModel("Mostafa" ,"01552994735" , "Shubra El-Khema"));
        userModels.add(new UserModel("Mostafa" ,"01552994735" , "Shubra El-Khema"));
        userModels.add(new UserModel("Mostafa" ,"01552994735" , "Shubra El-Khema"));
        userModels.add(new UserModel("Mostafa" ,"01552994735" , "Shubra El-Khema"));
        userModels.add(new UserModel("Mostafa" ,"01552994735" , "Shubra El-Khema"));
        userModels.add(new UserModel("Mostafa" ,"01552994735" , "Shubra El-Khema"));
        userModels.add(new UserModel("Mostafa" ,"01552994735" , "Shubra El-Khema"));
        userModels.add(new UserModel("Mostafa" ,"01552994735" , "Shubra El-Khema"));
        userModels.add(new UserModel("Mostafa" ,"01552994735" , "Shubra El-Khema"));
        userModels.add(new UserModel("Mostafa" ,"01552994735" , "Shubra El-Khema"));
        userModels.add(new UserModel("Mostafa" ,"01552994735" , "Shubra El-Khema"));
        userModels.add(new UserModel("Mostafa" ,"01552994735" , "Shubra El-Khema"));
        userModels.add(new UserModel("Mostafa" ,"01552994735" , "Shubra El-Khema"));
        userModels.add(new UserModel("Mostafa" ,"01552994735" , "Shubra El-Khema"));
        userModels.add(new UserModel("Mostafa" ,"01552994735" , "Shubra El-Khema"));
        userModels.add(new UserModel("Mostafa" ,"01552994735" , "Shubra El-Khema"));
        userModels.add(new UserModel("Mostafa" ,"01552994735" , "Shubra El-Khema"));
        userModels.add(new UserModel("Mostafa" ,"01552994735" , "Shubra El-Khema"));
        userModels.add(new UserModel("Mostafa" ,"01552994735" , "Shubra El-Khema"));
        userModels.add(new UserModel("Mostafa" ,"01552994735" , "Shubra El-Khema"));
        userModels.add(new UserModel("Mostafa" ,"01552994735" , "Shubra El-Khema"));
        userModels.add(new UserModel("Mostafa" ,"01552994735" , "Shubra El-Khema"));
        userModels.add(new UserModel("Mostafa" ,"01552994735" , "Shubra El-Khema"));
        userModels.add(new UserModel("Mostafa" ,"01552994735" , "Shubra El-Khema"));
        userModels.add(new UserModel("Mostafa" ,"01552994735" , "Shubra El-Khema"));
        userModels.add(new UserModel("Mostafa" ,"01552994735" , "Shubra El-Khema"));
        userModels.add(new UserModel("Mostafa" ,"01552994735" , "Shubra El-Khema"));
        userModels.add(new UserModel("Mostafa" ,"01552994735" , "Shubra El-Khema"));
        userModels.add(new UserModel("Mostafa" ,"01552994735" , "Shubra El-Khema"));
        userModels.add(new UserModel("Mostafa" ,"01552994735" , "Shubra El-Khema"));
        userModels.add(new UserModel("Mostafa" ,"01552994735" , "Shubra El-Khema"));
        userModels.add(new UserModel("Mostafa" ,"01552994735" , "Shubra El-Khema"));
        userModels.add(new UserModel("Mostafa" ,"01552994735" , "Shubra El-Khema"));
        userModels.add(new UserModel("Mostafa" ,"01552994735" , "Shubra El-Khema"));
        userModels.add(new UserModel("Mostafa" ,"01552994735" , "Shubra El-Khema"));
        userModels.add(new UserModel("Mostafa" ,"01552994735" , "Shubra El-Khema"));
        userModels.add(new UserModel("Mostafa" ,"01552994735" , "Shubra El-Khema"));
        userModels.add(new UserModel("Mostafa" ,"01552994735" , "Shubra El-Khema"));
        userModels.add(new UserModel("Mostafa" ,"01552994735" , "Shubra El-Khema"));
        userModels.add(new UserModel("Mostafa" ,"01552994735" , "Shubra El-Khema"));
        userModels.add(new UserModel("Mostafa" ,"01552994735" , "Shubra El-Khema"));
        userModels.add(new UserModel("Mostafa" ,"01552994735" , "Shubra El-Khema"));
        userModels.add(new UserModel("Mostafa" ,"01552994735" , "Shubra El-Khema"));
        userModels.add(new UserModel("Mostafa" ,"01552994735" , "Shubra El-Khema"));
        userModels.add(new UserModel("Mostafa" ,"01552994735" , "Shubra El-Khema"));
        userModels.add(new UserModel("Mostafa" ,"01552994735" , "Shubra El-Khema"));
        userModels.add(new UserModel("Mostafa" ,"01552994735" , "Shubra El-Khema"));
        userModels.add(new UserModel("Mostafa" ,"01552994735" , "Shubra El-Khema"));
        userModels.add(new UserModel("Mostafa" ,"01552994735" , "Shubra El-Khema"));
        userModels.add(new UserModel("Mostafa" ,"01552994735" , "Shubra El-Khema"));
        userModels.add(new UserModel("Mostafa" ,"01552994735" , "Shubra El-Khema"));
        userModels.add(new UserModel("Mostafa" ,"01552994735" , "Shubra El-Khema"));
        userModels.add(new UserModel("Mostafa" ,"01552994735" , "Shubra El-Khema"));
        userModels.add(new UserModel("Mostafa" ,"01552994735" , "Shubra El-Khema"));
        userModels.add(new UserModel("Mostafa" ,"01552994735" , "Shubra El-Khema"));
        userModels.add(new UserModel("Mostafa" ,"01552994735" , "Shubra El-Khema"));
        userModels.add(new UserModel("Mostafa" ,"01552994735" , "Shubra El-Khema"));
        userModels.add(new UserModel("Mostafa" ,"01552994735" , "Shubra El-Khema"));
        userModels.add(new UserModel("Mostafa" ,"01552994735" , "Shubra El-Khema"));
        userModels.add(new UserModel("Mostafa" ,"01552994735" , "Shubra El-Khema"));
        userModels.add(new UserModel("Mostafa" ,"01552994735" , "Shubra El-Khema"));
        userModels.add(new UserModel("Mostafa" ,"01552994735" , "Shubra El-Khema"));
        userModels.add(new UserModel("Mostafa" ,"01552994735" , "Shubra El-Khema"));
        userModels.add(new UserModel("Mostafa" ,"01552994735" , "Shubra El-Khema"));
        userModels.add(new UserModel("Mostafa" ,"01552994735" , "Shubra El-Khema"));
        userModels.add(new UserModel("Mostafa" ,"01552994735" , "Shubra El-Khema"));
        userModels.add(new UserModel("Mostafa" ,"01552994735" , "Shubra El-Khema"));
        userModels.add(new UserModel("Mostafa" ,"01552994735" , "Shubra El-Khema"));
        userModels.add(new UserModel("Mostafa" ,"01552994735" , "Shubra El-Khema"));
        userModels.add(new UserModel("Mostafa" ,"01552994735" , "Shubra El-Khema"));
        userModels.add(new UserModel("Mostafa" ,"01552994735" , "Shubra El-Khema"));
        userModels.add(new UserModel("Mostafa" ,"01552994735" , "Shubra El-Khema"));
        userModels.add(new UserModel("Mostafa" ,"01552994735" , "Shubra El-Khema"));
        userModels.add(new UserModel("Mostafa" ,"01552994735" , "Shubra El-Khema"));
        userModels.add(new UserModel("Mostafa" ,"01552994735" , "Shubra El-Khema"));
        userModels.add(new UserModel("Mostafa" ,"01552994735" , "Shubra El-Khema"));
        userModels.add(new UserModel("Mostafa" ,"01552994735" , "Shubra El-Khema"));
        userModels.add(new UserModel("Mostafa" ,"01552994735" , "Shubra El-Khema"));
        userModels.add(new UserModel("Mostafa" ,"01552994735" , "Shubra El-Khema"));
        userModels.add(new UserModel("Mostafa" ,"01552994735" , "Shubra El-Khema"));
        userModels.add(new UserModel("Mostafa" ,"01552994735" , "Shubra El-Khema"));
        userModels.add(new UserModel("Mostafa" ,"01552994735" , "Shubra El-Khema"));
        userModels.add(new UserModel("Mostafa" ,"01552994735" , "Shubra El-Khema"));
        userModels.add(new UserModel("Mostafa" ,"01552994735" , "Shubra El-Khema"));
        userModels.add(new UserModel("Mostafa" ,"01552994735" , "Shubra El-Khema"));
        userModels.add(new UserModel("Mostafa" ,"01552994735" , "Shubra El-Khema"));
        userModels.add(new UserModel("Mostafa" ,"01552994735" , "Shubra El-Khema"));
        userModels.add(new UserModel("Mostafa" ,"01552994735" , "Shubra El-Khema"));
        userModels.add(new UserModel("Mostafa" ,"01552994735" , "Shubra El-Khema"));
        userModels.add(new UserModel("Mostafa" ,"01552994735" , "Shubra El-Khema"));
        userModels.add(new UserModel("Mostafa" ,"01552994735" , "Shubra El-Khema"));
        userModels.add(new UserModel("Mostafa" ,"01552994735" , "Shubra El-Khema"));
        userModels.add(new UserModel("Mostafa" ,"01552994735" , "Shubra El-Khema"));
        userModels.add(new UserModel("Mostafa" ,"01552994735" , "Shubra El-Khema"));
        userModels.add(new UserModel("Mostafa" ,"01552994735" , "Shubra El-Khema"));
        userModels.add(new UserModel("Mostafa" ,"01552994735" , "Shubra El-Khema"));
        userModels.add(new UserModel("Mostafa" ,"01552994735" , "Shubra El-Khema"));
        userModels.add(new UserModel("Mostafa" ,"01552994735" , "Shubra El-Khema"));
        userModels.add(new UserModel("Mostafa" ,"01552994735" , "Shubra El-Khema"));
        userModels.add(new UserModel("Mostafa" ,"01552994735" , "Shubra El-Khema"));
        userModels.add(new UserModel("Mostafa" ,"01552994735" , "Shubra El-Khema"));
        userModels.add(new UserModel("Mostafa" ,"01552994735" , "Shubra El-Khema"));
        userModels.add(new UserModel("Mostafa" ,"01552994735" , "Shubra El-Khema"));
        userModels.add(new UserModel("Mostafa" ,"01552994735" , "Shubra El-Khema"));
        userModels.add(new UserModel("Mostafa" ,"01552994735" , "Shubra El-Khema"));
        userModels.add(new UserModel("Mostafa" ,"01552994735" , "Shubra El-Khema"));
        userModels.add(new UserModel("Mostafa" ,"01552994735" , "Shubra El-Khema"));
        userModels.add(new UserModel("Mostafa" ,"01552994735" , "Shubra El-Khema"));
        userModels.add(new UserModel("Mostafa" ,"01552994735" , "Shubra El-Khema"));
        userModels.add(new UserModel("Mostafa" ,"01552994735" , "Shubra El-Khema"));
        userModels.add(new UserModel("Mostafa" ,"01552994735" , "Shubra El-Khema"));
        userModels.add(new UserModel("Mostafa" ,"01552994735" , "Shubra El-Khema"));
        userModels.add(new UserModel("Mostafa" ,"01552994735" , "Shubra El-Khema"));
        userModels.add(new UserModel("Mostafa" ,"01552994735" , "Shubra El-Khema"));
        userModels.add(new UserModel("Mostafa" ,"01552994735" , "Shubra El-Khema"));

        adapter = new getAdapter(userModels);
        recyclerView.setAdapter(adapter);


    }

    private class getAdapter extends RecyclerView.Adapter<getAdapter.getVH>
    {
        ArrayList<UserModel> userModels;

        public getAdapter(ArrayList<UserModel> userModels)
        {
            this.userModels = userModels;
        }

        @NonNull
        @Override
        public getVH onCreateViewHolder(@NonNull ViewGroup parent, int viewType)
        {
            View item_view = LayoutInflater.from(getApplicationContext()) .inflate(R.layout.item , parent , false);
            return new getVH(item_view);
        }

        @Override
        public void onBindViewHolder(@NonNull getVH holder, int position)
        {
           UserModel model = userModels.get(position);
           holder.text_name.setText(model.getName());
           holder.text_phone.setText(model.getPhone());
           holder.text_address.setText(model.getAddress());
        }

        @Override
        public int getItemCount()
        {
            return userModels.size();
        }

        private class getVH extends RecyclerView.ViewHolder
        {

            private TextView text_name,text_phone,text_address;

            public getVH(@NonNull View itemView)
            {
                super(itemView);

                text_name = itemView.findViewById(R.id.text_view_name);
                text_phone = itemView.findViewById(R.id.text_view_phone);
                text_address = itemView.findViewById(R.id.text_view_address);
            }
        }
    }
}
