
public class LunarCraftControl {
    private int x,y,z;
    char direction;
    LunarCraftControl(int initialX, int initialY, int initialZ, char initialDirection){
        x=initialX;
        y=initialY;
        z=initialZ;
        direction=initialDirection;
    }


    public String getPositionAndDirection() {
        return "(" + x + ", " + y + ", " + z + ") - " + direction;
}
    public static void main(String[] args) {
        LunarCraftControl chandrayaan3=new LunarCraftControl(0,0,0,'N');
        System.out.println("Initial Position: " + chandrayaan3.getPositionAndDirection());

        System.out.println("Final Position: " + chandrayaan3.getPositionAndDirection());
        }
    }
