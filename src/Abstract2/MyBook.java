package Abstract2;

class MyBook extends Book{


    @Override
    void setTitle(String s) {
        this.title = s;

    }

    @Override
    String getTitle() {
        return super.getTitle();
    }
}
