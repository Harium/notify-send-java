package com.harium.hci.notify.hints;

public class SuppressSoundHint extends Hint {

    public SuppressSoundHint(boolean value) {
        super(Hint.TYPE_BOOLEAN, "supress-sound", Boolean.toString(value));
    }

}
