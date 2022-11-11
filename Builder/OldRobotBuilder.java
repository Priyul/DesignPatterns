package Builder;

public class OldRobotBuilder implements RobotBuilder {
    private Robot robot;

    public OldRobotBuilder() {
        this.robot = new Robot(); //creates a robot object and adds onto it
    }

    @Override
    public void buildRobotHead() {
        robot.setRobotHead("Tin Head");
    }

    @Override
    public void buildRobotTorso() {
        robot.setRobotTorso("Tin Torso");
    }

    @Override
    public void buildRobotArms() {
        robot.setRobotArms("Blowtorch arm");
    }

    @Override
    public void buildRobotLegs() {
        robot.setRobotLegs("Rollerskate legs");
    }

    @Override
    public Robot getRobot() {
        
        return this.robot;
    }

    
}
