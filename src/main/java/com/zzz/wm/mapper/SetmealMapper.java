package com.zzz.wm.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.zzz.wm.entity.Setmeal;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

/**
 * @author zjlniubbb
 * @version 1.0
 */
@Mapper
@Repository
public interface SetmealMapper extends BaseMapper<Setmeal> {
}
