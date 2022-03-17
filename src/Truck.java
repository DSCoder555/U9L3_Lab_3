public class Truck extends Vehicle
{
  private int axles;
  private boolean hasTrailer;
  
  public Truck(String licensePlate, double tollFee, int passengers, int axles, boolean hasTrailer)
  {
    super(licensePlate, tollFee, passengers);
    this.axles = axles;
    this.hasTrailer = hasTrailer;
  }

  public void printTruck(){
    System.out.println("License Plate: " +  getLicensePlate() + "\nToll fee: " + getTollFee() + "\nPassengers: " + getPassengers() + "\nAxles: " + axles + "\nHas Trailer?: " + hasTrailer);
  }

  public boolean validateLicensePlate(){
    if(hasTrailer){
      if (axles > 4){
        return (getLicensePlate().substring(4).equals("MX"));
      }
      return (getLicensePlate().substring(4).equals("LX"));
    }
    return true;
  }
}