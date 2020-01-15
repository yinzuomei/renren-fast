package io.renren.modules.tally.service.impl;

import org.springframework.stereotype.Service;

import java.util.Map;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import io.renren.common.utils.PageUtils;
import io.renren.common.utils.Query;

import io.renren.modules.tally.dao.SharkTallyRecordDao;
import io.renren.modules.tally.entity.SharkTallyRecordEntity;
import io.renren.modules.tally.service.SharkTallyRecordService;


@Service("sharkTallyRecordService")
public class SharkTallyRecordServiceImpl extends ServiceImpl<SharkTallyRecordDao, SharkTallyRecordEntity> implements SharkTallyRecordService {

	@Override
	public PageUtils queryPage(Map<String, Object> params) {
		IPage<SharkTallyRecordEntity> page = this.page(
				new Query<SharkTallyRecordEntity>().getPage(params),
				new QueryWrapper<SharkTallyRecordEntity>()
		);

		return new PageUtils(page);
	}

}
