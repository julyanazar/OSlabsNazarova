package lab4;

public class File {
    private int fileSize;
    private int fileId;
    private Node node;

    public File(int fileId, int fileSize) {
        this.fileId = fileId;
        this.fileSize = fileSize;
    }

    public Node getNode() {
        return node.nextNode();
    }

    public int getId() {
        return fileId;
    }

    public int fileSize() {
        return fileSize;
    }
}