package com.example.demo.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class KeyValueModel  {

	private Integer key;
	private String value;
	
	public KeyValueModel() {
		super();
	}
	
	public KeyValueModel(Integer key, String value) {
		super();
		this.key = key;
		this.value = value;
	}

}
