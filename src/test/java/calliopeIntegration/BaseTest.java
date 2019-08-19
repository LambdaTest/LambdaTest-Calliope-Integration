package calliopeIntegration;


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Base64;

import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.HttpClientBuilder;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.remote.SessionId;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;

import calliopeIntegration.session.SessionResponse;


@Listeners({IntegrationExecution.class})
public class BaseTest {
	
	public String username = "YOUR LAMBDATEST USERNAME";
    public String accesskey = "YOUR LAMBDATEST ACCESS KEY";
    public static RemoteWebDriver driver = null;
    public String gridURL = "@hub.lambdatest.com/wd/hub";
    boolean status = false;
   
    
	@BeforeMethod
	 public void setUp() {
		DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("browserName", "chrome");
        capabilities.setCapability("version", "70.0");
        capabilities.setCapability("platform", "win10"); // If this cap isn't specified, it will just get the any available one
        capabilities.setCapability("build", "LambdaTest Integration with Calliope");
        capabilities.setCapability("name", "Calliope-Sample-Test");
        capabilities.setCapability("network", true); // To enable network logs
        capabilities.setCapability("visual", true); // To enable step by step screenshot
        capabilities.setCapability("video", true); // To enable video recording
        capabilities.setCapability("console", true); // To capture console logs
        try {
            driver = new RemoteWebDriver(new URL("https://" + username + ":" + accesskey + gridURL), capabilities);
        } catch (MalformedURLException e) {
            System.out.println("Invalid grid URL");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    
		Reporter.log("Build and Session Information retrieved from LambdaTest API's",true);
	 }


	@Test
	public void BuildSession() throws Exception {
		
		try {

			driver.get("https://www.apple.com/");
			driver.manage().window().maximize();
			Thread.sleep(5000);
			
			driver.findElement(By.xpath("//*[@id=\'ac-globalnav\']/div/ul[2]/li[3]")).click();
			Thread.sleep(2000);

			driver.findElement(
			By.cssSelector("#chapternav > div > ul > li.chapternav-item.chapternav-item-ipad-air > a")).click();
			Thread.sleep(2000);

			driver.findElement(By.linkText("Why iPad")).click();
			Thread.sleep(2000);
            
				
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}	
	}
	
	
	
	
	@AfterMethod
	 public void teardown() throws Exception {
		
		SessionId session = driver.getSessionId();
        String sessionId = session.toString();
		
		 if (driver != null) {
	            ((JavascriptExecutor) driver).executeScript("lambda-status=" + status);
	           driver.quit();
	        }
		
		
		String usernameColonPassword = username+":"+accesskey;
		String basicAuthPayload = "Basic " + Base64.getEncoder().encodeToString(usernameColonPassword.getBytes());
		Reporter.log(basicAuthPayload);
		
		
		
		//Session Info
		String sessionURL = "https://api.lambdatest.com/automation/api/v1/sessions/"+sessionId;
		Reporter.log(sessionURL,true);
		String jsonResponse2 = sendGetRequest(sessionURL,basicAuthPayload);
		ObjectMapper objectMapper2 = new ObjectMapper();
		objectMapper2.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
		SessionResponse response2 = objectMapper2.readValue(jsonResponse2, SessionResponse.class);
		Reporter.log(response2.toString(),true);	
			
	}

	
	
	

	public static String sendGetRequest(String url, String basicAuthPayload) throws Exception {
		HttpClient client = HttpClientBuilder.create().build();
		HttpGet request = new HttpGet(url);

		// add request header
		request.addHeader("Content-Type", "application/json");
		request.addHeader("Authorization", basicAuthPayload);
		HttpResponse response = client.execute(request);

		BufferedReader rd = new BufferedReader(new InputStreamReader(response.getEntity().getContent()));

		StringBuffer result = new StringBuffer();
		String line = "";
		while ((line = rd.readLine()) != null)
		{
			result.append(line);
		}
		return result.toString();	
	 }
	

	
}

