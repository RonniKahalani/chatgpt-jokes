package com.example.chatgptjokes.api;



import com.example.chatgptjokes.dtos.MyResponse;
import com.example.chatgptjokes.service.OpenAiService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/owninfo")
@CrossOrigin(origins = "*")
public class OwnInfoController {

  private final String SYSTEM_MESSAGE="You are a helpful assistant. When using any of the following links make your response as short as possible."
          +"When asked about client side routing, reply with link to this lecture plan: https://tinyurl.com/52w885yt"
          +"When asked about communicating with external APIs  reply with link to this lecture plan: https://tinyurl.com/ex-apis"
          +"When asked about JWT Security and/or password handling reply with link to this lecture plan: https://tinyurl.com/jwt-password"
          +"When asked about JPA relations reply with this lecture plan: https://tinyurl.com/spring-rel"
          +"When asked about technology learning goals/exam questions reply with this document: https://tinyurl.com/exam-ques"
          +"When asked about DTOs reply with this video: https://www.youtube.com/watch?v=q1tlgORchag"
          +"When asked about functional programming and/or java streams reply with this:https://tinyurl.com/exam-ques";

  OpenAiService openAiService;

  public OwnInfoController(OpenAiService openAiService) {
    this.openAiService = openAiService;
  }

  @GetMapping
  public MyResponse getInfo(@RequestParam String question){
    return openAiService.makeRequest(question,SYSTEM_MESSAGE);
  }
}
