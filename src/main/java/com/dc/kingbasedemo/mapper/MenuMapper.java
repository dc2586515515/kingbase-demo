package com.dc.kingbasedemo.mapper;

import com.dc.kingbasedemo.entity.Menu;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @Description
 * @Author DC
 * @Date 2020-03-25
 */
@Mapper
public interface MenuMapper {

    public List<Menu> queryAll();

    public Menu queryByMenuId(@Param("menuId") String menuId);

    public void insert(@Param("vo") Menu menu);

    public void update(@Param("vo") Menu menu);

    public void delete(@Param("vo") Menu menu);
}
