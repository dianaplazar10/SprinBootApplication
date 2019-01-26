package org.springboot.TopicJPA;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class TopicService{

		private List<Topic> topics = new ArrayList<>
						(Arrays.asList(
							(new Topic("1","one","one desc")),
							(new Topic("2","one","one desc")),
							(new Topic("3","one","one desc"))
						));  // --------(a)
						
		
//		1)	GET - All topics
		public List<Topic> getTopics(){
			return topics;
		}
		
		
//		2)	GET - All a Topic based on Id passed	
		public Topic getTopicById(String id){		
			return topics.stream().filter(t->t.getId().equals(id)).findFirst().get();
		}
		
//		3)	POST - Add a Topic based on Topic JSON	
		public void addTopic(Topic topic){		
			topics.add(topic);
		}
		
//		4)  PUT - Update an existing Topic, given the Topic Id
		public void updateTopicById(Topic topic,String id){	
			Topic topicExisting = topics.stream().filter(t->t.getId().equals(id)).findFirst().get();
			topics.remove(topicExisting);
			topics.add(topicExisting);
		} 
}