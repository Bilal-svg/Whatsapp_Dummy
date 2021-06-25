package com.muhammadbilalnadeem.srk_recyclerview_191112;

public class StatusModel {
    private int statuspic;
    private String time;
    private String name;
    private String divider;

    public StatusModel(int statuspic, String time, String name, String divider) {
        this.statuspic = statuspic;
        this.time = time;
        this.name = name;
        this.divider = divider;
    }

    public int getStatuspic() {
        return statuspic;
    }

    public String getTime() {
        return time;
    }

    public String getName() {
        return name;
    }

    public String getDivider() {
        return divider;
    }

    public void setStatuspic(int statuspic) {
        this.statuspic = statuspic;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDivider(String divider) {
        this.divider = divider;
    }
}
