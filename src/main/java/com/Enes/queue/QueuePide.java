package com.Enes.queue;

import java.util.Queue;
import java.util.Random;
import java.util.concurrent.ArrayBlockingQueue;

public class QueuePide {
    private int id;
    private String name;

    public QueuePide(int id, Queue<String> name) {
        this.id = id;
        this.name = String.valueOf(name);
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("QueuePide{");
        sb.append("id=").append(id);
        sb.append(", name='").append(name).append('\'');
        sb.append('}');
        return sb.toString();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }





}

