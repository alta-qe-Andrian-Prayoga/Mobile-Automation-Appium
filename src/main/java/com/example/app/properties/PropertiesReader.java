package com.example.app.properties;

import org.yaml.snakeyaml.Yaml;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

public class PropertiesReader {

    public static AppiumProperties readAppiumProperties() {
        try {
            Yaml yaml = new Yaml();
            InputStream data = new FileInputStream("src/test/resources/appium-properties.yaml");
            return yaml.load(data);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            return null;
        }
    }
}
