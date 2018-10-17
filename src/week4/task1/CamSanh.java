package week4.task1;

/**
 * class cam kế thừa class hoaqua
 */

public class CamSanh extends Cam {
    private String status;

    public String getStatus(){
        return this.status;
    }
    public void setStatus(String _status){
        this.status = status;
    }

    public void checkStatus(){
        System.out.print(this.getStatus());
    }



}
