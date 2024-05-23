package android.src.main.java.com.example.twilio_chat_conversation.Interface;
import java.util.Map;

public interface TypingInterface {
    default void onTypingUpdate(boolean message) {}

}