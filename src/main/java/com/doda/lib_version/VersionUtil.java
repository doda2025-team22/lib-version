package com.doda.lib_version;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

 public class VersionUtil {

    static public String getVersion() {
        Properties props = new Properties();
        InputStream resourceStream = VersionUtil.class.getResourceAsStream("/version.properties");
        try {
            props.load(resourceStream);
            return props.getProperty("version");
        } catch (IOException e) {
            System.out.println("Error in loading properties");
            throw new RuntimeException(e);
        }
    }
}
