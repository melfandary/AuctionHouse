package theauctionhouse;

public class User {
    private int uID;
    private String Uname;
    private String Upass;
    private String Umail;
    private int Uage;
    private String Gender;
    private String Uaddress;
    private int Unumber;

//Contructors
    public User() {
    }

    public User(int uID, String uname, String upass, String umail, int uage, String gender, String uaddress, int unumber) {
        this.uID = uID;
        Uname = uname;
        Upass = upass;
        Umail = umail;
        Uage = uage;
        Gender = gender;
        Uaddress = uaddress;
        Unumber = unumber;
    }

//Setters and getters
    public int getuID() {
        return uID;
    }

    public void setuID(int uID) {
        this.uID = uID;
    }

    public String getUname() {
        return Uname;
    }

    public void setUname(String uname) {
        Uname = uname;
    }

    public String getUpass() {
        return Upass;
    }

    public void setUpass(String upass) {
        Upass = upass;
    }

    public String getUmail() {
        return Umail;
    }

    public void setUmail(String umail) {
        Umail = umail;
    }

    public int getUage() {
        return Uage;
    }

    public void setUage(int uage) {
        Uage = uage;
    }

    public String getGender() {
        return Gender;
    }

    public void setGender(String gender) {
        Gender = gender;
    }

    public String getUaddress() {
        return Uaddress;
    }

    public void setUaddress(String uaddress) {
        Uaddress = uaddress;
    }

    public int getUnumber() {
        return Unumber;
    }

    public void setUnumber(int unumber) {
        Unumber = unumber;
    }
    //methods

    public void createAccount(String name,String pass, String mail){
        User u = new User(0,name,pass,mail,0,"","",0);
    }
    public void editAccount(String name,String pass, String mail){
        Uname=name;
        Upass=pass;
        Umail=mail;
    }
    public void viewAccount (){

    }
    public boolean login (String name,String pass){
        if (name == this.Uname&&pass==this.Upass){
            return true;
        }
        else return false;
    }


}
