package jam;
public class Jam {
int hh, mm, dd;

    public Jam() {
    }


    public Jam(int hh, int mm, int dd) {
        this.hh = hh;
        this.mm = mm;
        this.dd = dd;
    }

int convertJamtoMenit(int jam){
    int menit;
    menit = jam * 60;
    return menit;
}     
int convertJamtoDetik(int jam){
    int detik;
    detik = jam * 3600;
    return detik;
}

    public int getHh() {
        return hh;
    }

    public void setHh(int hh) {
        this.hh = hh;
    }

    public int getMm() {
        return mm;
    }

    public void setMm(int mm) {
        this.mm = mm;
    }

    public int getDd() {
        return dd;
    }

    public void setDd(int dd) {
        this.dd = dd;
    }
     
    
}
