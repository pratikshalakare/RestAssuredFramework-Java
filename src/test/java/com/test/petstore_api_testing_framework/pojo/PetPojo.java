package com.test.petstore_api_testing_framework.pojo;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.ArrayList;
import java.util.HashMap;

import com.test.petstore_api_testing_framework.helper.Status;

@Getter
@Setter
@ToString
public class PetPojo {
	private String id;
	private String name;
	private HashMap<String, String> category;
	private ArrayList<String> photoUrls;
	private ArrayList<HashMap<String, String>> tags;
	private Status status;

}
