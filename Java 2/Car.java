/**
 * Car class inherits from the superclass LandVehicle.
 * @author Dan Do
*/

public class Car extends LandVehicle {
	/**
     * The max speed of the Car.
    */
    private int maxSpeed;	//this.maxSpeed
	
	/**
     * Constructs a car with the specified name, velocity, mass, and max speed.
     * @param name 		The name of the Car inherited from LandVehicle.
     * @param velocity  The velocity of the Car inherited from LandVehicle.
	 * @param mass 		The mass of the Car inherited from LandVehicle.
	 * @param maxSpeed  The max speed of the Car.
    */
	public Car (String name, double velocity, double mass, int maxSpeed) {
		super(name, velocity, mass);
		this.maxSpeed = maxSpeed;
	} 
	
	/**
     * Constructs a Car specifiying a name, mass, and speed. The velocity will be set to zero.
     * @param name The name of the Car inherited from LandVehicle.
     * @param mass The mass of the Car inherited from LandVehicle.
     */
	public Car (String name, double mass, int maxSpeed) {
		super(name, mass);
		this.maxSpeed = maxSpeed;
	}
	
	/**
     * Sets the velocity of the car to be the car’s maxSpeed if the newSpeed is greater than the maxSpeed.
	 * Otherwise the velocity of the car will be set as the newSpeed. 
	 * The velocity is set by calling the LandVehicle setVelocity method.
	 * @param newSpeed	The new speed of Car.
    */
	public void accelerate (double newSpeed) {
		if (newSpeed > this.maxSpeed) {
			super.setVelocity(this.maxSpeed);
		}
		else {
			super.setVelocity(newSpeed);
		}
		
	} //end accelerate() method

	/**
     * Returns the Car as a string representation.
     * @return a string respresentation of the object.
     */
	@Override
    public String toString(){
        return "name:" + super.getName() + ", mass:" + super.getMass() + ", velocity:" + super.getVelocity() + ", maxspeed:" + this.maxSpeed;
    }

} //end class