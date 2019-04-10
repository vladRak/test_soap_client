package com.test.soap.client.xls.util;

import java.util.ResourceBundle;

/**
 * ConfigManager class used for getting application configs
 *
 * @author vladRak
 */
public class ConfigManager {

    private final static ResourceBundle resourceBundle;
    private final static String CONFIG_FILE_NAME = "application";

    static {
        resourceBundle = ResourceBundle.getBundle(CONFIG_FILE_NAME);
    }

    private ConfigManager() {
    }

    /**
     * Method return an value by config name
     *
     * @param key an config name
     * @return String value of config
     * @author vladRak
     */
    public static String getConfig(final String key) {
        return resourceBundle.getString(key);
    }
}