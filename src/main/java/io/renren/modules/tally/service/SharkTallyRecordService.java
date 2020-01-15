package io.renren.modules.tally.service;

import com.baomidou.mybatisplus.extension.service.IService;
import io.renren.common.utils.PageUtils;
import io.renren.modules.tally.entity.SharkTallyRecordEntity;

import java.util.Map;

/**
 * 账目表
 *
 * @author yinzuomei
 * @email 576302893@qq.com
 * @date 2019-11-25 19:55:50
 */
public interface SharkTallyRecordService extends IService<SharkTallyRecordEntity> {

	PageUtils queryPage(Map<String, Object> params);
}

