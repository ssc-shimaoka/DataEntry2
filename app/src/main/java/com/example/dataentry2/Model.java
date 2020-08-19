package com.example.dataentry2;


public class Model
{
    int index = 0;
    String name = null;
    String yomi = null;
    String phone = null;

    public void setIndex(int index){
        this.index = index;
    }
    public int getIndex()
    {
        return this.index;
    }


    public void setName(String name){
        this.name = name;
    }
    public String getName()
    {
        return this.name;
    }


    public void setYomi(String yomi){
        this.yomi = yomi;
    }
    public String getYomi()
    {
        return this.yomi;
    }


    public void setPhone(String phone){
        this.phone = phone;
    }
    public String getPhone()
    {
        return this.phone;
    }
}

