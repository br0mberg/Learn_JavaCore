package OOP_0;
public class Dog extends Animal implements Voice {
    private String voice = "gav";
    @Override
    public String getVoice() {
        return voice;
    }
}
