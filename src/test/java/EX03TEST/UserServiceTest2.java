package EX03TEST;

import EX02.ServiceException;
import EX02.UserService;
import EX02.Utilisateur;
import EX02.UtilisateurApi;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;
import static org.mockito.Mockito.doThrow;
import static org.mockito.Mockito.verify;
import static org.junit.jupiter.api.Assertions.*;

@RunWith(MockitoJUnitRunner.class)
public class UserServiceTest2 {
    @Mock
    private UtilisateurApi utilisateurApiMock;
    @Mock
    private UserService userService ;
    @Test
    public void testCreerUtilisateur()throws ServiceException {
// Création d'un nouvel utilisateur
        Utilisateur utilisateur = new Utilisateur("Jean", "Dupont", "jeandupont@email.com");
// TODO : Configuration du comportement du mock, utiliser la
//directive « when » avec sa méthode « thenReturn »

        doThrow(new ServiceException("Echec de la création de l'utilisateur")).when(utilisateurApiMock).creerUtilisateur(utilisateur);
// ...
// TODO : Création du service avec le mock
        UserService userService = new UserService(utilisateurApiMock);
// ...
// TODO : Appel de la méthode à tester
        try {
            userService.creerUtilisateur(utilisateur);
        } catch (ServiceException e) {
            //gerer l'exeption en cas de probleme


        }
// ...
// TODO : Vérification de l'appel à l'API
// ...
        verify(utilisateurApiMock).creerUtilisateur(utilisateur);
    }
}