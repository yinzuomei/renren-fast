package io.renren.modules.sys.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import io.renren.modules.sys.entity.SysDictEntity;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * 数据字典
 *
 * @author yinzuomei
 * @email 576302893@qq.com
 * @date 2019-11-17 20:57:51
 */
@Mapper
public interface SysDictDao extends BaseMapper<SysDictEntity> {

	List<SysDictEntity> queryPidList();
}
