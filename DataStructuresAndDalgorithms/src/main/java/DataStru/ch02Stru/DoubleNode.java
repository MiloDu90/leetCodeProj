package DataStru.ch02Stru;

/**
 * @author mingliang
 * @ClassName: DoubleNode
 * @Description: 循环的双向链表(这里用一句话描述这个类的作用)
 * @date 2020/10/2 18:57
 */
public class DoubleNode {

    //上一个节点
    private DoubleNode pre = this;

    //下一个节点
    private DoubleNode next = this;

    //节点数据
    private int data;

    public DoubleNode(int data) {
        this.data = data;
    }

    //增加节点
    public void after(DoubleNode node) {
        //原来的下一个节点
        DoubleNode nextNext = next;
        //把新节点放在当前节点的下一个节点
        this.next = node;
        //把下下一个节点设置为新节点的下一个节点
        node.next = nextNext;
        //让原来的下一个节点的上一个节点为新节点
        nextNext.pre = node;
    }

    //下一个节点
    public DoubleNode next() {
        return this.next;
    }

    //上一个节点
    public DoubleNode pre() {
        return this.pre;
    }

    //获取节点中的数据
    public int getData() {
        return this.data;
    }
}
