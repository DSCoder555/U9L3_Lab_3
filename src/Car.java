public class Car extends Vehicle
{
  private boolean electric;
  private boolean discountApplied;
  
  public Car(String licensePlate, double tollFee, int passengers, boolean electric)
  {
    super(licensePlate, tollFee, passengers);
    this.electric = electric;
    discountApplied = false;   // default value
  }

  public void printInfo(){
    super.printInfo();
    System.out.println("Electric?: " + electric + "\nDiscount Applied?: " + discountApplied);
  }

  public boolean isElectric(){ return electric;}

  public boolean isDiscountApplied() {return discountApplied;}

  public boolean dropOffPassengers(int numOut){
    if (numOut < getPassengers()){
      setPassengers(getPassengers()-numOut);
      return true;
    }
    return false;
  }

  public void applyDiscount(){
    if(!discountApplied && isElectric()){
      discountApplied = true;
      setTollFee(getTollFee() /2);
    }
  }

  public double calculateTollPrice(){
    if(getPassengers() > 4){
      return 4 * getTollFee();
    }
    return super.calculateTollPrice();
  }
}