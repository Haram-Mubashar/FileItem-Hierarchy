public class SecureTextFile extends TextFile {

    private String securityLevel;

    public SecureTextFile(int field, String fieldName, Folder folder,int fileSize,String securityLevel) {
        super(field,fieldName,folder,fileSize);
        this.securityLevel=securityLevel;
        System.out.println("SecureTextFile constructor called");
    }

    public void setSecurityLevel(String securityLevel) {
        this.securityLevel = securityLevel;
    }

    public String getSecurityLevel() {
        return securityLevel;
    }

    @Override
    public void openFile() {
        System.out.println("SecureTextFile is opening with protected access.");
    }

    public void shareFile(){
        System.out.println("File shared with default secure settings");
    }

    public void shareFile(String message){
        System.out.println("File shared with: "+message);
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Security Level: "+securityLevel);
    }
}
