/**
 * LandVehicle is the superclass for all objects that represent vehicles.
 * @author Anthony Marchiafava
*/
public class LandVehicle {
    /**
     * The name of the land vehicle.
     */
    private String name;

    /**
     * The speed of the vehicle in meters/second.
     */
    private double velocity;

    /**
     * The mass is the mass of the vehicle.
     */
    private double mass;

    /**
     * The momentum is the product of mass and velocity of the vehicle.
     */
    private double momentum;

    /**
     * Constructs a LandVehicle specifiying a name and mass. The velocity defaults to zero.
     * @param name The name of the LandVehicle.
     * @param mass The mass of the LandVehicle.
     */
    public LandVehicle(String name, double mass){
        this.name = name;
        this.velocity = 0.0;
        this.mass = mass;
    }

    /**
     * Constructs a LandVehicle specifiying a name, velocity, and mass.
     * @param name The name of the LandVehicle.
     * @param velocity The velocity of the LandVehicle.
     * @param mass The mass of the LandVehicle.
     */
    public LandVehicle(String name, double velocity, double mass){
        this.name = name;
        this.velocity = velocity;
        this.mass = mass;
    }

    /**
     * Returns the name of the LandVehicle
     * @return a string representing the name of the LandVehicle
     */
    public String getName(){return this.name;}

    /**
     * Returns the velocity of the LandVehicle
     * @return a double representing the velocity of the LandVehicle
     */
    public double getVelocity(){return this.velocity;}

    /**
     * Returns the mass of the LandVehicle
     * @return a double representing the mass of the LandVehicle
     */    
    public double getMass(){return this.mass;}

    /**
     * Returns the momentum of the LandVehicle. The momentum is the product of mass and velocity of the vehicle.
     * @return a double representing the momentum of the LandVehicle
     */   
    public double getMomentum(){return this.mass * this.velocity;}

    /**
     * Inicates if another object is equal to this one.
     * @return true if this LandVehicle has the same values and type as the obj, false if not
     */
    public boolean equals(Object obj){
        if (obj instanceof LandVehicle){
            if( (this.name.equals(((LandVehicle) obj).getName())) && 
                (Double.valueOf(this.mass)).equals(Double.valueOf(((LandVehicle) obj).getMass())) &&
                (Double.valueOf(this.velocity)).equals(Double.valueOf(((LandVehicle) obj).getVelocity())) &&
                (Double.valueOf(this.getMomentum())).equals(Double.valueOf(((LandVehicle) obj).getMomentum()))
            ){
                return true;
            }
            else{
                return false;
            }
        }
        else{
            return false;
        }
    }

    /**
     * Returns a string representation of the object.
     * @return a string respresentation of the object.
     */
    public String toString(){
        return "name:"+this.name+", mass:"+this.mass+", velocity:"+this.velocity;
    }

    /**
     * Sets this LandVehicles's velocity.
     * @param velocity
     */
    public void setVelocity(double velocity){
        this.velocity = velocity;
    }
}