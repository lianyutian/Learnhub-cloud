package com.learnhub.promotion.mapper;

import com.learnhub.promotion.domain.po.CouponScope;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @author liming
 * @version 1.0
 * @since 2024/4/22 17:53
 */
@Mapper
public interface CouponScopeMapper {
    /**
     * 保存优惠券范围
     *
     * @param list 优惠券范围
     */
    void saveCouponScopes(List<CouponScope> list);
}
