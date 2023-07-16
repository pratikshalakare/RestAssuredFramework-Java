package com.test.petstore_api_testing_framework.helper;
import com.test.petstore_api_testing_framework.pojo.UserPojo;
import com.github.javafaker.Faker;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class UserDataCreator
{
    public static UserPojo user;
    public static Faker fake = new Faker();
    public UserPojo DataForUSerCreation() {
        user = new UserPojo();
        user.setId(fake.number().randomDigitNotZero());
        user.setUsername(fake.name().username());
        user.setFirstName(fake.name().firstName());
        user.setLastName(fake.name().lastName());
        user.setEmail(fake.internet().emailAddress());
        user.setPassword(fake.internet().password());
        user.setPhone(fake.phoneNumber().phoneNumber());
        user.setPhone(fake.numerify("+91-##########"));
        user.setUserStatus("1");
        return user;
    }
    public List<UserPojo> createUser(int numberOfUsers){

        List<UserPojo> userPojoList = new ArrayList<UserPojo>();

        for(int count=0;count<numberOfUsers;count++){

            userPojoList.add(DataForUSerCreation());
        }

        return userPojoList;
    }
}
