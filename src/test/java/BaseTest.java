import org.testng.annotations.*;
import setup.DriverSetup;
import setup.listeners.SuiteListener;

import static setup.DriverSetup.initDriver;
import static setup.DriverSetup.quitDriver;
@Listeners(SuiteListener.class)
public abstract class BaseTest {
    @AfterTest
    public void tearDownBase() {
        quitDriver();
    }
}
