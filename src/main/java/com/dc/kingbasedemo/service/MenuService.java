package com.dc.kingbasedemo.service;

import com.dc.kingbasedemo.entity.Menu;
import com.dc.kingbasedemo.mapper.MenuMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

/**
 * @Description
 * @Author DC
 * @Date 2020-03-25
 */
@Service
public class MenuService {
    @Autowired
    private MenuMapper menuMapper;

    public List<Menu> queryAllMenu() {
        return menuMapper.queryAll();
    }

    public Menu queryByMenuId(String menuId) {
        return menuMapper.queryByMenuId(menuId);
    }

    public void addMenu() {
       Menu menu = new Menu();
       menu.setBusiCode("1");
       menu.setMenuId(UUID.randomUUID().toString());
       menu.setDelFlg("0");
       menuMapper.insert(menu);
    }

    public void update(String menuId){
        Menu menu = new Menu();
        menu.setMenuId(menuId);
        menu.setHelpUrl("hupu.com");
        menuMapper.update(menu);
    }

    public void delete(String menuId){
        Menu menu = new Menu();
        menu.setMenuId(menuId);
        menuMapper.delete(menu);
    }
}
