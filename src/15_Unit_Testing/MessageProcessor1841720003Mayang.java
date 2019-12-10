package unittes;

public class MessageProcessor1841720003Mayang {

    private String mMessage, mRecipient, mSender;

    public String getmMessageMayang() {
        return mMessage;
    }

    public void setmMessageMayang(String mMessage) {
        this.mMessage = mMessage;
    }

    public String getmRecipientMayang() {
        return mRecipient;
    }

    public void setmRecipientMayang(String mRecipient) {
        this.mRecipient = mRecipient;
    }

    public String getmSenderMayang() {
        return mSender;
    }

    public void setmSenderMayang(String mSender) {
        this.mSender = mSender;
    }

    public String messageFormatMayang() {
        String message = String.format("Hai %s, you have message from %s.\nThe message as follows : %s", this.mRecipient, this.mSender, this.mMessage);
        return message;
    }

    public void showMessageMayang() {
        System.out.println(messageFormatMayang());
    }
}
