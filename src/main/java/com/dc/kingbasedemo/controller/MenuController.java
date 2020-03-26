package com.dc.kingbasedemo.controller;

import com.dc.kingbasedemo.entity.Menu;
import com.dc.kingbasedemo.service.MenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

/**
 * @Description
 * @Author DC
 * @Date 2020-03-25
 */
@RestController
public class MenuController {

    @Autowired
    private MenuService menuService;

    @GetMapping("/getAll")
    public List<Menu> getAll() {
        List<Menu> menus = menuService.queryAllMenu();
        return menus;
    }

    @GetMapping("/getByMenuId")
    public Menu getByMenuId(String menuId) {
        Menu menu = menuService.queryByMenuId(menuId);
        return menu;
    }

    @GetMapping("/insert")
    public String insert() {
        menuService.addMenu();
        return "success";
    }

    @GetMapping("/update")
    public String update(String menuId) {
        menuService.update(menuId);
        return "success";
    }

    @GetMapping("/delete")
    public String delete(String menuId) {
        menuService.delete(menuId);
        return "success";
    }
}
