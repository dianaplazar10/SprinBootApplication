package org.springboot.TopicJPA;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TopicsController {
	
	@Autowired
	private TopicService topicService;
	
	
//	1)	GET - All topics	
	@RequestMapping("/topics")
	private List<Topic> getTopics(){		
		return topicService.getTopics();
	}
	
//	2)	GET - All a Topic based on Id passed	
	@RequestMapping("/topics/{id}")
	private Topic getTopicById(@PathVariable String id){		
		return topicService.getTopicById(id);
	}
	
//	3)	POST - Add a Topic based on Topic JSON	
	@RequestMapping(method=RequestMethod.POST,value = "/topics")
	public void addTopic(@RequestBody Topic topic){		
		topicService.addTopic(topic);
	} 
	
	
//	4)  PUT - Update an existing Topic, given the Topic Id
	@RequestMapping(method=RequestMethod.PUT,value = "/topics/{id}")
	public void updateTopicById(@RequestBody Topic topic,@PathVariable String id){		
		topicService.updateTopicById(topic,id);
	} 
}