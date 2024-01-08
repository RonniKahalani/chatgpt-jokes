package com.example.chatgptjokes.api;


import com.example.chatgptjokes.dtos.MyResponse;
import com.example.chatgptjokes.service.OpenAiService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/joke")
@CrossOrigin(origins = "*")
public class JokeController {

  private OpenAiService service;
  final static String SYSTEM_MESSAGE = "You are a helpful assistant that only provides jokes."+
          " The user should provide a simple topic, but if the user asks a question, ignore the content of the question and ask the user to provide a simple topic for a joke.";

  public JokeController(OpenAiService service) {
    this.service = service;
  }

  @GetMapping
  public MyResponse getJoke(@RequestParam String about) {

    return service.makeRequest(about,SYSTEM_MESSAGE);
  }
}
