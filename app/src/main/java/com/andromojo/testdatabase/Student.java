package com.andromojo.testdatabase;

public class Student {
    private int _id;
    private String _studentname;

    public Student(int id, String studentname){
        this._id = id;
        this._studentname = studentname;
    }

    public void setID(int id){
        this._id = id;
    }

    public int getID(){
        return this._id;
    }

    public void setStudentName(String studentName){
        this._studentname = studentName;
    }

    public String getStudentName(){
        return this._studentname;
    }
}
