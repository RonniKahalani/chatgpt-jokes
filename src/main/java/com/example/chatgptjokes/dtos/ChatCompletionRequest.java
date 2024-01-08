package com.example.chatgptjokes.dtos;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

/*
 This DTO was made by ChatGPT 4.0 using this prompt
 https://chat.openai.com/share/457d16e0-5823-47ab-974b-373a423f9068
 */
@Getter
@Setter
public class ChatCompletionRequest {

  private String model;
  private List<Message> messages = new ArrayList<>();
  private double temperature;
  private int max_tokens;
  private double top_p;
  private double frequency_penalty;
  private double presence_penalty;

  @Getter
  @Setter
  public static class Message {
    private String role;
    private String content;

    public Message(String role, String content) {
      this.role = role;
      this.content = content;
    }
  }
}
