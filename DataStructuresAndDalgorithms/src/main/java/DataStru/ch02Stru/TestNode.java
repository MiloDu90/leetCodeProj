package DataStru.ch02Stru;

/**
 * @author mingliang
 * @ClassName: TestNode
 * @Description: 测试节点(这里用一句话描述这个类的作用)
 * @date 2020/10/2 17:49
 */
public class TestNode {
    public static void main(String[] args) {
        //创建节点
        Node node1 = new Node(1);
        Node node2 = new Node(2);
        Node node3 = new Node(3);

        node1.append(node2).append(node3);

        node1.show();
        node1.removeNext();
        node1.show();
    }
}
