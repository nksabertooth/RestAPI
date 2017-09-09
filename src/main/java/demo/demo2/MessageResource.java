package demo.demo2;

import javax.ws.rs.core.MediaType;
import javax.ws.rs.*;
import demo.demo2.Message;
import demo.demo2.MessageService;
import java.util.List;
@Path("/messages")
public class MessageResource {
	
    MessageService ms= new MessageService();
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<Message> getMessages() {
		return ms.getAllMessages();
	}
	
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public Message addMessage(Message message) {
		return ms.addMessage(message);
	}
	
    @GET
    @Path("{messageId}")
    @Produces(MediaType.APPLICATION_JSON)
    public Message getMessage(@PathParam("messageId") long messageId) {
    	return ms.getMessages(messageId);
    }
	
}
