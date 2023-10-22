public interface IPlayer {
    public float getWeight();
    public int getHeight();
    public float getSpeedKMh();
    public String getFullName();
    public String getPosition();

    public void setWeight(float weight);
    public void setHeight(int height);
    public void setSpeedKMh(float speedKMh);
    public void setFullName(String fullName);
    public void setPosition(String position);

    public String display();





}
