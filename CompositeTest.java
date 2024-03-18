import org.junit.Test;

import java.beans.Transient;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.assertEquals;

public class CompositeTest {
    @Test
    public void testComposite {
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        PrintStream printStream = new PrintStream(outputStream);
        System.setOut(printStream);

        Component leaf1 = new Leaf();
        Component leaf2 = new Leaf();

        Component composite1 = new Composite();
        composite1.addComponent(leaf1);
        composite2.addComponent(leaf2);


        Component leaf3 = new Leaf();
        Component composite2 = new Composite();
        composite2.addComponent(leaf3);
        composite2.addComponent(composite1);


        composite2.operation();

        assertEquals("Выполняется в составном компоненте" +
        "Выполняется в простом компоненте" +
        "Выполняется в простом компоненте"+
        "Выполняется в составном компоненте"+
        "Выполняется в простом компоненте", outputStream.toString());

    }
    
}
x   