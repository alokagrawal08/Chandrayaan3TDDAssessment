
public class LunarCraftControl {
    private int x,y,z;
    char direction;
    char previous_direction;
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
            case 'b':
                moveBackward();
                break;
            case 'r':
                turnRight();
                break;
            case 'l':
                turnLeft();
                break;
            case 'u':
                turnUpward();
                break;
            case 'd':
                turnDownward();
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

    public void moveBackward() {
        switch (direction) {
            case 'N':
                y--;
                break;
            case 'S':
                y++;
                break;
            case 'E':
                x--;
                break;
            case 'W':
                x++;
                break;
            case 'U':
                z--;
                break;
            case 'D':
                z++;
                break;
        }
    }

   public void turnRight() {
       if (direction == 'U'||direction == 'D') {
           switch (previous_direction) {
               case 'N':
                   direction = 'E';
                   break;
               case 'S':
                   direction = 'W';
                   break;
               case 'E':
                   direction = 'S';
                   break;
               case 'W':
                   direction = 'N';
                   break;
           }
       }
       else {
           switch (direction) {
               case 'N':
                   direction = 'E';
                   break;
               case 'S':
                   direction = 'W';
                   break;
               case 'E':
                   direction = 'S';
                   break;
               case 'W':
                   direction = 'N';
                   break;
           }
       }
   }
    public void turnLeft() {
        if (direction == 'U'||direction == 'D') {
            switch (previous_direction) {
                case 'N':
                    direction = 'W';
                    break;
                case 'S':
                    direction = 'E';
                    break;
                case 'E':
                    direction = 'N';
                    break;
                case 'W':
                    direction = 'S';
                    break;
            }
        } else {
            switch (direction) {
                case 'N':
                    direction = 'W';
                    break;
                case 'S':
                    direction = 'E';
                    break;
                case 'E':
                    direction = 'N';
                    break;
                case 'W':
                    direction = 'S';
                    break;
            }
        }
    }

    public void turnUpward() {
        previous_direction=direction;
        if (direction == 'N' || direction == 'S'||direction == 'E'||direction == 'W') {
            direction = 'U';
        }
    }

    public void turnDownward() {
        previous_direction=direction;
        if (direction == 'N' || direction == 'S'||direction == 'E'||direction == 'W') {
            direction = 'D';
        }
    }

    public String getPositionAndDirection() {
        return "(" + x + ", " + y + ", " + z + ") - " + direction;
}
    public static void main(String[] args) {
        LunarCraftControl chandrayaan3=new LunarCraftControl(-1,2,0,'S');
        System.out.println("Initial Position: " + chandrayaan3.getPositionAndDirection());
        char[] commands={'u','f','l','d'};
        chandrayaan3.implementCommands(commands);
        System.out.println("Final Position: " + chandrayaan3.getPositionAndDirection());
        }
    }
