package com.dj.rest.example.common;


public class AjaxInfo {

    /**
     * <p>Discription:[错误请求返回状态码:400]</p>
     */
    public static final Integer FAIL_CODE = 400;

    /**
     * <p>Discription:[成功请求返回状态码:200]</p>
     */
    public static final Integer SUCCESS_CODE = 200;

    /**
     * <p>Discription:[200:成功，其他失败]</p>
     */
    private Integer code;
    /**
     * <p>Discription:[请求返回信息]</p>
     */
    private String msg;
    /**
     * <p>Discription:[请求返回数据]</p>
     */
    private Object data;

    /**
     * <p>Discription: [产生操作失败的AJAX的返回值] </p>
     * Created on: 2017/5/23 17:04
     * @param info 如果已经有实例，不需要重新生成 
     * @return AjaxInfo 包含【code】为：500 【msg】为：操作失败，请稍后再试！
     */
    public static AjaxInfo requestFail(AjaxInfo...info) {
    	AjaxInfo ajaxInfo;
        if (info==null || info.length <= 0) {
        	ajaxInfo = new AjaxInfo();
		}else{
			ajaxInfo = info[0];
		}
        ajaxInfo.setCode(FAIL_CODE);
        return ajaxInfo;
    }
    
    /**
     * <p>Discription:[判断是否返回成功]</p>
     * Created on 2017年6月20日
     * @return Boolean
     */
    public Boolean isSuccess(){
    	if (FAIL_CODE.equals(this.getCode())) {
			return false;
		}
    	return true;
    }

    /**
     * <p>Discription: [产生操作成功的AJAX的返回值] </p>
     * Created on: 2017/5/23 17:04
     *
     * @return AjaxInfo 包含【code】为：200 【msg】为：操作成功！
     */
    public static AjaxInfo requestSuccess() {
        AjaxInfo ajaxInfo = new AjaxInfo();
        ajaxInfo.setCode(SUCCESS_CODE);
        ajaxInfo.setMsg("操作成功");
        return ajaxInfo;
    }

    public Integer getCode() {
        return code;
    }

    public AjaxInfo setCode(Integer code) {
        this.code = code;
        return this;
    }

    public String getMsg() {
        return msg;
    }

    public AjaxInfo setMsg(String msg) {
        this.msg = msg;
        return this;
    }

    public Object getData() {
        return data;
    }

    public AjaxInfo setData(Object data) {
        this.data = data;
        return this;
    }
}
