package com.zretc.oams.entity;


import java.io.Serializable;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

@Data
public class AoaSysMenu implements Serializable {
    private static final long serialVersionUID = 974037727143952278L;
    @TableId(type = IdType.AUTO)
    /**
    * 菜单id
    */
    private Long menuId;
    /**
    * 菜单是否显示
    */
    private Integer isShow;
    /**
    * 权限值分数
    */
    private Integer menuGrade;
    /**
    * 菜单图标
    */
    private String menuIcon;
    /**
    * 菜单名字
    */
    private String menuName;
    /**
    * 菜单链接
    */
    private String menuUrl;
    /**
    * 父id
    */
    private Long parentId;
    /**
    * 菜单排序id
    */
    private Integer sortId;

    @TableField(exist = false)
    private List<AoaSysMenu> grade2Menus = new ArrayList<>();
}
