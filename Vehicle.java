public class Vehicle{
	// A unique ID for this Vehicle.
	private String id;
	// The destination of this Vehicle.
	private String destination;
	// The location of this Vehicle.
	private String location;
	
	public Vehicle(String id){
		this.id = id; 
		this.destination = null;
		this.location = null; 
	}
	
	/**
	* Return the ID of the Vehicle.
	* @return The ID of the Vehicle.
	*/
	public String getID()
	{
		return id;
	}

	/**
	* Return the location of the Vehicle.
	* @return The location of the Vehicle.
	*/
	public String getLocation()
	{
		return location;
	}

	/**
	* Return the destination of the Vehicle.
	* @return The destination of the Vehicle.
	*/
	public String getDestination()
	{
		return destination;
	}

	/**
	* Return the status of this vehicle.
	* @return The status.
	*/
	public String getStatus()
	{
		if(this.destination != null){
			return id + " at " + location + " headed for " + destination;
		}else{
			return "The vehicle " + id+ " is free, no has destination for vehicle.";		
		}
	
	}


	/**
	* Set the intented destination of the Vehicle.
	* @param destination The intended destination.
	*/
	public void setDestination(String destination)
	{
		this.destination = destination;
	}

	/**
	* Set location of the Vehicle.
	* @param location The intended destination.
	*/
	public void setLocation(String location)
	{
		this.location = location;
	}

	/**
	* Indicate that this vehicle has arrived at its destination.
	*/
	public void arrived()
	{
		this.location = this.destination;

	}
}
