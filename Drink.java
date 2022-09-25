import java.util.ArrayList;

public class Drink {
   public String teaType;
   public String milk;
   public String toppings;
   public String flavor;
   public String temperature;
   public String consistency;
   public String fruit;
   public String misc;
   
   public Drink(String teaType, String milk, String toppings, String flavor, String temperature
   , String consistency, String fruit, String misc) {
      this.teaType = teaType;
      this.milk = milk;
      this.toppings = toppings;
      this.flavor = flavor;
      this.temperature = temperature;
      this.consistency = consistency;
      this.fruit = fruit;
      this.misc = misc;
   }
   
   public String getTeaType() {
      return teaType;
   }
   
   public void setTeaType(String teaType) {
      this.teaType = teaType;
   }
   
   public String getMilk() {
      return milk;
   }
   
   public void setMilk(String milk) {
      this.milk = milk;
   }
   
   public String getToppings() {
      return toppings;
   }
   
   public void setToppings(String toppings) {
      this.toppings = toppings;
   }
   
   public String getFlavor() {
      return flavor;
   }
   
   public void setFlavor(String flavor) {
      this.flavor = flavor;
   }
   
   public String getTemperature() {
      return temperature;
   }
   
   public void setTemperature(String temperature) {
      this.temperature = temperature;
   }
   
   public String getConsistency() {
      return consistency;
   }
   
   public void setConsistency(String consistency) {
      this.consistency = consistency;
   }
   
   public String getFruit() {
      return fruit;
   }
   
   public void setFruit(String fruit) {
      this.fruit = fruit;
   }
   
   public String getMisc() {
      return misc;
   }
   
   public void setMisc(String misc) {
      this.misc = misc;
   }
}
