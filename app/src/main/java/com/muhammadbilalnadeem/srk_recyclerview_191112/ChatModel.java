package com.muhammadbilalnadeem.srk_recyclerview_191112;

public class ChatModel {


    private int Dpimage;
    private String textName;
    private String textMessage;
    private String textTime;
    private String divider;

    public ChatModel(int dpimage, String textName, String textMessage, String textTime, String divider) {
        Dpimage = dpimage;
        this.textName = textName;
        this.textMessage = textMessage;
        this.textTime = textTime;
        this.divider = divider;
    }

    public int getDpimage() {
        return Dpimage;
    }

    public String getTextName() {
        return textName;
    }

    public String getTextMessage() {
        return textMessage;
    }

    public String getTextTime() {
        return textTime;
    }

    public String getDivider() {
        return divider;
    }

    public void setDpimage(int dpimage) {
        Dpimage = dpimage;
    }

    public void setTextName(String textName) {
        this.textName = textName;
    }

    public void setTextMessage(String textMessage) {
        this.textMessage = textMessage;
    }

    public void setTextTime(String textTime) {
        this.textTime = textTime;
    }

    public void setDivider(String divider) {
        this.divider = divider;
    }
}
