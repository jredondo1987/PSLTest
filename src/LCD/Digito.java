package LCD;

import java.util.ArrayList;
import java.util.List;

public class Digito {

	private List<Integer> segmentos = new ArrayList<>();

	public List<Integer> getSegmentos() {
		return segmentos;
	}

	public Digito(int digit) {
		switch (digit) {
		case 1:
			segmentos.add(3);
			segmentos.add(4);
			break;
		case 2:
			segmentos.add(5);
			segmentos.add(3);
			segmentos.add(6);
			segmentos.add(2);
			segmentos.add(7);
			break;
		case 3:
			segmentos.add(5);
			segmentos.add(3);
			segmentos.add(6);
			segmentos.add(4);
			segmentos.add(7);
			break;
		case 4:
			segmentos.add(1);
			segmentos.add(6);
			segmentos.add(3);
			segmentos.add(4);
			break;
		case 5:
			segmentos.add(5);
			segmentos.add(1);
			segmentos.add(6);
			segmentos.add(4);
			segmentos.add(7);
			break;
		case 6:
			segmentos.add(5);
			segmentos.add(1);
			segmentos.add(6);
			segmentos.add(2);
			segmentos.add(7);
			segmentos.add(4);
			break;
		case 7:
			segmentos.add(5);
			segmentos.add(3);
			segmentos.add(4);
			break;
		case 8:
			segmentos.add(1);
			segmentos.add(2);
			segmentos.add(3);
			segmentos.add(4);
			segmentos.add(5);
			segmentos.add(6);
			segmentos.add(7);
			break;
		case 9:
			segmentos.add(1);
			segmentos.add(3);
			segmentos.add(4);
			segmentos.add(5);
			segmentos.add(6);
			segmentos.add(7);
			break;
		case 0:
			segmentos.add(1);
			segmentos.add(2);
			segmentos.add(3);
			segmentos.add(4);
			segmentos.add(5);
			segmentos.add(7);
			break;
		default:
			break;
		}
	}
}