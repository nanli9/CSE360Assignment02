package CSE360Assignment02;
import java.util.ArrayList;
public class AddingMachine {
	  private int total;
	  private ArrayList<String> valueArr = new ArrayList<String>();
	  //a constructor to initialize the value of total
	  public AddingMachine () {
	    total = 0;  // not needed - included for clarity
	  }
	  //return the value of total
	  public int getTotal () {
	    return total;
	  }
	//add the pass in parameter
	  public void add (int value) {
		  total+=value;
		  valueArr.add(" + "+value);
	  }
	  //subtract the pass in parameter
	  public void subtract (int value) {
		  total-=value;
		  valueArr.add(" - "+value);
	  }
	  //return all the adding and subtraction details
	  public String toString () {
		  String str = "0";
		  for(int i=0;i<valueArr.size();i++) {
			  str+=valueArr.get(i);
		  }
	    return str;
	  }
	  //empty the ArrayList and reset total to 0
	  public void clear() {
		  valueArr.clear();
		  total=0;
	  }
}