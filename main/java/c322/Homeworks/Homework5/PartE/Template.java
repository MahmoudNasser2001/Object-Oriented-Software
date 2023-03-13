package c322.Homeworks.Homework5.PartE;

public abstract class Template {
    void analyzeFiles(){
        openFile();
        RawData();
        parseData();
        analysis();
        sendReport();
        closeFile();
        System.out.println("Analysis files Completed");
    }
    void openFile(){
        System.out.println("Opening file's path");
    }
    abstract void RawData();
    abstract void parseData();
    void analysis(){
        System.out.println("Analyzing Data");
    }
    void sendReport(){
        System.out.println("Sending file's report");
    }
    void closeFile(){
        System.out.println("Closing the file");
    }
}
