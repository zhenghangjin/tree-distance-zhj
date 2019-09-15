import com.alibaba.fastjson.JSON;
import com.rubin.util.tree.*;
import com.rubin.util.tree.cost.SimpleCostFunction;
import com.rubin.util.tree.operate.TreeOperation;
import com.rubin.util.tree.struct.SimpleTreeNode;
import com.rubin.util.tree.struct.TreeNode;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class TreeUtilTest {

    @Test
    public void treeEditDistance1() {
        TreeNode<String> T1 = new SimpleTreeNode<>("");
        TreeUtil.treeFromString(T1, "c(b(a))");

        TreeNode<String> T2 = new SimpleTreeNode<>("");
        TreeUtil.treeFromString(T2, "c(b(a d))");

        List<TreeOperation> ops = new ArrayList<>();
        int result = TreeUtil.treeEditDistance(T1, T2, ops, new SimpleCostFunction<>());

        System.out.println(result);
        System.out.println(JSON.toJSONString(ops));
    }

    @Test
    public void treeEditDistance2() {
        TreeNode<String> T1 = new SimpleTreeNode<>("");
        TreeUtil.treeFromString(T1, "f(d(a c(b)) e)");

        TreeNode<String> T2 = new SimpleTreeNode<>("");
        TreeUtil.treeFromString(T2, "f(c(d(a b)) e)");


        List<TreeOperation> ops = new ArrayList<>();
        int result = TreeUtil.treeEditDistance(T1, T2, ops, new SimpleCostFunction<>());
        System.out.println(result);
        System.out.println(JSON.toJSONString(ops));

    }

    @Test
    public void treeEditDistance3() {
        TreeNode<String> T1 = new SimpleTreeNode<>("");
        TreeUtil.treeFromString(T1, "a(b(d(g) e(h i j k)) c(f(l(m n))))");

        TreeNode<String> T2 = new SimpleTreeNode<>("");
        TreeUtil.treeFromString(T2, "a(b(d(g)) c(f(l)) hello(world))");


        List<TreeOperation> ops = new ArrayList<>();
        int result = TreeUtil.treeEditDistance(T1, T2, ops, new SimpleCostFunction<>());
        System.out.println(result);
        System.out.println(JSON.toJSONString(ops));

    }

}
