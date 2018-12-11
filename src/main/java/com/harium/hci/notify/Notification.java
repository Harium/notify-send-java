package com.harium.hci.notify;

public class Notification {

    String text = "";

    long time = 0;

    String appName = "";

    String icon = "";

    Category category = Category.NONE;

    UrgencyLevel urgencyLevel = UrgencyLevel.NORMAL;

    public Notification(String text) {
        this.text = text;
    }


    public void send() {
        Notify.send(this);
    }

    public static void send(String text) {
        Notify.send(text);
    }

    public long getTime() {
        return time;
    }

    public void setTime(long time) {
        this.time = time;
    }

    public String getAppName() {
        return appName;
    }

    public void setAppName(String appName) {
        this.appName = appName;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public UrgencyLevel getUrgencyLevel() {
        return urgencyLevel;
    }

    public void setUrgencyLevel(UrgencyLevel urgencyLevel) {
        this.urgencyLevel = urgencyLevel;
    }
}
