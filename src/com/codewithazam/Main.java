package com.codewithazam;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;

public class Main {

    public static void main(String[] args) throws MalformedURLException {
        DesiredCapabilities dc = new DesiredCapabilities();
        dc.setBrowserName("chrome");
        dc.setPlatform(Platform.WIN10);

        WebDriver driver = new RemoteWebDriver(new URL("http://192.168.1.93:4444/wd/hub"),dc);
        driver.get("https://www.google.com/");

    }
}
