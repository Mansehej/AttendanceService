package com.mansehej.intellify.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class classData {


    @SerializedName("className")
    @Expose
    private String className;
    @SerializedName("totalLectures")
    @Expose
    private int totalLectures;
    @SerializedName("present")
    @Expose
    private int present;
    @SerializedName("sick")
    @Expose
    private int sick;
    @SerializedName("absent")
    @Expose
    private int absent;
    @SerializedName("late")
    @Expose
    private int late;


    public String getclassName() {
        return className;
    }

    public void setclassName(String class_name) {
        this.className = className;
    }

    public int getTotalLectures() {
        return totalLectures;
    }

    public void setTotalLectures(int totalLectures) {
        this.totalLectures = totalLectures;
    }

    public int getPresent() {
        return present;
    }

    public void setPresent() {
        this.present=present;
    }

    public int getSick() {
        return sick;
    }

    public void setSick(int sick) {
        this.sick = sick;
    }

    public int getAbsent() {
        return absent;
    }

    public void setAbsent(int absent) {
        this.absent = absent;
    }

    public int getLate() {
        return late;
    }

    public void setLate(int late) {
        this.late = late;
    }
}