package facebook.vertex.service;
import facebook.vertex.model.User;
import facebook.vertex.service.message.HappyBuilder;
import facebook.vertex.service.message.MessageBuilder;

public class MessageService {
    public static void main2(String[] args){
        final User user = new User();
        user.setName("Alex");
        user.setSurname("Nikson");
        MessageBuilder builder= new HappyBuilder();
        final String message=builder.build(user);
        System.out.println(message);



    }
}
