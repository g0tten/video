package gotten.VimeoProcessor.VimeoProcessorVideostreamingMR2;

import gotten.utils.IGottenExecutor;
import java.util.Map;
import java.util.TreeMap;
import java.util.AbstractMap.SimpleEntry;

public class VimeoProcessorVideostreamingMR2 implements IGottenExecutor {
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

	public static Map<String, Map<String, SimpleEntry<Boolean, Boolean>>> evaluateMR2() {
		Map<String, Map<String, SimpleEntry<Boolean, Boolean>>> results = new TreeMap<String, Map<String, SimpleEntry<Boolean, Boolean>>>();
		registerMetamorphicResult(results, "MR2",
				"videotc/videosource.model#videotc/videosource/mr2/followup_00002.model", true, true);
		registerMetamorphicResult(results, "MR2",
				"videotc/videosource10.model#videotc/videosource10/mr2/followup_00002.model", true, true);
		registerMetamorphicResult(results, "MR2",
				"videotc/videosource11.model#videotc/videosource11/mr2/followup_00002.model", false, true);
		registerMetamorphicResult(results, "MR2",
				"videotc/videosource12.model#videotc/videosource12/mr2/followup_00002.model", true, true);
		registerMetamorphicResult(results, "MR2",
				"videotc/videosource13.model#videotc/videosource13/mr2/followup_00002.model", true, true);
		registerMetamorphicResult(results, "MR2",
				"videotc/videosource14.model#videotc/videosource14/mr2/followup_00002.model", true, true);
		registerMetamorphicResult(results, "MR2",
				"videotc/videosource15.model#videotc/videosource15/mr2/followup_00002.model", true, true);
		registerMetamorphicResult(results, "MR2",
				"videotc/videosource16.model#videotc/videosource16/mr2/followup_00002.model", true, true);
		registerMetamorphicResult(results, "MR2",
				"videotc/videosource17.model#videotc/videosource17/mr2/followup_00002.model", true, true);
		registerMetamorphicResult(results, "MR2",
				"videotc/videosource18.model#videotc/videosource18/mr2/followup_00002.model", true, true);
		registerMetamorphicResult(results, "MR2",
				"videotc/videosource19.model#videotc/videosource19/mr2/followup_00002.model", true, true);
		registerMetamorphicResult(results, "MR2",
				"videotc/videosource2.model#videotc/videosource2/mr2/followup_00002.model", true, true);
		registerMetamorphicResult(results, "MR2",
				"videotc/videosource20.model#videotc/videosource20/mr2/followup_00002.model", true, true);
		registerMetamorphicResult(results, "MR2",
				"videotc/videosource21.model#videotc/videosource21/mr2/followup_00002.model", true, true);
		registerMetamorphicResult(results, "MR2",
				"videotc/videosource22.model#videotc/videosource22/mr2/followup_00002.model", true, true);
		registerMetamorphicResult(results, "MR2",
				"videotc/videosource23.model#videotc/videosource23/mr2/followup_00002.model", true, true);
		registerMetamorphicResult(results, "MR2",
				"videotc/videosource24.model#videotc/videosource24/mr2/followup_00002.model", true, true);
		registerMetamorphicResult(results, "MR2",
				"videotc/videosource25.model#videotc/videosource25/mr2/followup_00002.model", true, true);
		registerMetamorphicResult(results, "MR2",
				"videotc/videosource26.model#videotc/videosource26/mr2/followup_00002.model", true, true);
		registerMetamorphicResult(results, "MR2",
				"videotc/videosource3.model#videotc/videosource3/mr2/followup_00002.model", true, true);
		registerMetamorphicResult(results, "MR2",
				"videotc/videosource30.model#videotc/videosource30/mr2/followup_00002.model", true, true);
		registerMetamorphicResult(results, "MR2",
				"videotc/videosource4.model#videotc/videosource4/mr2/followup_00002.model", false, true);
		registerMetamorphicResult(results, "MR2",
				"videotc/videosource5.model#videotc/videosource5/mr2/followup_00002.model", true, true);
		registerMetamorphicResult(results, "MR2",
				"videotc/videosource6.model#videotc/videosource6/mr2/followup_00002.model", true, true);
		registerMetamorphicResult(results, "MR2",
				"videotc/videosource7.model#videotc/videosource7/mr2/followup_00002.model", true, true);
		registerMetamorphicResult(results, "MR2",
				"videotc/videosource8.model#videotc/videosource8/mr2/followup_00002.model", true, true);
		registerMetamorphicResult(results, "MR2",
				"videotc/videosource9.model#videotc/videosource9/mr2/followup_00002.model", true, true);
		return results;
	}
}
