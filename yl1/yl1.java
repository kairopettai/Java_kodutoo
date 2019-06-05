import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
 
public class yl1 {
 
	public static void main(String[] args) throws FileNotFoundException, IOException {
 
		File file = new File("/home/pettkair/public_html/yl1/tekst.txt");
		BufferedReader bufferedReader = null;
		bufferedReader = new BufferedReader(new FileReader(file));
		String inputLine = null;
		Map<String, Integer> crunchifyMap = new HashMap<>();
 
		try {
			while ((inputLine = bufferedReader.readLine()) != null) {
				String[] words = inputLine.split("[ \n\t\r.,;:!?(){}]");
 
				for (int counter = 0; counter < words.length; counter++) {
					String key = words[counter].toLowerCase(); 
					if (key.length() > 0) {
						if (crunchifyMap.get(key) == null) {
							crunchifyMap.put(key, 1);
						} else {
							int value = crunchifyMap.get(key).intValue();
							value++;
							crunchifyMap.put(key, value);
						}
					}
				}
			}
			Set<Map.Entry<String, Integer>> entrySet = crunchifyMap.entrySet();
			System.out.println("Sõnad" + "\t\t" + "kordused");
			for (Map.Entry<String, Integer> entry : entrySet) {
				System.out.println(entry.getKey() + "\t\t" + entry.getValue());
			}
			
 
		}
 
		
 
	}
 
	
	
}
