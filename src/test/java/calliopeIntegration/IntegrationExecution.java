package calliopeIntegration;

import org.testng.IExecutionListener;

public class IntegrationExecution  implements IExecutionListener {

	public void onExecutionStart() {
		
		System.out.println("Fetching LambdaTest Automation Test Data and Sending to Calliope Dashboard");
		
	}

	public void onExecutionFinish() {
		
		CalliopeAPI object = new CalliopeAPI();
		object.calliopeAPIcall();
		
	}
	
	

}
