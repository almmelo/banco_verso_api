package banco.verso.service;

import banco.verso.model.LoggedUser;

public interface CurrentUserService {

    LoggedUser getLoggedUser();
}