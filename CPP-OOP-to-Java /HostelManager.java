import java.util.Scanner;

public class HostelManager extends User{

    private int ManagerID;

    public HostelManager(){
        ManagerID ++;
    }
    public int ManagerIDGetter(){
        return ManagerID;
    }
    public void ManagerIDSetter(int M){
        ManagerID = M;
    }
}
