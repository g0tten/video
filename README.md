## Gotten for Video Streaming APIs

### Gotten for video streaming APIs running example

The goal here is to show Gotten's generality and flexibility by describing an MT environment for video streaming APIs. To show the power of our approach, we group APIs into domains, like video streaming, audio streaming, hotel bookings, or flight bookings, as figure below depicts:

![APIs diagram](https://raw.githubusercontent.com/g0tten/images/main/figures/apis.png)

This way, we can describe each domain by means of a meta-model, define a set of MRs for each of them, and the different processors that implement the corresponding API, such as YouTube and Vimeo in the case of video streaming.

The following figure shows a meta-model to represent video streaming APIs. Class VideoAPITest represent a test case, which has a name (attribute testName). For simplicity, a test case is made of a single operation, which can be of three kinds: search, upload and update. Upload and update require a video parameter, described by an id, and optionally a title, a description, and a list of tags. Each video may provide statistical information (class VideoStatistics) like the number of visualisations and likes received. The output of the execution of these operations is stored in the reference results.

![Video Streaming APIs meta-model](https://raw.githubusercontent.com/g0tten/images/main/model/video_streaming_mm.png)

### The mrDSL program for video streaming APIs

Since it is difficult to establish an oracle to test if a video streaming API performs as expected, we use MT. The following listing shows the mrDSL program created with the Gotten framework to apply MT to this video streaming APIs domain: 

```
metamodel videostream "/video/model/VideoStream.ecore" with m1, m2
models "/video/model/videotc" 

videostream input Features {
  context VideoAPITest def: IsSearch: Boolean = request.oclIsTypeOf(SearchVideo)
  context VideoAPITest def: IsUpdate: Boolean = request.oclIsTypeOf(UpdateVideo)
  context SearchVideo def: MaxResults: Int = maxResults
  context SearchVideo def: SearchOrder: Int = orderType
}

output Features {
  NVideos : Long
  OutputVideoId: Long
  OutputVideoTitle: String
}

Processor {
  Name: String
  Version: String
}
 
MetamorphicRelations {
 MR1 = [ (IsSearch(m1) and (MaxResults(m1) >= MaxResults(m2))) 
         implies 
         (NVideos(m1) >= NVideos(m2))]
 MR2 = [ (IsSearch(m1) and (SearchOrder(m1) <> SearchOrder(m2))) 
         implies 
         (NVideos(m1) == NVideos(m2))]
 MR3 = [ (IsUpdate(m1) and ((m1) == (m2)))
         implies 
         ((OutputVideoId(m1) <> OutputVideoId(m2)) and
         (OutputVideoTitle(m1) == OutputVideoTitle(m2)))]
}
```

### MRs for video streaming APIs brief description

Below we provide a brief description of these 3 MRs for video streaming APIs:

Relation | Description |
--- | :--- | 
MR1 | The maximum number of videos requested by the search m1 is greater than or equals to the maximum number of videos requested by the search m2. |
&nbsp; | MR1i = [ (IsSearch(m1) and (MaxResults(m1) >= MaxResults(m2))) ] |
&nbsp; | The number of videos returned by the search m1 should be greater than or equal to the number of videos returned by the search m2. |
&nbsp; | MR1o = [ (NVideos(m1) >= NVideos(m2))] |
MR2 | The search order of m1 is different to the search order of m2. |
&nbsp; | MR2i = [ (IsSearch(m1) and (SearchOrder(m1) <> SearchOrder(m2)))  ] |
&nbsp; | The number of videos returned by the search m1 should be equal to the number of videos returned by the search m2. |
&nbsp; | MR2o = [ (NVideos(m1) == NVideos(m2))] |
MR3 | The update m1 is equal to the update m2. |
&nbsp; | MR3i = [ (IsUpdate(m1) and ((m1) == (m2)) ] |
&nbsp; | The video id returned by m1 should be different to the video id returned by m2. The video title returned by m1 should be equal to the video title returned by m2. |
&nbsp; | MR3o = [ ((OutputVideoId(m1) <> OutputVideoId(m2)) <br />&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; and (OutputVideoTitle(m1) == OutputVideoTitle(m2))) ] |

### Conducted experiment description with Gotten for YouTube and Vimeo

For MR1 and MR2, we designed the source test cases selecting queries based on trending searches from YouTube and Vimeo (e.g 'world cup', 'esports', etc.) and complemented them with some corner cases extracted from Segura et al.[^1], e.g. 'winter pentathlon 1949' and 'mistrustfully'. All tests could be reused for YouTube and Vimeo.

Executing all tests in YouTube took 4 minutes and 4 seconds, and 10 minutes and 36 seconds for Vimeo. The results show that the proposed framework is not only able to model the MRs provided - in natural language - by Segura et al.[^1], but is able to reproduce the obtained results and detect real issues reported in the [issue tracking systems](https://code.google.com/p/gdata-issues/issues/detail?id=5173) of the studied platforms.

[^1]: Metamorphic testing of RESTful web APIs. S. Segura, J. A. Parejo, J. Troya, and A. Ruiz Cortés. IEEE Transactions on Software Engineering, 44(11):1083–1099, 2018.

### Gotten for YouTube and Vimeo project download link

You can download the Gotten project for YouTube and Vimeo platforms along with all the data generated and used in the performed experiment described above here:

- [Gotten for YouTube and Vimeo](https://github.com/g0tten/video/zipball/main)

### Gotten for video streaming APIs environment in action

- Click on the image below to watch a video demo of the Gotten environment for Video Streaming APIs:

[![Gotten for video streaming APIs environment in action](https://raw.githubusercontent.com/g0tten/images/main/ide/gotten_video_screenshot.png)](https://youtu.be/10MDPC9jQQI)

### Acknowledgements
This work has been funded by the Spanish Ministry of Science (RTI2018-095255-B-I00, project "MASSIVE") and the R&D programme of Madrid (P2018/TCS-4314, project "[FORTE](https://antares.sip.ucm.es/forte-cm/)").
