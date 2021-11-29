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
public class TreeNodeStr {
    protected String id;

    protected String parentId;

    protected String name;

    protected List<TreeNodeStr> children = new ArrayList<>();

    public void add(TreeNodeStr node) {
        children.add(node);
    }
}
