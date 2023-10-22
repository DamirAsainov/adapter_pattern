import java.util.Objects;

public class AdapterSoccerToFootball implements IPlayer{
    private SoccerPlayer player;

    public AdapterSoccerToFootball(SoccerPlayer player){
        this.player = player;
    }
    @Override
    public float getWeight() {
        return (float) (player.getMass() * 0.45);
    }

    @Override
    public int getHeight() {
        return (int) (player.getHeight() * 30.48);
    }

    @Override
    public float getSpeedKMh() {
        return (float) (player.getSpeedMPH() * 1.609344);
    }

    @Override
    public String getFullName() {
        return player.getName() + " " + player.getSurname();
    }

    @Override
    public String getPosition() {
        String position = player.getPosition();
        if(Objects.equals(position, "forward"))
            return "striker";
        if(Objects.equals(position, "defender"))
            return "centre back";
        if(Objects.equals(position, "front defender"))
            return "fullback";
        return position;
    }

    @Override
    public void setWeight(float weight) {
        player.setMass((float) (weight / 0.45));
    }

    @Override
    public void setHeight(int height) {
        player.setHeight((float) (height / 30.48));
    }

    @Override
    public void setSpeedKMh(float speedKMh) {
        player.setSpeedMPH((float) (speedKMh / 1.609344));
    }

    @Override
    public void setFullName(String fullName) {
        String[] names = fullName.split(" ");
        player.setName(names[0]);
        player.setSurname(names[1]);
    }

    @Override
    public void setPosition(String position) {
        if(Objects.equals(position, "striker")){
            player.setPosition("forward");
        } else if (Objects.equals(position, "centre back")) {
            player.setPosition("centre back");
        } else if (Objects.equals(position, "fullback")) {
            player.setPosition("front defender");
        }else {
            player.setPosition(position);
        }
    }

    @Override
    public String display() {
        return "Full name: " + getFullName() + "\nPosition: " + getPosition() + "\nHeight: " + getHeight() + "\nWeight: " + getWeight() + "\nSpeed in KM/H: " + getSpeedKMh();
    }
}
