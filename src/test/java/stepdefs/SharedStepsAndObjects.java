package stepdefs;

public class SharedStepsAndObjects {

    private SharedStepsAndObjects(){};
    private static SharedStepsAndObjects instance = null;

    public static SharedStepsAndObjects getInstance(){
        if (instance == null)
            instance = new SharedStepsAndObjects();

        return instance;
    }

    private String Z1;
    public String getZ1(){
        return Z1;
    }
    public void setZ1(String z1){
        Z1 = z1;
    }

    private String Z2;
    public String getZ2(){
        return Z2;
    }
    public void setZ2(String z2){
        Z2 = z2;
    }
}
