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
    public void Tomcat1()
    {
       System.out.println(" Changes from local " );
    }
    @Test
    public void Tomcat2()
    {
       System.out.println(" Secret Edit in Github " );
    }
    @Test
    public void Tomcat3()
    {
       System.out.println(" Github " );
    }
    @Test
    public void Print()
    {
       System.out.println(" Added another Test" );
    }
}
