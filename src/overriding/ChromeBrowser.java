package overriding;

class ChromeBrowser extends Browser {
    @Override
    void open() {
        System.out.println("Open Chrome browser");
    }
}
