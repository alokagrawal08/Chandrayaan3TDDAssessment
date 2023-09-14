
public class LunarCraftControl {
    private int x,y,z;
    char direction;
    LunarCraftControl(int initialX, int initialY, int initialZ, char initialDirection){
        x=initialX;
        y=initialY;
        z=initialZ;
        direction=initialDirection;
    }

    void implementCommands(char[] commands) {
        for(char command:commands){
            runCommand(command);
        }
    }

    private void runCommand(char command) {
        switch (command) {
            case 'f':
                moveForward();
                break;
        }
    }

    private void moveForward() {
        switch (direction) {
            case 'N':
                y++;
                break;
            case 'S':
                y--;
                break;
            case 'E':
                x++;
                break;
            case 'W':
                x--;
                break;
            case 'U':
                z++;
                break;
            case 'D':
                z--;
                break;
        }
    }


    public String getPositionAndDirection() {
        return "(" + x + ", " + y + ", " + z + ") - " + direction;
}
    public static void main(String[] args) {
        LunarCraftControl chandrayaan3=new LunarCraftControl(0,0,0,'N');
        System.out.println("Initial Position: " + chandrayaan3.getPositionAndDirection());
        char[] commands={'f'};
        chandrayaan3.implementCommands(commands);
        System.out.println("Final Position: " + chandrayaan3.getPositionAndDirection());
        }
    }
