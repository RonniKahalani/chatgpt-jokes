## ChatGPT Jokes Example

This example shows how to use the ChatGPT API.

This example was originally made by my fellow computer science lecturer Lars Mortensen (retired), som the Copenhagen School of Design & Technology.

It consists of a simple Java Spring backend and a browser-based frontend (HTML, CSS and JavaScript) page.

### Backend
There are 3 different features (controllers)
- [JokeController.java](https://github.com/RonniKahalani/chatgpt-jokes/blob/master/src/main/java/com/example/chatgptjokes/api/JokeController.java)
- [JokeLimitedController.java](https://github.com/RonniKahalani/chatgpt-jokes/blob/master/src/main/java/com/example/chatgptjokes/api/JokeLimitedController.java)
- [OwnInfoController.java](https://github.com/RonniKahalani/chatgpt-jokes/blob/master/src/main/java/com/example/chatgptjokes/api/OwnInfoController.java)

### Services
- [OpenAiService](https://github.com/RonniKahalani/chatgpt-jokes/blob/master/src/main/java/com/example/chatgptjokes/service/OpenAiService.java)
- [OpenAiServiceV1](https://github.com/RonniKahalani/chatgpt-jokes/blob/master/src/main/java/com/example/chatgptjokes/service/OpenAiServiceV1.java)


### Frontend
- [index.html](https://github.com/RonniKahalani/chatgpt-jokes/blob/master/src/main/resources/static/index.html)
- [main.css](https://github.com/RonniKahalani/chatgpt-jokes/blob/master/src/main/resources/static/css/main.css)
- [main.js](https://github.com/RonniKahalani/chatgpt-jokes/blob/master/src/main/resources/static/js/main.js)