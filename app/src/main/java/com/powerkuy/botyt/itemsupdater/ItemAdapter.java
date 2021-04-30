package com.powerkuy.botyt.itemsupdater;
import android.widget.Adapter;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import android.view.LayoutInflater;
import android.widget.TextView;
import android.widget.Button;

public class ItemAdapter extends RecyclerView.Adapter<ItemAdapter.MyHolder>
{

@Override
public ItemAdapter.MyHolder onCreateViewHolder(ViewGroup p1, int p2)
{
LayoutInflater a = LayoutInflater.from(p1.getContext());
View li = a.inflate(R.id.recyclerplace,p1,false);
return new MyHolder(li);
}

@Override
public void onBindViewHolder(ItemAdapter.MyHolder p1, int p2)
{

}

@Override
public int getItemCount()
{
return 0;
}

public class MyHolder extends RecyclerView.ViewHolder{
private TextView item,date;
private Button download;


public MyHolder(View a){
super(a);
/* Holder Here */
item = a.findViewById(R.id.itemname);
date = a.findViewById(R.id.item_lastdate);
download = a.findViewById(R.id.item_download);
}
}
}
