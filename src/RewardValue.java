public class RewardValue {

  private double cash;
   private double miles;
   final double miles_to_cash=0.0035;
   public RewardValue(double cash){
    this.cash=cash;
    this.miles=cash/miles_to_cash;
    }
    public RewardValue(double miles,boolean ismiles){
       if(ismiles){
           this.miles=miles;
           this.cash=miles*miles_to_cash;
       }
    }
    public double getCashValue(){
       return cash;
    }
    public double getMilesValue(){
       return miles;
    }
    public static void main(String[] args){
       RewardValue obj=new RewardValue(100);
       System.out.println("cash: "+obj.getCashValue());
       System.out.println("miles: "+obj.getMilesValue());
       RewardValue obj1=new RewardValue(10000,true);
       System.out.println("cash: "+obj1.getCashValue());
       System.out.println("miles: "+obj1.getMilesValue());
    }



}
