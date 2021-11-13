package com.junit.jacoco.without.mock.messagebuilder;

/**
 * @author Kunwar V.
 */
public class MessageBuilder {
    public String getMessage(String name) {
        StringBuilder result = new StringBuilder();
        if (name == null || name.trim().length() == 0) {
            result.append("Please provide a name!");
        }else {
            result.append("Hello " + name);
        }
        return result.toString();
    }
}