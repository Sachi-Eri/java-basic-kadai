package kadai_004;

import java.util.HashMap;
import java.util.Map;

public class Score_Chapter04 {

	public static void main(String[] args) {
		 Map<String, Integer> seito = new HashMap<>();
	        seito.put("A", 10);
	        seito.put("B", 20);
	        seito.put("C", 30);
	        seito.put("D", 40);
	        seito.put("E", 50);
	        seito.put("F", 60);
	        seito.put("G", 70);
	        seito.put("H", 80);
	        seito.put("I", 90);
	        seito.put("J", 100);
	        
	        double avg = 0;
	        for (Map.Entry<String, Integer> entry : seito.entrySet()) {
	            String name = entry.getKey();
	            int score = entry.getValue();
	            System.out.println(name + "さんの点数は" + score + "点");
	            avg += score;
	        }
	        avg /= seito.size();
	        System.out.println("テストの平均点は" + Math.round(avg) + "点");

	}

}
