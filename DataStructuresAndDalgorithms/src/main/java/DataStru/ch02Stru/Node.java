package DataStru.ch02Stru;

/**
 * @author mingliang
 * @ClassName: Node
 * @Description: 节点, 单链表(这里用一句话描述这个类的作用)
 * @date 2020/10/2 17:46
 */
public class Node {

    //节点内容
    private int data;

    //下一个节点
    private Node next;

    public Node(int data) {
        this.data = data;
    }

    //为节点追加节点
    public Node append(Node node) {
        //当前节点
        Node curNode = this;
        //循环向后找
        while (true) {
            //取出下一个节点
            Node nextNode = curNode.next;
            //如果下一个节点为null,当前节点已经是最后一个节点
            if (nextNode == null) {
                break;
            }
            //赋值当前节点
            curNode = nextNode;
        }
        //把需要追回的节点追加为找到的当前节点的下一个节点
        curNode.next = node;
        return this;//改善，无线追加
    }

    //插入一个节点作为当前节点的下一个节点
    public void after(Node node) {
        //取出当前节点的下一个节点，作为下下一个节点
        Node nextNode = this.next;
        //把新节点放在当前节点的下一个节点
        next = node;
        //把下下一个节点设置为新节点的下一个节点
        node.next = nextNode;
    }

    //删除下一个节点
    public void removeNext() {
        //取出下一个节点
        Node newNext = next.next;
        //把下一个节点设置为当前节点的下一个节点
        this.next = newNext;

    }

    //显示所有节点信息
    public void show() {
        Node currentNode = this;
        while (true) {
            System.out.println(currentNode.data + " ");
            //取出下一个节点
            currentNode = currentNode.next;
            //如果是最后一个节点，下一个节点为空
            if (currentNode == null) {
                break;
            }
        }
    }

    //获取下一个节点
    public Node next() {
        return this.next;
    }

    //获取节点中的数据
    public int getData() {
        return this.data;
    }

    //当前节点是否是最后一个节点
    public boolean isLast() {
        return this.next == null;
    }


}
