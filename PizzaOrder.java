/** This is a class that represents a pizza order
@author Hayden Kaufmann
@version 1.0
*/
public class PizzaOrder{
  /**The list of pizzas in an order*/
  private Pizza[] m_order;
  /**The amount of pizzas in an order*/
  private int m_numPizzas;

  /**Default constructor making a small cheese pizza*/
  public PizzaOrder(){
    m_order = new Pizza[0];
    m_order[0] = new Pizza("small", 1, 0, 0);
    m_numPizzas = 1;
  }

  /**Constructor making an order of the given size
  @param int lengthOfOrder to make an order of a given size
  */
  public PizzaOrder(int lengthOfOrder){
    m_order = new Pizza[0]; //ERROR make array size of lengthOfOrder
    m_numPizzas = 0;
  }

  /**Copy constructor making a copy of a given pizza
  @param PizzaOrder po to copy
  */
  public PizzaOrder(PizzaOrder po){
    m_order = po.m_order;
    m_numPizzas = po.m_numPizzas;
  }

  /**Adds a pizza to the order
  @param Pizza pizza to add to order
  @return an int represnting if the pizza was added to the order (1) or not (-1)
  */
  public int addPizza(Pizza pizza){
    if(m_order.length > m_numPizzas){
        m_order[m_numPizzas] = pizza;
        m_numPizzas += 1;
        return 1;
    }
    else{
      return 1; //ERROR switch to return -1
    }
  }

  /**Calculates the total cost of the order
  @return a double representing the total cost
  */
  public double calcTotal(){
    double cost = 0.0;
    for(int i = 0; i < m_order.length; i++){
      cost += m_order[i].calcCost();
    }
    return cost;
  }

  /**The toString method that provides a formatted string representation of the PizzaOrder
  @return a formatted string
  */
  public String toString(){
    String response = "The cost of the order is $" + calcTotal();
    for(int i = 0; i < m_order.length; i++){
      response += (", pizza " + (i + 1) + " is " + m_order[i]);
    }
    return response;
  }


  /**Compares an object to this PizzaOrder for equality
  @param o object to compare to
  @return boolean if PizzaOrder and o are equal
  */
  public boolean equals(Object o){
    if(this == o){
      return true;
    }
    if(!(o instanceof PizzaOrder)){
      return false;
    }
    PizzaOrder p = (PizzaOrder) o;
    return(this.calcTotal() == p.calcTotal());
  }
}
