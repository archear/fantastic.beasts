package com.wangxia.info;

/**
 * Created by archer on 2017/4/8.
 */
public class Info {
    private int tab;
    private String info;
    private Object data;

    @Override
    public String toString() {
        return "Info{" +
                "tab=" + tab +
                ", info='" + info + '\'' +
                ", data=" + data +
                '}';
    }

    public int getTab() {
        return tab;
    }

    public void setTab(int tab) {
        this.tab = tab;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }
}
