package com.dym.hadoop.example;

import org.apache.hadoop.io.WritableComparable;

import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;

public class TKey implements WritableComparable<TKey> {

    private int year;
    private int month;
    private int day;
    private int wd;
    private String location ;

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public int getWd() {
        return wd;
    }

    public void setWd(int wd) {
        this.wd = wd;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    @Override
    public int compareTo(TKey that) {
        int c1=Integer.compare(this.year,that.year);
        if(c1==0){
            int c2=Integer.compare(this.month,that.month);
            if(c2==0){
                return  Integer.compare(this.day,that.day);
            }
            return c2;
        }

        return 0;
    }

    @Override
    public void write(DataOutput out) throws IOException {
        out.writeInt(year);
        out.writeInt(month);
        out.writeInt(day);
        out.writeInt(wd);
    }

    @Override
    public void readFields(DataInput in) throws IOException {
        this.year = in.readInt();
        this.month=in.readInt();
        this.day=in.readInt();
        this.wd=in.readInt();
        this.location = in.readUTF();

    }
}
