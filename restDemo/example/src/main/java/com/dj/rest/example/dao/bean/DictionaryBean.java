package com.dj.rest.example.dao.bean;


import java.io.Serializable;
import java.util.Date;

/**
 * <p>Description: [字典表实体类]</p>
 * Copyright (c) 2017 北京柯莱特科技有限公司
 * Created on 2017年08月21日
 * @author  <a href="mailto: dengjiang@camelotchina.com">邓江</a>
 * @version 1.0
 */

public class DictionaryBean implements Serializable {

	/**
	 * <p>Discription:[顶级pid，0]</p>
	 **/
	public static Long TOP_PID = Long.valueOf(0);

	private Long id;//ID

	private Long pid;//父ID

	private String name;//名称

	private String code;//编码

	private String val;//值

	private String description;//描述信息

	private Integer sortNo;//排序标记

	private Boolean delFlag;//删除标记：0未删除 1删除

	private Date modifyDt;//修改时间



	/**
	 * <p>Discription:[获取ID]</p>
	 * Created on 2017年08月21日
	 * @return Long ID
	 * @author:[邓江]
	 */	
	public Long getId() {
		return id;
	}


	/**
	 * <p>Discription:[设置ID]</p>
	 * Created on 2017年08月21日
	 * @param id ID
	 * @author:[邓江]
	 */		
    public void setId(Long id) {
		this.id = id;
	}

	
	/**
	 * <p>Discription:[获取父ID]</p>
	 * Created on 2017年08月21日
	 * @return Long 父ID
	 * @author:[邓江]
	 */	
	public Long getPid() {
		return pid;
	}


	/**
	 * <p>Discription:[设置父ID]</p>
	 * Created on 2017年08月21日
	 * @param pid 父ID
	 * @author:[邓江]
	 */		
    public void setPid(Long pid) {
		this.pid = pid;
	}

	
	/**
	 * <p>Discription:[获取名称]</p>
	 * Created on 2017年08月21日
	 * @return String 名称
	 * @author:[邓江]
	 */	
	public String getName() {
		return name;
	}


	/**
	 * <p>Discription:[设置名称]</p>
	 * Created on 2017年08月21日
	 * @param name 名称
	 * @author:[邓江]
	 */		
    public void setName(String name) {
		this.name = name;
	}

	
	/**
	 * <p>Discription:[获取编码]</p>
	 * Created on 2017年08月21日
	 * @return String 编码
	 * @author:[邓江]
	 */	
	public String getCode() {
		return code;
	}


	/**
	 * <p>Discription:[设置编码]</p>
	 * Created on 2017年08月21日
	 * @param code 编码
	 * @author:[邓江]
	 */		
    public void setCode(String code) {
		this.code = code;
	}

	
	/**
	 * <p>Discription:[获取值]</p>
	 * Created on 2017年08月21日
	 * @return String 值
	 * @author:[邓江]
	 */	
	public String getVal() {
		return val;
	}


	/**
	 * <p>Discription:[设置值]</p>
	 * Created on 2017年08月21日
	 * @param val 值
	 * @author:[邓江]
	 */		
    public void setVal(String val) {
		this.val = val;
	}

	
	/**
	 * <p>Discription:[获取描述信息]</p>
	 * Created on 2017年08月21日
	 * @return String 描述信息
	 * @author:[邓江]
	 */	
	public String getDescription() {
		return description;
	}


	/**
	 * <p>Discription:[设置描述信息]</p>
	 * Created on 2017年08月21日
	 * @param description 描述信息
	 * @author:[邓江]
	 */		
    public void setDescription(String description) {
		this.description = description;
	}

	
	/**
	 * <p>Discription:[获取排序标记]</p>
	 * Created on 2017年08月21日
	 * @return Integer 排序标记
	 * @author:[邓江]
	 */	
	public Integer getSortNo() {
		return sortNo;
	}


	/**
	 * <p>Discription:[设置排序标记]</p>
	 * Created on 2017年08月21日
	 * @param sortNo 排序标记
	 * @author:[邓江]
	 */		
    public void setSortNo(Integer sortNo) {
		this.sortNo = sortNo;
	}

	
	/**
	 * <p>Discription:[获取删除标记：0未删除 1删除]</p>
	 * Created on 2017年08月21日
	 * @return Boolean 删除标记：0未删除 1删除
	 * @author:[邓江]
	 */	
	public Boolean getDelFlag() {
		return delFlag;
	}


	/**
	 * <p>Discription:[设置删除标记：0未删除 1删除]</p>
	 * Created on 2017年08月21日
	 * @param delFlag 删除标记：0未删除 1删除
	 * @author:[邓江]
	 */		
    public void setDelFlag(Boolean delFlag) {
		this.delFlag = delFlag;
	}

	
	/**
	 * <p>Discription:[获取修改时间]</p>
	 * Created on 2017年08月21日
	 * @return Date 修改时间
	 * @author:[邓江]
	 */	
	public Date getModifyDt() {
		return modifyDt;
	}


	/**
	 * <p>Discription:[设置修改时间]</p>
	 * Created on 2017年08月21日
	 * @param modifyDt 修改时间
	 * @author:[邓江]
	 */		
    public void setModifyDt(Date modifyDt) {
		this.modifyDt = modifyDt;
	}

	

}
