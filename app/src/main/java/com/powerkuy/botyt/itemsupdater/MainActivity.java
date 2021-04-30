package com.powerkuy.botyt.itemsupdater;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.FrameLayout.LayoutParams;
import android.widget.TextView;
import java.util.ArrayList;
import android.graphics.Color;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity
{

private ItemAdapter adapter;
private ArrayList<ItemData> itemlist;
private RecyclerView rcv;

@Override
protected void onCreate(Bundle savedInstanceState)
{
super.onCreate(savedInstanceState);
setContentView(R.layout.main);
try{
itemlist = new ArrayList<>();
getdata();
rcv = new RecyclerView(getBaseContext());
rcv.setLayoutParams(new LayoutParams(LayoutParams.MATCH_PARENT, LayoutParams.MATCH_PARENT));
adapter = new ItemAdapter(itemlist);
RecyclerView.LayoutManager a = new LinearLayoutManager(getBaseContext());
rcv.setLayoutManager(a);
rcv.setAdapter(adapter);
LinearLayout lol = findViewById(R.id.recyclerplace);
lol.addView(rcv);
}catch(Exception a){
TextView hanj= new TextView(getBaseContext());
hanj.setText(a.getMessage());
setContentView(hanj);
}
}

void getdata(){
/* Data List */
itemlist.add(new ItemData("Items.dat","12/4/2020","lmao"));
}

}
