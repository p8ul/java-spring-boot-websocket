<h3 align="center"> Spring boot Web-socket playground</h3>

![Screenshot](/screenshots/gif.gif?raw=true "Screenshot")

<!-- GETTING STARTED -->
## Getting Started

To get a local copy up and running follow these simple example steps.

### Prerequisites

This is an example of how to list things you need to use the software and how to install them.
* java v11+

### Installation

1. Clone the repo
   ```sh
   git clone https://github.com/p8ul/java-spring-boot-websocket-playground.git
   ```
2. Install packages
   ```sh
   mvn install
   ```


<!-- USAGE EXAMPLES -->
## Usage
Run `WebsocketsdemoApplicataion` then open your browser and navigate to  `http://localhost:8080`

You can send an message by entering a text on the message input and clicking send button or use send a request to `localhost:8080/send-message` 

```bash
curl --location --request POST 'localhost:8080/send-message' \
--header 'Content-Type: application/json' \
--header 'Cookie: csrftoken=od0BPOSlRpUHEeWOa6QaedIOuCId7MHx7zbQBSGRCfTRCyb8DwMzU0Wu6Z26IW38; sessionid=eyuamddu7tvnni6wvsxux8y96dxzhgvq' \
--data-raw '{
    "messageContent": "world"
}'
```