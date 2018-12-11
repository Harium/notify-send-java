package com.harium.hci.notify;

public enum Category {

    DEVICE("device"),
    DEVICE_ADDED("device.added"),
    DEVICE_ERROR("device.error"),
    DEVICE_REMOVED("device.removed"),
    EMAIL("email"),
    EMAIL_ARRIVED("email.arrived"),
    EMAIL_BOUNCED("email.bounced"),
    IM("im"),
    IM_ERROR("im.error"),
    IM_RECEIVED("im.received"),
    NETWORK("network"),
    NETWORK_CONNECTED("network_connected"),
    NETWORK_DISCONNECTED("network_disconnected"),
    NETWORK_ERROR("network_disconnected"),
    PRESENCE("presence"),
    PRESENCE_OFFLINE("presence.offline"),
    PRESENCE_ONLINE("presence.online"),
    TRANSFER("transfer"),
    TRANSFER_COMPLETE("transfer.complete"),
    TRANSFER_ERROR("transfer.error"),
    NONE("");

    private final String code;

    /**
     * @param code
     */
    Category(final String code) {
        this.code = code;
    }

    public String getCode() {
        return code;
    }

}
