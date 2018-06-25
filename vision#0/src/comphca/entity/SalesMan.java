package comphca.entity;

public class SalesMan {
    private int sId;
    private String sName;
    private String sPassWord;


    //验证用户登陆
    public SalesMan(int sId, String sPassWord) {
        this.sId = sId;
        this.sPassWord = sPassWord;
    }

    //查询用户、更改用户密码
    public SalesMan(int sId, String sName, String sPassWord) {
        this.sId = sId;
        this.sName = sName;
        this.sPassWord = sPassWord;
    }

    //添加用户
    public SalesMan(String NsNameame, String sPassWord){
        this.sName = NsNameame;
        this.sPassWord = sPassWord;
    }

    public int getsId() {
        return sId;
    }

    public void setsId(int sId) {
        this.sId = sId;
    }

    public String getsName() {
        return sName;
    }

    public void setsName(String sName) {
        this.sName = sName;
    }

    public String getsPassWord() {
        return sPassWord;
    }

    public void setsPassWord(String sPassWord) {
        this.sPassWord = sPassWord;
    }
}
