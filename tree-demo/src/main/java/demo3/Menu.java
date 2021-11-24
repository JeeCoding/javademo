package demo3;

import lombok.Data;

import java.util.List;

/**
 * @author huzh
 * @description
 * @date 2021.11.22 10:44
 */
@Data
public class Menu {
    private String id;
    private String parentId;
    private String text;
    private String url;
    private String yxbz;
    private List<Menu> children;

    public Menu(String id, String parentId, String text, String url, String yxbz) {
        this.id = id;
        this.parentId = parentId;
        this.text = text;
        this.url = url;
        this.yxbz = yxbz;
    }
}
