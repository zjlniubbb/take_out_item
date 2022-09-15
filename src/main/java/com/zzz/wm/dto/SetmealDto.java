package com.zzz.wm.dto;

import com.zzz.wm.entity.Setmeal;
import com.zzz.wm.entity.SetmealDish;
import lombok.Data;
import java.util.List;

@Data
public class SetmealDto extends Setmeal {

    private List<SetmealDish> setmealDishes;

    private String categoryName;
}
