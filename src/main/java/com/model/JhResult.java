package com.model;

public class JhResult {
	  private int resultCode;
	  
	  private String resultMsg;
	  
	  private Object resultData;
	  
	  public JhResult() {
	    this.resultCode = 200;
	    this.resultMsg = "";
	    this.resultData = null;
	    setResultCode(200);
	  }
	  
	  public int getResultCode() {
	    return this.resultCode;
	  }
	  
	  public void setResultCode(int resultCode) {
	    this.resultCode = resultCode;
	  }
	  
	  public String getResultMsg() {
	    return this.resultMsg;
	  }
	  
	  public void setResultMsg(String resultMsg) {
	    this.resultMsg = resultMsg;
	  }
	  
	  public Object getResultData() {
	    return this.resultData;
	  }
	  
	  public void setResultData(Object resultData) {
	    this.resultData = resultData;
	  }
}