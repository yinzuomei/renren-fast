package io.renren.modules.sys.controller;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

import io.renren.modules.sys.entity.SysDictEntity;
import io.renren.modules.sys.service.SysDictService;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import io.renren.common.utils.PageUtils;
import io.renren.common.utils.R;


/**
 * 数据字典
 *
 * @author yinzuomei
 * @email 576302893@qq.com
 * @date 2019-11-17 20:57:51
 */
@RestController
@RequestMapping("/sys/sysdict")
public class SysDictController {
	@Autowired
	private SysDictService sysDictService;

	/**
	 * 列表
	 */
	@RequestMapping("/list")
	@RequiresPermissions("sys:sysdict:list")
	public R list(@RequestParam Map<String, Object> params) {
		PageUtils page = sysDictService.queryPage(params);

		return R.ok().put("page", page);
	}


	/**
	 * 信息
	 */
	@RequestMapping("/info/{id}")
	@RequiresPermissions("sys:sysdict:info")
	public R info(@PathVariable("id") Long id) {
		SysDictEntity sysDict = sysDictService.getById(id);

		return R.ok().put("sysDict", sysDict);
	}

	/**
	 * 保存
	 */
	@RequestMapping("/save")
	@RequiresPermissions("sys:sysdict:save")
	public R save(@RequestBody SysDictEntity sysDict) {
		sysDictService.save(sysDict);

		return R.ok();
	}

	/**
	 * 修改
	 */
	@RequestMapping("/update")
	@RequiresPermissions("sys:sysdict:update")
	public R update(@RequestBody SysDictEntity sysDict) {
		if (sysDict.getId() == sysDict.getPid()) {
			return R.error("父级不能选择自己");
		}
		sysDictService.updateById(sysDict);

		return R.ok();
	}

	/**
	 * 删除
	 */
	@RequestMapping("/delete")
	@RequiresPermissions("sys:sysdict:delete")
	public R delete(@RequestBody Long[] ids) {
//		sysDictService.removeByIds(Arrays.asList(ids));
		sysDictService.deleteByIds(Arrays.asList(ids));
		return R.ok();
	}

	/**
	 * @param
	 * @return io.renren.common.utils.R
	 * @Author yinzuomei
	 * @Description 查询父级集合
	 * @Date 2019/11/20 20:17
	 **/
	@GetMapping("queryPidList")
	public R queryPidList() {
		List<SysDictEntity> list = sysDictService.queryPidList();
		return R.ok().put("list", list);
	}

	@PostMapping(value = "report/test")
	public R test(@RequestBody String test) {
		System.out.println(test.trim());
		return R.ok();
	}
}
