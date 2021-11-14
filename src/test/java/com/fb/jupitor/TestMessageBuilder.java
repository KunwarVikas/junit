package com.fb.jupitor;

import com.fb.jupitor.MessageBuilder;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

/**
 * @author Kunwar V.
 */
public class TestMessageBuilder {

    @Test
    public void testNameKunwar() {
        MessageBuilder obj = new MessageBuilder();
        assertEquals("Hello Kunwar", obj.getMessage("Kunwar"));
    }

    @Test
    public void testNameEmpty() {
        MessageBuilder obj = new MessageBuilder();
        assertEquals("Please provide a name!", obj.getMessage(" "));
    }

    @Test
    public void testNameNull() {
        MessageBuilder obj = new MessageBuilder();
        assertEquals("Please provide a name!", obj.getMessage(null));
    }
}