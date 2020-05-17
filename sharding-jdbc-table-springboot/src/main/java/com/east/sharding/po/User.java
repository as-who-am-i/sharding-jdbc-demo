package com.east.sharding.po;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.PrimaryKeyJoinColumn;
import java.io.Serializable;

/**
 * 分表
 *
 */
@Data
@Entity
public class User {

	@Id
	@PrimaryKeyJoinColumn
	private Long id;

	private String city ;
	
	private String name;
}
