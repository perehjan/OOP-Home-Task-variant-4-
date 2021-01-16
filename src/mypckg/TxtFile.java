package mypckg;

import java.util.ArrayList;
import java.util.List;

 class TxtFile extends File {
    private List<String> information ;
     List getInformation() {
        return information;
    }

     void setInformation(List<String> information) {
        this.information = information;
    }

     TxtFile(String link, String nameOfFile, List<String> information) {
        super(link, nameOfFile+".txt");
        this.information = information;
    }

     TxtFile(String link) {
        super(link);
        super.setNameOfFile(super.getNameOfFile()+".txt");
        this.information = new ArrayList<>();
    }

     TxtFile(String link, String nameOfFile) {
        super(link, nameOfFile+".txt");
        this.information = new ArrayList<>();
    }
}
