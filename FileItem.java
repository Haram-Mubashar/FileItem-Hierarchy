public abstract class FileItem {
    private int field;
    private String fieldName;
    private Folder folder;

    public FileItem(int field, String fieldName, Folder folder) {
        this.field = field;
        this.fieldName = fieldName;
        this.folder = folder;
        System.out.println("FileItem constructor called");
    }

    public void setField(int field) {
        this.field = field;
    }

    public void setFieldName(String fieldName) {
        this.fieldName = fieldName;
    }

    public void setFolder(Folder folder) {
        this.folder = folder;
    }

    public int getField() {
        return field;
    }

    public String getFieldName() {
        return fieldName;
    }

    public Folder getFolder() {
        return folder;
    }

    public static void showSystemType(){
        System.out.println("Digital File Management System" );
    }

    public abstract void openFile();

    public void displayInfo(){
        System.out.println("File ID: " + getField());
        System.out.println("File Name: " + getFieldName());
        System.out.println("Folder: " + getFolder());
    }
}


class Folder {
    private String folderName;
    private String path;

    public Folder(String folderName, String path) {
        this.folderName = folderName;
        this.path = path;
    }

    public String getFolderName() {
        return folderName;
    }

    public void setFolderName(String folderName) {
        this.folderName = folderName;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    @Override
    public String toString() {
        return String.format("%s, Path: %s", getFolderName(), getPath());
    }
}