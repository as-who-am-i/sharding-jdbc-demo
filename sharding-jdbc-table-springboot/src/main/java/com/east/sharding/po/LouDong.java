package com.east.sharding.po;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * 不分表
 */
@Data
@Entity(name = "loudong")
public class LouDong {

	@Id
	private String id;
	
	private String city;
	
	private String region;
	
	private String name;
	
	private String ldNum;
	
	private String unitNum;
}
