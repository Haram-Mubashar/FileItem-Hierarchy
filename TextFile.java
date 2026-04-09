public class TextFile extends FileItem {

    private int fileSize;

    public TextFile(int field, String fieldName, Folder folder,int fileSize) {
        super(field, fieldName, folder);
        this.fileSize = fileSize;
        System.out.println("TextFile constructor called");
    }

    void setFileSize(int fileSize) {
        this.fileSize = fileSize;
    }

    public int getFileSize() {
        return fileSize;
    }

    @Override
    public void openFile() {
        System.out.println("TextFile is opening normally.");
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("File Size: " + fileSize);
    }
}
