package EX02;

import EX02.ServiceException;
import EX02.Utilisateur;

public interface UtilisateurApi {
    int creerUtilisateur(Utilisateur utilisateur) throws ServiceException;

}
