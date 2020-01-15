package io.renren.modules.tally.controller;

import java.util.Arrays;
import java.util.Map;

import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import io.renren.modules.tally.entity.SharkTallyRecordEntity;
import io.renren.modules.tally.service.SharkTallyRecordService;
import io.renren.common.utils.PageUtils;
import io.renren.common.utils.R;


/**
 * 账目表
 *
 * @author yinzuomei
 * @email 576302893@qq.com
 * @date 2019-11-25 19:55:50
 */
@RestController
@RequestMapping("tally/sharktallyrecord")
public class SharkTallyRecordController {
	@Autowired
	private SharkTallyRecordService sharkTallyRecordService;

	/**
	 * 列表
	 */
	@RequestMapping("/list")
	@RequiresPermissions("tally:sharktallyrecord:list")
	public R list(@RequestParam Map<String, Object> params) {
		PageUtils page = sharkTallyRecordService.queryPage(params);

		return R.ok().put("page", page);
	}


	/**
	 * 信息
	 */
	@RequestMapping("/info/{id}")
	@RequiresPermissions("tally:sharktallyrecord:info")
	public R info(@PathVariable("id") String id) {
		SharkTallyRecordEntity sharkTallyRecord = sharkTallyRecordService.getById(id);

		return R.ok().put("sharkTallyRecord", sharkTallyRecord);
	}

	/**
	 * 保存
	 */
	@RequestMapping("/save")
	@RequiresPermissions("tally:sharktallyrecord:save")
	public R save(@RequestBody SharkTallyRecordEntity sharkTallyRecord) {
		sharkTallyRecordService.save(sharkTallyRecord);

		return R.ok();
	}

	/**
	 * 修改
	 */
	@RequestMapping("/update")
	@RequiresPermissions("tally:sharktallyrecord:update")
	public R update(@RequestBody SharkTallyRecordEntity sharkTallyRecord) {
		sharkTallyRecordService.updateById(sharkTallyRecord);

		return R.ok();
	}

	/**
	 * 删除
	 */
	@RequestMapping("/delete")
	@RequiresPermissions("tally:sharktallyrecord:delete")
	public R delete(@RequestBody String[] ids) {
		sharkTallyRecordService.removeByIds(Arrays.asList(ids));

		return R.ok();
	}

}
