package com.test.soap.client.xls.util;

import java.util.ResourceBundle;

public class ConfigManager {

    private final static ResourceBundle resourceBundle;
    private final static String CONFIG_FILE_NAME = "application";

    static {
        resourceBundle = ResourceBundle.getBundle(CONFIG_FILE_NAME);
    }

    private ConfigManager() {
    }

    public static String getConfig(final String key) {
        return resourceBundle.getString(key);
    }
}