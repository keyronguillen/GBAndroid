package com.azure.mobile.app.test;

import org.junit.*;
import org.junit.rules.TestWatcher;
import io.appium.java_client.MobileElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.Random;
import java.util.List;

import com.microsoft.appcenter.appium.Factory;
import com.microsoft.appcenter.appium.EnhancedAndroidDriver;
import org.junit.rules.TestWatcher;
import org.junit.Rule;

public class LaunchTest {
    @Rule
    public TestWatcher watcher = Factory.createWatcher();

    private static EnhancedAndroidDriver<MobileElement> driver;

    @Before
    public void setUp() throws MalformedURLException {
        DesiredCapabilities capabilities = new DesiredCapabilities();

        capabilities.setCapability("platformName", "android");
        capabilities.setCapability("deviceName", "ignored");
        capabilities.setCapability("app", "/path/to/app.apk");

        URL url = new URL("http://localhost:4723/wd/hub");

        driver = Factory.createAndroidDriver(url, capabilities);
    }

    @Test
	
	public void appInicia() {
		driver.resetApp();
        try {
				driver.label("Prueba1");
                Thread.sleep(2000);  
				driver.label("Prueba2");
				Thread.sleep(2000);
				
            } catch (InterruptedException ex) {
        }
        driver.label("App a iniciado");
    }
	

	@Test
    public void clickbtnInicio() {
		driver.resetApp();
        try {
                Thread.sleep(1000);
				MobileElement el1 = (MobileElement) driver.findElementByAccessibilityId("boton_inicio");
				el1.click();
				driver.label("Click mouse");
            } catch (InterruptedException ex) {
        }
        driver.label("Click mouse2");
    }

    
}
