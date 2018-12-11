package com.harium.hci.notify;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Reference: http://www.galago-project.org/specs/notification/0.7/index.html
 */
class Notify {

    static final String COMMAND_NOTIFY = "notify-send";

    /**
     * Create a new notify-send process
     *
     * @param notification - notification params
     */
    static void send(Notification notification) {
        List<String> commands = new ArrayList<>();
        commands.add(COMMAND_NOTIFY);

        if (UrgencyLevel.NORMAL != notification.urgencyLevel) {
            commands.add("-u");
            commands.add(notification.urgencyLevel.getCode());
        }

        if (notification.time > 0) {
            commands.add("-t");
            commands.add(Long.toString(notification.time));
        }

        if (!Category.NONE.equals(notification.category)) {
            commands.add("-c");
            commands.add(notification.category.getCode());
        }

        if (!notification.appName.isEmpty()) {
            commands.add("-a");
            commands.add(notification.appName);
        }

        if (!notification.icon.isEmpty()) {
            commands.add("-i");
            commands.add(notification.icon);
        }

        commands.add(notification.text);

        String[] array = new String[commands.size()];
        execute(commands.toArray(array));
    }

    static void send(String text) {
        String[] array = {COMMAND_NOTIFY, text};
        execute(array);
    }

    private static void execute(final String... command) {
        String threadName = COMMAND_NOTIFY;

        new Thread(new Runnable() {
            public void run() {
                ProcessBuilder b = new ProcessBuilder(command);
                try {
                    Process process = b.start();
                    process.waitFor();
                    process.destroy();
                } catch (IOException e) {
                    e.printStackTrace();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }, threadName).start();
    }

}
