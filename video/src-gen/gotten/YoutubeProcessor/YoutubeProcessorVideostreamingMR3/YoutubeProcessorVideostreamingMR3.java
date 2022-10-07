package gotten.YoutubeProcessor.YoutubeProcessorVideostreamingMR3;

import gotten.utils.IGottenExecutor;
import java.util.Map;
import java.util.TreeMap;
import java.util.AbstractMap.SimpleEntry;

public class YoutubeProcessorVideostreamingMR3 implements IGottenExecutor {
	private static void registerMetamorphicResult(Map<String, Map<String, SimpleEntry<Boolean, Boolean>>> results,
			String ruleName, String entryName, boolean leftHandSideEntryValue, boolean rightHandSideEntryValue) {
		Map<String, SimpleEntry<Boolean, Boolean>> entryMap = null;
		if (results.get(entryName) != null) {
			entryMap = results.get(entryName);
		} else {
			entryMap = new TreeMap<String, SimpleEntry<Boolean, Boolean>>();
		}
		entryMap.put(ruleName, new SimpleEntry<Boolean, Boolean>(leftHandSideEntryValue, rightHandSideEntryValue));
		results.put(entryName, entryMap);
	}

	public static Map<String, Map<String, SimpleEntry<Boolean, Boolean>>> evaluateMR3() {
		Map<String, Map<String, SimpleEntry<Boolean, Boolean>>> results = new TreeMap<String, Map<String, SimpleEntry<Boolean, Boolean>>>();
		return results;
	}
}
