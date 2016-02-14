package ut.org.pixnbits.atlassian.swagger;

import org.junit.Test;
import org.pixnbits.atlassian.swagger.api.MyPluginComponent;
import org.pixnbits.atlassian.swagger.impl.MyPluginComponentImpl;

import static org.junit.Assert.assertEquals;

public class MyComponentUnitTest
{
    @Test
    public void testMyName()
    {
        MyPluginComponent component = new MyPluginComponentImpl(null);
        assertEquals("names do not match!", "myComponent",component.getName());
    }
}