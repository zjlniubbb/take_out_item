package com.zzz.wm.service;

        import com.baomidou.mybatisplus.extension.service.IService;
        import com.zzz.wm.dto.DishDto;
        import com.zzz.wm.entity.Dish;

/**
 * @author zjlniubbb
 * @version 1.0
 */
public interface DishService extends IService<Dish> {

    public void saveWithFlavor(DishDto dishDto);
    public void updateWithFlavor(DishDto dishDto);
}
