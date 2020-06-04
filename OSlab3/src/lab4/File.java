package lab4;

public class File {
    private int fileSize;
    private int fileId;
    private int nodeId;

    public File(int fileId, int fileSize) {
        this.fileId = fileId;
        this.fileSize = fileSize;
    }

    public int getNodeId() {
        return nodeId;
    }

    public int getId() {
        return fileId;
    }

    public int fileSize() {
        return fileSize;
    }
}