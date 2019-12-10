package unittest;

import junit.framework.Assert;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import unittes.MessageProcessor1841720003Mayang;

public class MessageProcessorTest184172003Mayang {

    MessageProcessor1841720003Mayang mp;

    public MessageProcessorTest184172003Mayang() {
        mp = new MessageProcessor1841720003Mayang();
        mp.setmSenderMayang("Ronaldo");
        mp.setmRecipientMayang("Rafael");
        mp.setmMessageMayang("Whats up bro?");
    }

    @BeforeClass
    public static void setUpClassMayang() {
    }

    @AfterClass
    public static void tearDownClassMayang() {
    }

    @Before
    public void setUpMayang() {
    }

    @After
    public void tearDownMayang() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    @Test
    public void testShowMessageMayang() {
        String expectedResult = "Hai Rafael, you have message from Ronaldo.\nThe message as follows : Whats up bro?";
        Assert.assertEquals(expectedResult, mp.messageFormatMayang());
    }
}
