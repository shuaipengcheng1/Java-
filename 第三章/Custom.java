package 第三章;

public class Custom {
    private  int no;

    public int getNo() {
        return no;
    }

    public void setNo(int no) {
        this.no = no;
    }

    private  String name;
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Custom(int n,String na) {
        this.name=na;
        this.no=n;
    }
}
