package Builder;

public class Main {
    public static void main(String[] args) {
        RobotBuilder oldStyleRobot = new OldRobotBuilder();

        RobotDirector director = new RobotDirector(oldStyleRobot);
        director.makeRobot();

        //director returns the right robot based off spec
        Robot firsRobot = director.getRobot();
        System.out.println("Robot built :)");
        System.out.println("Robot head type: " + firsRobot.getRobotHead());
        System.out.println("Robot torso type: " + firsRobot.getRobotTorso());
        System.out.println("Robot arms type: " + firsRobot.getRobotArms());
        System.out.println("Robot legs type: " + firsRobot.getRobotLegs());
        System.out.println("");
    }
}
