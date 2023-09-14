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
}