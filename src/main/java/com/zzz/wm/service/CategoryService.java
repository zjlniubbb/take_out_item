package com.zzz.wm.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.zzz.wm.entity.Category;


/**
 * @author zjlniubbb
 * @version 1.0
 */
public interface CategoryService extends IService<Category> {
    public void remove(Long id);
}
