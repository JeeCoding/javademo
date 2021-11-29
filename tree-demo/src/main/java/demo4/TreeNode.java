package demo4;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

/**
 * @author YueXian
 * @date 2021/11/22 11:16
 * @description :
 */
@Data
public class TreeNode {
    protected Integer id;

    protected Integer parentId;

    protected String name;

    protected List<TreeNode> children = new ArrayList<>();

    public void add(TreeNode node) {
        children.add(node);
    }
}
