package com.example.Service;

import com.example.Model.Message;
import com.example.Repository.MessageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class MessageService {


    private final MessageRepository messageRepository;

    @Autowired
    public MessageService(MessageRepository messageRepository) {
        this.messageRepository = messageRepository;
    }

    public Message getMessageByID(int message_id) {
        System.out.println("This is in service");
        return messageRepository.getMessageByID(message_id);}

    public ArrayList<Message> getAllMessages() { return messageRepository.getAllMessages();}

    public ArrayList<Message> getMessageByAccount(int posted_by) { return messageRepository.getMessageByAccount(posted_by);}

    public void updateMessage(String message_text, int message_id) {messageRepository.updateMessage(message_text, message_id);}

    public void deleteMessage(int message_id) {messageRepository.deleteMessage(message_id);}

    public void newMessage(int posted_by, String message_text, long time_posted_epoch) {messageRepository.newMessage(posted_by, message_text, time_posted_epoch);}

}