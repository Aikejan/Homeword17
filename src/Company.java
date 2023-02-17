public class Company {
    private  String adress;
    private int java;
    private  int android;
    private int go;

    public Company(String adress, int java, int android, int go) {
        this.adress = adress;
        this.java = java;
        this.android = android;
        this.go = go;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public int getJava() {
        return java;
    }

    public void setJava(int java) {
        this.java = java;
    }

    public int getAndroid() {
        return android;
    }

    public void setAndroid(int android) {
        this.android = android;
    }

    public int getGo() {
        return go;
    }

    public void setGo(int go) {
        this.go = go;
    }

    @Override
    public String toString() {
        return "adress: " + adress +
                " java: " + java +
                "  android: " + android +
                "  go: " + go ;
    }
}
