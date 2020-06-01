package com.sharding.east.po;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

import java.io.Serializable;


/**
 * 不分表
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("loudong")
public class LouDong implements Serializable {

	private static final long serialVersionUID = 1L;

	@TableId
	private String id;
	
	private String city;
	
	private String region;
	
	private String name;
	
	private String ldNum;
	
	private String unitNum;
}
