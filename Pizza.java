/** This is a class that represents a pizza
@author Hayden Kaufmann
@version 1.0
*/
public class Pizza{
  /**The size of the pizza*/
  private String m_size;
  /**The amount of cheese toppings*/
  private int m_cheeseTop;
  /**The amount of pepperoni toppings*/
  private int m_pepTop;
  /**The amount of veggie toppings*/
  private int m_vegTop;
  /**The total amount of toppings*/
  private int m_totalTop;

  /**Default constructor making a small plain pizza*/
  public Pizza(){
    m_size = "small";
    m_cheeseTop = 0;
    m_pepTop = 0;
    m_vegTop = 0;
    m_totalTop = 0;
  }

  /**Overloaded constructor
  @param String size to set the size of a pizza (small, medium, or large)
  @param int cheeseTop to set the amount of cheese toppings
  @param int pepTop to set the amount of pepperoni toppings
  @param int vegTop to set the amount of veggie toppings
  */
  public Pizza(String size, int cheeseTop, int pepTop, int vegTop){
    m_size = size;
    m_cheeseTop = cheeseTop;
    m_pepTop = pepTop;
    m_vegTop = vegTop;
    m_totalTop = cheeseTop + pepTop + vegTop;
  }

  /**Copy constructor making a copy of a given pizza
  @param Pizza p to copy
  */
  public Pizza(Pizza p){
    m_size = p.m_size;
    m_cheeseTop = p.m_cheeseTop;
    m_pepTop = p.m_pepTop;
    m_vegTop = p.m_vegTop;
    m_totalTop = p.m_totalTop;
  }

  /**Accessor for the size attribute
  @return a String representing the size of the pizza
  */
  public String getSize(){
    return m_size;
  }

  /**Accessor for the cheese toppings attribute
  @return an int representing the amount of cheese toppings
  */
  public int getCheese(){
    return m_cheeseTop;
  }

  /**Accessor for the pepperoni toppings attribute
  @return an int representing the amount of pepperoni toppings
  */
  public int getPepperoni(){
    return m_pepTop;
  }

  /**Accessor for the veggie toppings attribute
  @return an int representing the amount of veggie toppings
  */
  public int getVeggie(){
    return m_vegTop;
  }

  /**Accessor for the total toppings attribute
  @return an int representing the total amount of toppings
  */
  public int totalToppings(){
    return m_totalTop;
  }

  /**mutator for the size attribute
  @param a string representing the size of the pizza
  */
  public void setSize(String size){
    m_size = size;
  }

  /**Mutator for the cheese toppings attribute
  @param an int representing the amount of cheese toppings
  */
  public void setCheese(int cheeseNum){
    m_cheeseTop = cheeseNum;
    m_totalTop = m_cheeseTop + m_pepTop + m_vegTop;
  }

  /**Mutator for the pepperoni toppings attribute
  @param an int representing the amount of pepperoni toppings
  */
  public void setPepperoni(int pepperoniNum){
    m_pepTop = pepperoniNum;
    m_totalTop = m_cheeseTop + m_pepTop + m_vegTop;
  }

  /**Mutator for the veggie toppings attribute
  @param an int representing the amount of veggie toppings
  */
  public void setVeggie(int veggieNum){
    m_vegTop = veggieNum;
    m_totalTop = m_cheeseTop + m_pepTop + m_vegTop;
  }

  /**Calculates the cost of a pizza
  @return a double representing the cost of the pizza
  */
  public double calcCost(){
    double cost = 0.0;
    if(m_size.toLowerCase().equals("small")){
      cost = 10.0;
    }
    if(m_size.toLowerCase().equals("medium")){
      cost = 12.0;
    }
    if(m_size.toLowerCase().equals("large")){
      cost = 14.0;
    }
    if(!m_size.toLowerCase().equals("large") && !m_size.toLowerCase().equals("medium") && !m_size.toLowerCase().equals("small")){
      return 0.0;
    }
    for(int i = 0; i < m_totalTop; i++){
      cost += 2.0;
    }
    return cost;
  }

  /**The toString method that provides a formatted string representation of the Pizza
  @return a formatted string
  */
  public String toString(){
    if(!m_size.toLowerCase().equals("large") && !m_size.toLowerCase().equals("medium") && !m_size.toLowerCase().equals("small")){
      return "not a valid pizza";
    }
    return("a " + m_size + " pizza has " + m_cheeseTop + " cheese topping(s), " + m_pepTop + " pepperoni topping(s), and " + m_vegTop + " veggie topping(s) bringing the cost to $" + calcCost());
  }

  /**Compares an object to this Pizza for equality
  @param o object to compare to
  @return boolean if Pizza and o are equal
  */
  public boolean equals(Object o){
    if(this == o){
      return true;
    }
    if(!(o instanceof Pizza)){
      return false;
    }
    Pizza p = (Pizza) o;
    return(this.m_size == p.m_size && this.m_cheeseTop == p.m_cheeseTop && this.m_pepTop == p.m_pepTop && this.m_vegTop == p.m_vegTop);
  }
}
