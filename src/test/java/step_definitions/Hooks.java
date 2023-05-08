package step_definitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import utilities.Driver;

public class Hooks {
   @After
 public   void  tearDown(){
       Driver.closeDriver();

    }
}
