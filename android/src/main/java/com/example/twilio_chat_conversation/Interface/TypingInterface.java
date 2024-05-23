package com.example.twilio_chat_conversation.Interface;

import java.util.Map;

public interface TypingInterface {
    void onTypingUpdate(Map<String, Object> typingEvent);
}
