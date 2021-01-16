package mypckg;

import java.util.ArrayList;
import java.util.List;

 class Folder extends Shortcut{
    private List files ;
    private List folders ;
    private String nameOfFolder ;
     List getFiles() {
        return files;
    }

     void setFiles(List files) {
        this.files = files;
    }
     String getNameOfFolder() {
        return nameOfFolder;
    }

     void setNameOfFolder(String nameOfFolder) {
        this.nameOfFolder = nameOfFolder;
    }

     Folder(String link, List<File> files,List<Folder> folders, String nameOfFolder) {
        super(link);
        this.files = files;
        this.folders = folders;
        this.nameOfFolder = nameOfFolder;
    }



     Folder(String link) {
        super(link);
        this.files = new ArrayList<File>();
        this.folders = new ArrayList<Folder>();
        this.nameOfFolder = "Папка";
    }
}
