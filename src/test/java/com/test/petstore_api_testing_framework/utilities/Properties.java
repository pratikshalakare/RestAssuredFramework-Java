package com.test.petstore_api_testing_framework.utilities;

public class Properties {

    private static PropertiesReader propertiesReader = new PropertiesReader();
    public static  String baseUri = propertiesReader.getBaseUri();
    public static  String createMultipleUserEndPoint = propertiesReader.getCreateMultipleUserEndPoint();
    public static  String updatePetStatusEndPoint = propertiesReader.getUpdatePetStatusEndPoint();
    public static  String updateUserDetailEndPoint = propertiesReader.getUpdateUserDetailEndPoint();
    public static  String getPetStatusEndPoint = propertiesReader.getGetPetStatusEndPoint();
    public static  String createMultiplePetEndPoint = propertiesReader.getCreateMultiplePetEndPoint();



}