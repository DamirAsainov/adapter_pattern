public class SoccerPlayer {
    private float mass; // in pound
    private float height; // in foot
    private float speedMPH;
    private String name;
    private String surname;
    private String position;

    public SoccerPlayer(){}
    public SoccerPlayer(float mass, float height, float speedMPH, String name, String surname, String position) {
        this.mass = mass;
        this.height = height;
        this.speedMPH = speedMPH;
        this.name = name;
        this.surname = surname;
        this.position = position;
    }

    public float getMass() {
        return mass;
    }

    public void setMass(float mass) {
        this.mass = mass;
    }

    public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    public float getSpeedMPH() {
        return speedMPH;
    }

    public void setSpeedMPH(float speedMPH) {
        this.speedMPH = speedMPH;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }


}
