public class FootballPlayer implements IPlayer {
    private float weight;
    private int height;
    private float speedKMh;
    private String fullName;
    private String position;
    public FootballPlayer(){}

    public FootballPlayer(float weight, int height, float speedKMh, String fullName, String position) {
        this.weight = weight;
        this.height = height;
        this.speedKMh = speedKMh;
        this.fullName = fullName;
        this.position = position;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public float getSpeedKMh() {
        return speedKMh;
    }

    public void setSpeedKMh(float speedKMh) {
        this.speedKMh = speedKMh;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    @Override
    public String display() {
        return "Full name: " + getFullName() + "\nPosition: " + getPosition() + "\nHeight: " + getHeight() + "\nWeight: " + getWeight() + "\nSpeed in KM/H: " + getSpeedKMh();
    }
}
