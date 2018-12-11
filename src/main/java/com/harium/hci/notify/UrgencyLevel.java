package com.harium.hci.notify;

public enum UrgencyLevel {
    LOW("low"),  NORMAL("normal"),  CRITICAL("critical");

    private final String code;

    /**
     * @param code
     */
    UrgencyLevel(final String code) {
        this.code = code;
    }

    public String getCode() {
        return code;
    }
}
