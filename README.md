# notify-send-java
Notify Send wrapper in Java

## Usage
```
    // Custom Notification
    Notification notification = new Notification("Hello");
    notification.setIcon("/usr/share/icons/gnome/scalable/places/poi-bar.svg");
    notification.setCategory(Category.IM);
    notification.setUrgencyLevel(UrgencyLevel.CRITICAL);
    notification.send();

    // Or simply
    Notification.send("Hello World");
```
