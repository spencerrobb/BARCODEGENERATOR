package com.example.demo.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class KeyValueModelString {

	private String key;
	private String value;
	
	public KeyValueModelString() {
		super();
	}
	
	public KeyValueModelString(String key, String value) {
		super();
		this.key = key;
		this.value = value;
	}


	@Override
	  public boolean equals(Object obj) {
	    if (this == obj)
	      return true;
	    if (obj == null)
	      return false;
	    if (getClass() != obj.getClass())
	      return false;
	    KeyValueModelString other = (KeyValueModelString) obj;
	    if (key != other.key)
	      return false;
	    return true;
	  }
}
