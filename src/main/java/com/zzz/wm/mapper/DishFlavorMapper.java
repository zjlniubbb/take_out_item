package com.zzz.wm.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.zzz.wm.entity.DishFlavor;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

/**
 * @author zjlniubbb
 * @version 1.0
 */
@Mapper
@Repository
public interface DishFlavorMapper extends BaseMapper<DishFlavor> {
}
