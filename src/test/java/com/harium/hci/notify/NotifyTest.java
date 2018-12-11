package com.harium.hci.notify;

import org.junit.Assert;
import org.junit.Test;

public class NotifyTest {

    @Test
    public void testCommand() {
        Assert.assertEquals("notify-send", Notify.COMMAND_NOTIFY);
    }

}
