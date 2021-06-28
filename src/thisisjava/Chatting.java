package thisisjava;
//9-6
public class Chatting {
    void startChat(String chatid) {
//      String nickName = null;
//      nickName = chatId; (X)
        String nickName = chatid;
        Chat chat = new Chat() {
            @Override
            public void start() {
                while(true) {
                    String inputData = "안녕하세요";
                    String message = "[" + nickName + "]" + inputData;
                    sendMessage(message);
                }
            }
        };
        chat.start();
    }
    class Chat {
        void start() {}
        void  sendMessage(String message) {}
    }
}