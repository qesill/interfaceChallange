public interface Browser {
    static final String ENGINE = "WebKit";
    public default String getEngine(){return this.ENGINE;}
    abstract void gotoPage(String url);
    abstract void refreshPage();
    abstract void bookmarkPage();
}
