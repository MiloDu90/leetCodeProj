package DataStru.ch02Stru;

/**
 * @author mingliang
 * @ClassName: Node
 * @Description: 节点, 循环链表(这里用一句话描述这个类的作用)
 * @date 2020/10/2 17:46
 */
public class LoopNode {

    //节点内容
    private int data;

    //下一个节点
    private LoopNode next = this;

    public LoopNode(int data) {
        this.data = data;
    }

    //插入一个节点作为当前节点的下一个节点
    public void after(LoopNode node) {
        //取出当前节点的下一个节点，作为下下一个节点
        LoopNode nextNode = this.next;
        //把新节点放在当前节点的下一个节点
        next = node;
        //把下下一个节点设置为新节点的下一个节点
        node.next = nextNode;
    }

    //删除下一个节点
    public void removeNext() {
        //取出下一个节点
        LoopNode newNext = next.next;
        //把下一个节点设置为当前节点的下一个节点
        this.next = newNext;

    }

    //获取下一个节点
    public LoopNode next() {
        return this.next;
    }

    //获取节点中的数据
    public int getData() {
        return this.data;
    }


}
