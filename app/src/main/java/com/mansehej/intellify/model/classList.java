package com.mansehej.intellify.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class classList {

    @SerializedName("attendance")
    @Expose
    private List<classData> attendance = null;

    @SerializedName("message")
    @Expose
    private String message;



    public List<classData> getoutput() {
        return attendance;
    }

    public void setAttendance(List<classData> attendance) {
        this.attendance = attendance;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getMessage(){
        return message;
    }
}
