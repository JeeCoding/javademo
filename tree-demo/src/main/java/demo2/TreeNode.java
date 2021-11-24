package demo2;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

/**
 * @author huzh
 * @description
 * @date 2021.11.22 10:25
 */
@Data
public abstract class TreeNode {
    protected int id;
    protected int parentId;
    protected String name;
    private String ancestors;
    protected List<TreeNode> children = new ArrayList<>();

    public void add(TreeNode node) {
        children.add(node);
    }
}
