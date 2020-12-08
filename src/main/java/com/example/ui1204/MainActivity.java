package com.example.ui1204;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;

import com.example.ui1204.ui.dashboard.DashboardViewModel;
import com.google.android.material.bottomnavigation.BottomNavigationView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class MainActivity extends AppCompatActivity {

    private ListView listView;
    //private List<Map<String,Object>> dataList = new ArrayList<Map<String,Object>>();
    //private int[] itemIdArr = new int[]{R.id.it1,R.id.it2,R.id.it3};
    //private String[] dataKayArr = new String[]{"name","time","text"};
    private String[] it1 = {"lily","nana","amy"};
    private String[] it2 = {"18309999","18306666","18308888"};
    private String[] it3 = {"qweqweqweqwe","rtyrtyrtyrty","uiouiouiouio"};
    private List<User> userList = new ArrayList<User>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        BottomNavigationView navView = findViewById(R.id.nav_view);
        // Passing each menu ID as a set of Ids because each
        // menu should be considered as top level destinations.
        AppBarConfiguration appBarConfiguration = new AppBarConfiguration.Builder(
                R.id.navigation_home, R.id.navigation_dashboard, R.id.navigation_notifications)
                .build();
        NavController navController = Navigation.findNavController(this, R.id.nav_host_fragment);
        NavigationUI.setupActionBarWithNavController(this, navController, appBarConfiguration);
        NavigationUI.setupWithNavController(navView, navController);
/*
        initUsers();
        UsersAdapter adapter = new UsersAdapter(MainActivity.this,R.layout.item,userList);
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(adapter);
*/
    }

    public void initUsers(){
        userList.add(new User(it1[0],it2[0],it3[0],R.drawable.l1,R.drawable.l1));
        userList.add(new User(it1[1],it2[1],it3[1],R.drawable.l2,R.drawable.l2));
        userList.add(new User(it1[2],it2[2],it3[2],R.drawable.l3,R.drawable.l3));
    }
}