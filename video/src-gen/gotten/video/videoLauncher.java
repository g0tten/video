package gotten.video;

import gotten.VimeoProcessor.VimeoProcessorVideostreamingMR1.VimeoProcessorVideostreamingMR1;
import gotten.VimeoProcessor.VimeoProcessorVideostreamingMR2.VimeoProcessorVideostreamingMR2;
import gotten.VimeoProcessor.VimeoProcessorVideostreamingMR3.VimeoProcessorVideostreamingMR3;
import gotten.YoutubeProcessor.YoutubeProcessorVideostreamingMR1.YoutubeProcessorVideostreamingMR1;
import gotten.YoutubeProcessor.YoutubeProcessorVideostreamingMR2.YoutubeProcessorVideostreamingMR2;
import gotten.YoutubeProcessor.YoutubeProcessorVideostreamingMR3.YoutubeProcessorVideostreamingMR3;
import java.util.Map;
import java.util.TreeMap;
import java.util.AbstractMap.SimpleEntry;

public class videoLauncher {
	private Map<String, Map<String, Map<String, SimpleEntry<Boolean, Boolean>>>> results = new TreeMap<String, Map<String, Map<String, SimpleEntry<Boolean, Boolean>>>>();

	public Map<String, Map<String, Map<String, SimpleEntry<Boolean, Boolean>>>> evaluateVimeoProcessor() {
		results.put("VimeoProcessor#MR1", VimeoProcessorVideostreamingMR1.evaluateMR1());
		results.put("VimeoProcessor#MR2", VimeoProcessorVideostreamingMR2.evaluateMR2());
		results.put("VimeoProcessor#MR3", VimeoProcessorVideostreamingMR3.evaluateMR3());
		return results;
	}

	public Map<String, Map<String, Map<String, SimpleEntry<Boolean, Boolean>>>> evaluateYoutubeProcessor() {
		results.put("YoutubeProcessor#MR1", YoutubeProcessorVideostreamingMR1.evaluateMR1());
		results.put("YoutubeProcessor#MR2", YoutubeProcessorVideostreamingMR2.evaluateMR2());
		results.put("YoutubeProcessor#MR3", YoutubeProcessorVideostreamingMR3.evaluateMR3());
		return results;
	}
}
