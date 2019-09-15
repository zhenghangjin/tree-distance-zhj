package com.rubin.util.tree.cost;

import com.rubin.util.tree.operate.TreeOperationType;
import com.rubin.util.tree.struct.TreeNode;

public class SimpleCostFunction<T> implements TriFunction<TreeNode<T>, TreeNode<T>, TreeOperationType, Integer> {
    @Override
    public Integer apply(TreeNode<T> treeNode, TreeNode<T> treeNode2, TreeOperationType treeOperationType) {
        return treeOperationType == TreeOperationType.KEEP ? 0 : 1;
    }
}
