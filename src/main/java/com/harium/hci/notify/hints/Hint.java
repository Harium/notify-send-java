package com.harium.hci.notify.hints;

public class Hint {

    public static final String TYPE_STRING = "string";
    public static final String TYPE_BOOLEAN = "boolean";
    public static final String TYPE_INT = "int";

    String type;
    String name;
    String value;

    public Hint(String name, String value) {
        this.type = TYPE_STRING;
        this.name = name;
        this.value = value;
    }

    public Hint(String type, String name, String value) {
        this.type = type;
        this.name = name;
        this.value = value;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String toText() {
        return type + ":" + name + ":" + value;
    }
}
