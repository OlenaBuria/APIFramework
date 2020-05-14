package stepDefinitions;

import java.io.IOException;

import io.cucumber.java.Before;

public class Hooks {
	
	@Before("@DeletePlace")
	public void beforeScenario() throws IOException
	{
		// write a code that will give you place id
		//execute this code only when place id is null
		
		StepDefinition m = new StepDefinition();
		if (m.place_id==null)
		{
		
		m.add_Place_Payload("Shetty", "French", "Asia");
		m.user_calls_with_http_request("AddPlaceAPI", "POST");
		m.verify_place_Id_created_maps_to_using("Shetty", "getPlaceAPI");
		}
	}

}
