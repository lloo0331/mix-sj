package po;

public class PersonInJava {

    //名称
    private String cName;

    //姓氏
    private String sName;

    public void setcName(String cName) {
        this.cName = cName;
    }

    public void setsName(String sName) {
        this.sName = sName;
    }

    public String getcName() {
        return cName;
    }

    public String getsName() {
        return sName;
    }

    public PersonInJava(String cName,String sName){
        this.cName = cName;
        this.sName = sName;
    }

    @Override
    public String toString() {
        return "The totalName is"+this.cName+" "+this.sName;
    }

    public static void main(String args[]){

        PersonInJava robert = new PersonInJava("Rebert","Jones");

        System.out.println(robert);

        PersonInJava sally = new PersonInJava("Sally","Smith");

        System.out.println(sally);
    }
}
