package com.example.i_comit.ui.search.model;

import java.util.ArrayList;
import java.util.List;

import com.example.i_comit.R;
import com.google.gson.annotations.SerializedName;

public class KomResult {

	@SerializedName("response")
	private List<Kom> response;

	public void setResponse(List<Kom> response){
		this.response = response;
	}

	public List<Kom> getResponse(){
		return response;
	}

	@Override
 	public String toString(){
		return 
			"Response{" + 
			"response = '" + response + '\'' + 
			"}";
		}

		static ArrayList<Kom> list = new ArrayList<>();
		for (int position = 0; position <coname.length; position++){

	};
}