package com.harium.hci.notify.hints;

public class SoundHint extends Hint {

    public SoundHint(String path) {
        super(Hint.TYPE_STRING, "sound-file", path);
    }

}
