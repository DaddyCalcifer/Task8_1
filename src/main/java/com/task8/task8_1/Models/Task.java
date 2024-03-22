package com.task8.task8_1.Models;

public class Task {
    private int task_id;
    private String name;
    private int time;
    private String status;

    public Task(int id, String name, int time, String status) {
        this.task_id = id;
        this.name = name;
        this.time = time;
        this.status = status;
    }
    public void setName(String name)
    {
        this.name=name;
    }
    public String getName()
    {
        return name;
    }
    public void setTime(int time)
    {
        this.time=time;
    }
    public int getTime()
    {
        return time;
    }
    public void setStatus(String status)
    {
        this.status=status;
    }
    public String getStatus()
    {
        return status;
    }
    public int getId()
    {
        return task_id;
    }
    @Override
    public String toString()
    {
        return ("Имя процесса: " +name+ "\nВремя: " +time+ "\nСтатус: " + status +"\n");
    }
}