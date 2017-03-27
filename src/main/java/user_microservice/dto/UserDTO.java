package user_microservice.dto;

/**
 * Created by ruaoneill on 23/03/2017.
 */

//Represents a user
public class UserDTO {

    //User attributes
    private String userName;

    //User initialization with paramters
    public UserDTO(String userName) {
        this.userName = userName;
    }

    //User getters and setters
    public String getUserName() {
        return userName;
    }
    public void setUserName(String userName) {
        this.userName = userName;
    }

}
