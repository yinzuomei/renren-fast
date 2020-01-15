package io.renren.modules.tally.dao;

import io.renren.modules.tally.entity.SharkTallyRecordEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 账目表
 *
 * @author yinzuomei
 * @email 576302893@qq.com
 * @date 2019-11-25 19:55:50
 */
@Mapper
public interface SharkTallyRecordDao extends BaseMapper<SharkTallyRecordEntity> {

}
