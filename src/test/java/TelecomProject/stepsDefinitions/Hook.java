package TelecomProject.stepsDefinitions;

import TelecomProject.utilities.Driver;
import org.junit.After;
import org.junit.Before;

import java.util.concurrent.TimeUnit;

public class Hook {


    @Before
    public void setUp(){

        Driver.getDriver().manage().window().maximize();
        Driver.getDriver().manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
    }
    @After
    public void closing(){

    }
}
