import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LunarCraftControlTest {
    @Test
    public void testInitialState() {
        LunarCraftControl Chandrayaan3 = new LunarCraftControl(0,0,0,'N');
        Assertions.assertEquals("(0, 0, 0) - N", Chandrayaan3.getPositionAndDirection());
    }

    @Test
    public void testForwardMovement() {
        LunarCraftControl Chandrayaan3 = new LunarCraftControl(0,0,0,'N');
        Chandrayaan3.implementCommands(new char[]{'f'});
        Assertions.assertEquals("(0, 1, 0) - N", Chandrayaan3.getPositionAndDirection());
    }

    @Test
    public void testBackwardMovement() {
        LunarCraftControl Chandrayaan3 = new LunarCraftControl(0,0,0,'N');
        Chandrayaan3.implementCommands(new char[]{'b'});
        Assertions.assertEquals("(0, -1, 0) - N", Chandrayaan3.getPositionAndDirection());
    }

    @Test
    public void testTurnRight() {
        LunarCraftControl Chandrayaan3 = new LunarCraftControl(1,1,-1,'N');
        Chandrayaan3.implementCommands(new char[]{'r'});
        Assertions.assertEquals("(1, 1, -1) - E", Chandrayaan3.getPositionAndDirection());
    }

    @Test
    public void testTurnLeft() {
        LunarCraftControl Chandrayaan3 = new LunarCraftControl(0,1,-1,'N');
        Chandrayaan3.implementCommands(new char[]{'l'});
        Assertions.assertEquals("(0, 1, -1) - W", Chandrayaan3.getPositionAndDirection());
    }

    @Test
    public void testTurnUpward() {
        LunarCraftControl Chandrayaan3 = new LunarCraftControl(0,0,0,'N');
        Chandrayaan3.implementCommands(new char[]{'u'});
        Assertions.assertEquals("(0, 0, 0) - U", Chandrayaan3.getPositionAndDirection());
    }

    @Test
    public void testTurnDownward() {
        LunarCraftControl Chandrayaan3 = new LunarCraftControl(1,1,1,'W');
        Chandrayaan3.implementCommands(new char[]{'d'});
        Assertions.assertEquals("(1, 1, 1) - D", Chandrayaan3.getPositionAndDirection());
    }

}