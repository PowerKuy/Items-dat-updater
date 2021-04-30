package com.powerkuy.botyt.itemsupdater;

public class ItemData
{
private String itemname;
private String lastdate;
private String url_git;

public ItemData(String itemname, String lastdate, String url_git)
{
this.itemname = itemname;
this.lastdate = lastdate;
this.url_git = url_git;
}



public void setItemname(String itemname)
{
this.itemname = itemname;
}

public String getItemname()
{
return itemname;
}

public void setLastdate(String lastdate)
{
this.lastdate = lastdate;
}

public String getLastdate()
{
return lastdate;
}

public void setUrl_git(String url_git)
{
this.url_git = url_git;
}

public String getUrl_git()
{
return url_git;
}}
