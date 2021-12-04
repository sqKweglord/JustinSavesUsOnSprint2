package people;

import MenuItems.MenuItem;

import java.util.*;

public class Order {
	 protected int orderID = 0;
	 private static int nextOrderID = 1;
	 
	 ArrayList<MenuItem> orderContents = new ArrayList<MenuItem>();

	 public Order() {}
	 
	 public int getItemID() 
	 {
		 return this.orderID;
	 }
}
