package com.jlw.event;

import java.util.Map;


public class LogData {
    private Map<String, String> dataMap;

	public Map<String, String> getDataMap() {
		return dataMap;
	}

	public void setDataMap(Map<String, String> dataMap) {
		this.dataMap = dataMap;
	}

	public LogData(Map<String, String> dataMap) {
		super();
		this.dataMap = dataMap;
	}

	public LogData() {
		super();
	}
    
    
    
    
}
