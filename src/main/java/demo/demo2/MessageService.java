package demo.demo2;

import demo.demo2.DatabaseClass;
import demo.demo2.Message;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;

public class MessageService {
	
	public MessageService() {
		messages.put(1L,new Message(1,"hello","Nishant"));
		messages.put(2L,new Message(2,"hello","Nis"));
		messages.put(3L,new Message(3,"hello","Nishant"));
	}
	
   private Map<Long, Message> messages=DatabaseClass.getMessages();	

  
	public List<Message> getAllMessages() {
			
		return new ArrayList<Message>(messages.values());
	}
	
	public Message getMessages(long id) {
		return messages.get(id);
	}
	
	public Message addMessage(Message message) {
		message.setId(messages.size()+1);
		messages.put(message.getId(), message);
		return message;
		
	}
	
	public Message updateMessage(Message message) {
		if(message.getId()<=0){
			return null;
		}
		messages.put(message.getId(),message);
		return message;
			
	}
	
	public Message removeMessage(long id){
		return messages.remove(id);
	}

}
