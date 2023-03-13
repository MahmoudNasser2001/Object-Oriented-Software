package c322.Homeworks.Homework5.PartC;

public class realEstate {
    int length, width;
    public realEstate(int Leng, int Widt){
        this.length = Leng;
        this.width = Widt;
    }
    public double acreage(){
        return this.length * this.width;
    }
}
