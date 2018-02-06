package LCD;

import java.util.ArrayList;
import java.util.List;

public class Digit {
	
	private List<Integer> segment = new ArrayList<>();
	
	public List<Integer> getSegment(){
		return segment;
	}
	
	/**
	 * Make a segment with a digit
	 * @param digit
	 * **/
	
	public Digit(int digit){
		switch (digit) {
		case 1:
			segment.add(3);
			segment.add(4);
			break;
		case 2:
			segment.add(5);
			segment.add(3);
			segment.add(6);
			segment.add(2);
			segment.add(7);
			break;
		case 3:
			segment.add(5);
			segment.add(3);
			segment.add(6);
			segment.add(4);
			segment.add(7);
			break;
		case 4:
			segment.add(1);
			segment.add(6);
			segment.add(3);
			segment.add(4);
			break;
		case 5:
			segment.add(5);
			segment.add(1);
			segment.add(6);
			segment.add(4);
			segment.add(7);
			break;
		case 6:
			segment.add(5);
			segment.add(1);
			segment.add(6);
			segment.add(2);
			segment.add(7);
			segment.add(4);
			break;
		case 7:
			segment.add(5);
			segment.add(3);
			segment.add(4);
			break;
		case 8:
			segment.add(1);
			segment.add(2);
			segment.add(3);
			segment.add(4);
			segment.add(5);
			segment.add(6);
			segment.add(7);
			segment.add(8);
			break;
		case 9:	
			segment.add(1);
			segment.add(2);
			segment.add(3);
			segment.add(4);
			segment.add(5);
			segment.add(6);
			segment.add(7);
			segment.add(8);
			break;
		case 0:
			segment.add(1);
			segment.add(2);
			segment.add(3);
			segment.add(4);
			segment.add(5);
			segment.add(6);
			segment.add(7);
			segment.add(8);
			break;
		default:
			break;
		}
	}
}
