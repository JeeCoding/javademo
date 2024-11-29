package demo2;

import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * @author yuexian
 * @description
 * @date 2021.11.22 10:27
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class DeptTree extends TreeNode {
    private String name;
}
