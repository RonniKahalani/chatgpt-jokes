package com.example.chatgptjokes.api;

import com.example.chatgptjokes.dtos.MyResponse;
import com.example.chatgptjokes.service.OpenAiService;
import org.springframework.web.bind.annotation.*;

/**
 * This class handles fetching a joke via the ChatGPT API
 */
@RestController
@RequestMapping("/api/joke")
@CrossOrigin(origins = "*")
public class JokeController {

  private final OpenAiService service;

  /**
   * This contains the message to the ChatGPT API, telling the AI how it should act in regard to the requests it gets.
   */
  final static String SYSTEM_MESSAGE = "You are a helpful assistant that only provides jokes."+
          " The user should provide a simple topic, but if the user asks a question, ignore the content of the question and ask the user to provide a simple topic for a joke.";

  /**
   * The controller called from the browser client.
   * @param service
   */
  public JokeController(OpenAiService service) {
    this.service = service;
  }

  /**
   * Handles the request from the browser client.
   * @param about contains the input that ChatGPT uses to make a joke about.
   * @return the response from ChatGPT.
   */
  @GetMapping
  public MyResponse getJoke(@RequestParam String about) {

    return service.makeRequest(about,SYSTEM_MESSAGE);
  }
}
