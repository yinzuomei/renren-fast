package io.renren.modules.sys.service;

import com.baomidou.mybatisplus.extension.service.IService;
import io.renren.common.utils.PageUtils;
import io.renren.modules.sys.entity.SysDictEntity;

import java.util.List;
import java.util.Map;

/**
 * 数据字典
 *
 * @author yinzuomei
 * @email 576302893@qq.com
 * @date 2019-11-17 20:57:51
 */
public interface SysDictService extends IService<SysDictEntity> {

	PageUtils queryPage(Map<String, Object> params);

	/**
	 * @param idList 主键集合
	 * @return int
	 * @Author yinzuomei
	 * @Description 批量删除记录, 修改del_flag值
	 * @Date 2019/11/19 20:31
	 **/
	int deleteByIds(List<Long> idList);

	/**
	 * @param
	 * @return java.util.List<io.renren.modules.sys.entity.SysDictEntity>
	 * @Author yinzuomei
	 * @Description 查询父级集合
	 * @Date 2019/11/20 20:18
	 **/
	List<SysDictEntity> queryPidList();
}

