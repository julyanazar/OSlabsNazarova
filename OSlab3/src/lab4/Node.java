package lab4;

public class Node {

    private int nodeId;
    private boolean selectFlag;
    private int nextNodeId;

    public Node(int nodeId) {
        this.nodeId = nodeId;
    }

    public void setNextNodeId(int knotId) {
        nextNodeId = knotId;
    }

    public int getId() {
        return nodeId;
    }

    public int nextNodeId() {
        return nextNodeId;
    }

    public boolean getSelectFlag() {
        return selectFlag;
    }

    public void setSelectFlag(boolean selectFlag) {
        this.selectFlag = selectFlag;
    }
    public void setId(int id) {
        nodeId = id;
    }
}