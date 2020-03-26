package com.dc.kingbasedemo.entity;

import lombok.Data;


/**
 * @Description
 * @Author DC
 * @Date 2020-03-25
 */
@Data
public class Menu {
    private String menuId;
    private String parentId;
    private String isLeaf;
    private String isPop;
    private String helpUrl;
    private String menuUrl;
    private String busiCode;
    private String menuName;
    private String menuIco;
    private String menuSort;
    private String delFlg;
}