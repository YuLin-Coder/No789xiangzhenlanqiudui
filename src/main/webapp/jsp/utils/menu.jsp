<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
var menus = [{
	"backMenu": [{
		"child": [{
			"buttons": ["新增", "修改", "删除"],
			"menu": "球员信息",
			"menuJump": "列表",
			"tableName": "yonghu"
		}],
		"menu": "球员管理"
	}, {
		"child": [{
			"buttons": ["新增", "修改", "删除"],
			"menu": "球队信息",
			"menuJump": "列表",
			"tableName": "qiudui"
		}],
		"menu": "球队管理"
	}, {
		"child": [{
			"buttons": ["新增", "修改", "删除"],
			"menu": "乡镇信息",
			"menuJump": "列表",
			"tableName": "xiangzhen"
		}],
		"menu": "乡镇管理"
	}, {
		"child": [{
			"buttons": ["新增", "修改", "删除"],
			"menu": "赛程信息",
			"menuJump": "列表",
			"tableName": "saicheng"
		}],
		"menu": "赛程管理"
	}, {
		"child": [{
			"buttons": ["新增", "修改", "删除"],
			"menu": "公告信息",
			"tableName": "xitonggonggao"
		}],
		"menu": "公告管理"
	}, {
		"child": [{
			"buttons": ["修改", "删除"],
			"menu": "留言信息",
			"tableName": "liuyanxinxi"
		}],
		"menu": "留言管理"
	}],
	"roleName": "管理员",
	"tableName": "users"
},
{
	"backMenu": [{
		"child": [{
			"buttons": [],
			"menu": "球队信息",
			"menuJump": "列表",
			"tableName": "qiudui"
		}],
		"menu": "球队管理"
	}, {
		"child": [{
			"buttons": ["新增", "修改", "删除"],
			"menu": "乡镇信息",
			"menuJump": "列表",
			"tableName": "xiangzhen"
		}],
		"menu": "乡镇管理"
	}, {
		"child": [{
			"buttons": [],
			"menu": "赛程信息",
			"menuJump": "列表",
			"tableName": "saicheng"
		}],
		"menu": "赛程管理"
	}, {
		"child": [{
			"buttons": [],
			"menu": "公告信息",
			"tableName": "xitonggonggao"
		}],
		"menu": "公告管理"
	}, {
		"child": [{
			"buttons": ["新增"],
			"menu": "留言信息",
			"tableName": "liuyanxinxi"
		}],
		"menu": "留言管理"
	}],
	"roleName": "球员",
	"tableName": "yonghu"
}
];

var hasMessage = '';
