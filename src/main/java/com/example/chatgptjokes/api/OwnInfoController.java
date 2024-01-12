package com.example.chatgptjokes.api;



import com.example.chatgptjokes.dtos.MyResponse;
import com.example.chatgptjokes.service.OpenAiService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/owninfo")
@CrossOrigin(origins = "*")
public class OwnInfoController {

  private final String SYSTEM_MESSAGE="You are a helpful assistant. When using any of the following links make your response as short as possible."
          +"When asked about who made this ChatGPT example, reply with a link to this linkedin account: https://www.linkedin.com/in/kahalani/"
          +"When asked about where to find this example code, reply with link to this github repository: https://github.com/RonniKahalani/chatgpt-jokes"
          +"When asked about if the author of this example have a website, reply with link to this website: https://learningisliving.dk";

  OpenAiService openAiService;

  public OwnInfoController(OpenAiService openAiService) {
    this.openAiService = openAiService;
  }

  @GetMapping
  public MyResponse getInfo(@RequestParam String question){
    return openAiService.makeRequest(question,SYSTEM_MESSAGE);
  }
}
