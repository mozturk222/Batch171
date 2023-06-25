package day28interfacecollections;

public class HondaRunner {
    public static void main(String[] args) {
        Civic myCivic = new Civic();
        myCivic.cool();//Civic cools perfectly

        Accord myAccord = new Accord();
        myAccord.cool();//Accord cools super
        myAccord.run(); //Engine run super
    }
}
