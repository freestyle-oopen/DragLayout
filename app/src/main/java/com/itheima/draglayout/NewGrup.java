package com.itheima.draglayout;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by renyk on 2018/5/16.
 */

public class NewGrup {
    public List<NewBean> newBeens =new ArrayList<>();
    public String  title;

    public List<NewBean> getNewBeens() {
        return newBeens;
    }

    public void setNewBeens(List<NewBean> newBeens) {
        this.newBeens = newBeens;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
