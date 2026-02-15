package Prototype;

public class NetworkConnection implements Cloneable{

    private String ip;

    private String impData;

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public String getImpData() {
        return impData;
    }

    public void setImpData(String impData) {
        this.impData = impData;
    }


    public void loadImpData() throws InterruptedException {
        this.impData = "Very  very Important Data Loaded ... ";
        Thread.sleep(5000);
    }

    @Override
    public String toString() {
        return this.ip + this.impData;
    }

    @Override
    public NetworkConnection clone() {
        try {
            NetworkConnection clone = (NetworkConnection) super.clone();
            // TODO: copy mutable state here, so the clone can't change the internals of the original
            return clone;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }
}
