package Maven.TestNG;

import org.testng.annotations.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void JenkinsIntegration()
    {
       System.out.println("Jenkins Integration with Selenium" );
    }
    @Test
    public void Tomcat()
    {
       System.out.println("Tomcat " );
    }
    @Test
    public void Print()
    {
       System.out.print("Added another Test" );
    }
}
