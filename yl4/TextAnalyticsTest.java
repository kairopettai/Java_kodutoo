package kt_example.kt_example;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

import java.util.List;

import org.junit.Test;

public class TextAnalyticsTest{



    @Test
    public void TestIfWordsNotNull(){
        TextAnalytics analytics = new TextAnalytics();
        String[] words = analytics.split_words_into_pieces("Pornograafia algtõed");
        assertNotNull(words);
    }

    @Test
    public void TestIfItHasWords(){
        TextAnalytics analytics = new TextAnalytics();
        String[] words = analytics.split_words_into_pieces("Pornograafia põhitõed");
        assertTrue(words.length > 1);
    }  

}