package mypckg;

 abstract class Shortcut {
    private String link;

     String getLink() {
        return link;
    }

     Shortcut(String link) {
        this.link = link;
    }

     void setLink(String link) {
        this.link = link;
    }
}
