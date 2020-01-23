package Entreprise;

public class UserAppMapper {

    public static  UserAppDTO  UserAppToDTO( UserApp e){
        return new  UserAppDTO(e.getId(),e.getUsername(),e.getPassword());
    }

    public static  UserApp DTOToUserApp(UserAppDTO e){
        return new UserApp(e.getId(),e.getUsername(),e.getPassword());
    }

    public static UserAppEntity UserAppToEntity(UserApp e){
       return new UserAppEntity(e.getId(), e.getUsername(),e.getPassword());
    }

    public static  UserApp EntityToUserApp( UserAppEntity e){
        return new UserApp(e.getId(),e.getUsername(),e.getPassword());
    }

}
