package wdsr.exercise1.conversions;

import java.util.Arrays;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * Created by Marek on 14.02.2016.
 */



public class ArrayConverter {
	
	private static final Logger log2 = LogManager.getLogger();
	
    public int[] convertToInts(String[] strings) {
    	log2.debug("convertToInts entered [args={}]", Arrays.toString(strings));
    	int[] rezultat = Arrays.stream(strings).mapToInt(Integer::valueOf).toArray();
    	log2.debug("convertToInts exited [result={}]", rezultat);
        return rezultat;
    }
}
