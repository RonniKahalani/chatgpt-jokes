# ChatGPT Jokes Example

This example shows how to use the ChatGPT API.

The project was originally made by my fellow computer science lecturer Lars Mortensen (retired), from the Copenhagen School of Design & Technology.

It consists of a simple Java Spring backend and a browser-based frontend (HTML, CSS and JavaScript) page.

## Backend
There are 3 different features (controllers) in the backend:
- [JokeController.java](https://github.com/RonniKahalani/chatgpt-jokes/blob/master/src/main/java/com/example/chatgptjokes/api/JokeController.java)
- [JokeLimitedController.java](https://github.com/RonniKahalani/chatgpt-jokes/blob/master/src/main/java/com/example/chatgptjokes/api/JokeLimitedController.java)
- [OwnInfoController.java](https://github.com/RonniKahalani/chatgpt-jokes/blob/master/src/main/java/com/example/chatgptjokes/api/OwnInfoController.java)

### JokeController
Gets ChatGPT to create a joke, by passing an input, telling what the joke should be about.

### JokeLimitedController
Does the same as above, but implements an IP-rate limitation (max. number of request in a small timeframe.)

### OwnInfoController
Shows how to make custom responses that the ChatGPT AI has not been trained in.

## Services
- [OpenAiService](https://github.com/RonniKahalani/chatgpt-jokes/blob/master/src/main/java/com/example/chatgptjokes/service/OpenAiService.java)
- [OpenAiServiceV1](https://github.com/RonniKahalani/chatgpt-jokes/blob/master/src/main/java/com/example/chatgptjokes/service/OpenAiServiceV1.java)


## Frontend
- [index.html](https://github.com/RonniKahalani/chatgpt-jokes/blob/master/src/main/resources/static/index.html)
- [main.css](https://github.com/RonniKahalani/chatgpt-jokes/blob/master/src/main/resources/static/css/main.css)
- [main.js](https://github.com/RonniKahalani/chatgpt-jokes/blob/master/src/main/resources/static/js/main.js)