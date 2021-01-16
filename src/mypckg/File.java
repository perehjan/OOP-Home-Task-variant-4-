package mypckg;

import java.util.ArrayList;
import java.util.List;

 abstract class File extends Shortcut {

    private String nameOfFile ;


     String getNameOfFile() {
        return nameOfFile;
    }

     void setNameOfFile(String nameOfFile) {
        this.nameOfFile = nameOfFile;
    }


     File(String link,String nameOfFile) {
        super(link);
        this.nameOfFile = nameOfFile;
    }

     File(String link) {
        super(link);
        this.nameOfFile ="Безымянный";
    }
}





