package week4.task1;

/**
 * class cam ke thu class hoa qua
 */

public class Cam extends HoaQua {
    private String origin;
    private String kind;

    public void setOrigin(String _origin){
        this.origin = _origin;

    }
    public String getOrigin(){
        return this.origin;

    }

    public void setKind(String _kind){
        this.kind=_kind;


    }
    public String getKind(){
        return this.kind;
    }

    public void info(){
        System.out.println("Đay la " + this.getKind() + "," + "duoc nhap tu" + this.getOrigin());
    }
}
