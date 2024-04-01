public class Pizza
{
  private int price;
  private Boolean veg;
  private int extraCheesePrice=30;
  private int extraToppingsPrice=40;
  private int bagPackPrice=10;
  private int basePizzaPrice;//for dynamic
  private boolean isExtraCheeseAdded=false;
  private boolean isExtraToppingsAdded=false;
  private boolean isOptedForTakeAway=false;

  public Pizza(Boolean veg)
  {
    this.veg=veg;
    if(this.veg)
    {
      this.price=50;
    }
    else
    {
       this.price=70;
    }
    basePizzaPrice=this.price;
  }

  public void addExtraCheese()
  {
    isExtraCheeseAdded=true;
    this.price+=extraCheesePrice;
    
  }
  public void addExtraToppings()
  {
    isExtraToppingsAdded=true;
    this.price+=extraToppingsPrice;
  }
  public void takeAway()
  {
    isOptedForTakeAway=true;
    this.price+=bagPackPrice;
  }
  public void getBill()
  {
    String bill="";
    System.out.println("Pizza Price: "+basePizzaPrice);
    if(isExtraCheeseAdded)
    {
      bill += "Extra Cheese added :"+extraCheesePrice+"\n";
    }
    if(isExtraToppingsAdded)
    {
      bill += "Extra Toppings added : "+extraToppingsPrice+"\n";
    }
    if(isOptedForTakeAway)
    {
      bill +="Take Away :"+bagPackPrice+"\n";
    }
    bill +="Total Bill : "+this.price+"\n";
    System.out.println(bill);

  }
}