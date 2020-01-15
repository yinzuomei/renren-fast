package io.renren.modules.sys.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import io.renren.common.utils.Query;
import io.renren.common.utils.enums.YesOrNoEnum;
import io.renren.modules.sys.dao.SysDictDao;
import io.renren.modules.sys.entity.SysDictEntity;
import io.renren.modules.sys.service.SysDictService;
import org.apache.commons.lang.StringUtils;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
import java.util.Map;

import io.renren.common.utils.PageUtils;


@Service("sysDictService")
public class SysDictServiceImpl extends ServiceImpl<SysDictDao, SysDictEntity> implements SysDictService {

	@Override
	public PageUtils queryPage(Map<String, Object> params) {
		String dictType = params.containsKey("dictType") ? params.get("dictType").toString() : "";
		String dictName = params.containsKey("dictName") ? params.get("dictName").toString() : "";
		String remark = params.containsKey("remark") ? params.get("remark").toString() : "";
		//dictType模糊查询
		IPage<SysDictEntity> page = this.page(
				new Query<SysDictEntity>().getPage(params),
				new QueryWrapper<SysDictEntity>().eq("del_flag", YesOrNoEnum.NO.value())
						.like(StringUtils.isNotBlank(dictName), "dict_name", params.get("dictName").toString())
						.like(StringUtils.isNotBlank(dictType), "dict_type", params.get("dictType").toString())
						.like(StringUtils.isNotBlank(remark), "remark", params.get("remark").toString())
		);

		return new PageUtils(page);
	}

	/**
	 * @param idList 主键集合
	 * @return int
	 * @Author yinzuomei
	 * @Description 批量删除记录, 修改del_flag值
	 * @Date 2019/11/19 20:31
	 **/
	@Override
	public int deleteByIds(List<Long> idList) {
		int updateNum = 0;
		List<SysDictEntity> sysDictEntityList = baseMapper.selectBatchIds(idList);
		for (SysDictEntity sysDictEntity : sysDictEntityList) {
			sysDictEntity.setDelFlag(Integer.valueOf(YesOrNoEnum.YES.value()));
			sysDictEntity.setUpdateDate(new Date());
			updateNum += baseMapper.updateById(sysDictEntity);
		}
		return updateNum;
	}

	/**
	 * @param
	 * @return java.util.List<io.renren.modules.sys.entity.SysDictEntity>
	 * @Author yinzuomei
	 * @Description 查询父级集合
	 * @Date 2019/11/20 20:18
	 **/
	@Override
	public List<SysDictEntity> queryPidList() {
		List<SysDictEntity> list = baseMapper.queryPidList();
		return list;
	}

}
