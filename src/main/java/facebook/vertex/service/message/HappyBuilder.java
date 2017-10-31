package facebook.vertex.service.message;
import facebook.vertex.model.User;
import facebook.vertex.service.message.MessageBuilder;

public class HappyBuilder  extends MessageBuilder {

    @Override
    public String build(User user){
        return "Dear"
                +user.getName()
                +" "
                +user.getSurname()
                +" "
                +"Happy birthday";
    }
}
